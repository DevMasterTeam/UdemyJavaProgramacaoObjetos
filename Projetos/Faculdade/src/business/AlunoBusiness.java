package business;

import entity.aluno.AbstractAluno;
import entity.CursoTipo;
import entity.Inscricoes;
import infrastructure.ValidationException;
import repository.AlunoRepository;

import java.util.List;

public class AlunoBusiness {

    // Acesso a dados
    private AlunoRepository mAlunoRepository;

    /**
     * Construtor
     */
    public AlunoBusiness() {
        this.mAlunoRepository = new AlunoRepository();
    }

    /**
     * Faz a criação do ID único para um aluno
     */
    private int createAlunoId() {
        return AlunoRepository.createAlunoId();
    }

    /**
     * Retorna lista de alunos
     */
    public List<AbstractAluno> getList() {
        return this.mAlunoRepository.getList();
    }

    /**
     * Carrega a quantidade de alunos inscritos em cada curso
     */
    public Inscricoes getInscricoes() {
        Inscricoes inscricoes = new Inscricoes();

        List<AbstractAluno> alunos = this.mAlunoRepository.getList();
        for (AbstractAluno aluno : alunos) {
            if (aluno.getCursoTipo().equals(CursoTipo.INFORMATICA))
                inscricoes.setInformatica(inscricoes.getInformatica() + 1);
            else if (aluno.getCursoTipo().equals(CursoTipo.ENGENHARIA))
                inscricoes.setEngenharia(inscricoes.getEngenharia() + 1);
            else
                inscricoes.setMatematica(inscricoes.getMatematica() + 1);
        }

        return inscricoes;
    }

    /**
     * Faz a validação dos dados obrigatórios
     * Se tudo estiver correto, uma exceção de validação não será lançada
     */
    public void validateSave(AbstractAluno aluno) throws ValidationException {

        if (aluno.getNome() == null || aluno.getNome().equals("")) {
            throw new ValidationException("Nome obrigatório!");
        }

        if (aluno.getSobrenome() == null || aluno.getSobrenome().equals("")) {
            throw new ValidationException("Sobremome obrigatório!");
        }

    }

    /**
     * Retorna aluno de acordo com o ID informado
     */
    public AbstractAluno getAluno(int id) {
        return this.mAlunoRepository.getAluno(id);
    }

    /**
     * Insere um novo aluno
     */
    public void save(AbstractAluno aluno) {
        aluno.setId(this.createAlunoId());
        this.mAlunoRepository.save(aluno);
    }

    /**
     * Atualiza um aluno existente
     */
    public void update(AbstractAluno aluno) {
        this.mAlunoRepository.update(aluno);
    }

    /**
     * Remove um aluno
     */
    public void delete(int id) throws ValidationException {
        if (id == 0) {
            throw new ValidationException("É necessário selecionar um aluno.");
        }
        this.mAlunoRepository.delete(id);
    }

}
