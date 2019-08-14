package repository;

import entity.aluno.AbstractAluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {

    // ID do usuário estático - Não é afetado por quantidade de instâncias
    private static int mAlunoId = 0;

    // Lista de alunos estática. Usada como "banco de dados"
    private static List<AbstractAluno> alunoList = new ArrayList<>();

    /**
     * Faz a criação do ID único do usuário
     */
    public static int createAlunoId() {
        return ++mAlunoId;
    }

    /**
     * Retorna lista de alunos
     */
    public List<AbstractAluno> getList() {
        return alunoList;
    }

    /**
     * Retorna aluno de acordo com o ID informado
     */
    public AbstractAluno getAluno(int id) {
        AbstractAluno aluno = null;
        for (AbstractAluno item : alunoList) {
            if (item.getId() == id) {
                aluno = item;
            }
        }
        return aluno;
    }

    /**
     * Insere um novo aluno
     */
    public void save(AbstractAluno aluno) {
        alunoList.add(aluno);
    }

    /**
     * Atualiza um aluno existente
     */
    public void update(AbstractAluno aluno) {
        for (AbstractAluno item : alunoList) {
            if (item.getId() == aluno.getId()) {

                // Atualiza os dados do aluno
                item.setNome(aluno.getNome());
                item.setSobrenome(aluno.getSobrenome());
                item.setCursoTipo(aluno.getCursoTipo());
                item.setPromocional(aluno.isPromocional());

            }
        }
    }

    /**
     * Remove um aluno
     */
    public void delete(int id) {
        int index = 0;
        for (int i = 0; i < alunoList.size(); i++) {
            if (alunoList.get(0).getId() == id) {
                index = i;
                break;
            }
        }

        alunoList.remove(index);
    }
}