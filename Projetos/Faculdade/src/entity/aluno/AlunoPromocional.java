package entity.aluno;

import entity.CursoTipo;

public class AlunoPromocional extends AbstractAluno {

    public AlunoPromocional(String nome, String sobrenome, CursoTipo cursoTipo) {
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setCursoTipo(cursoTipo);
        super.setPromocional(true);
    }

    @Override
    public float getPrecoMensalidade() {
        return super.getPreco() * 0.7f;
    }
}
