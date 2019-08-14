package entity.aluno;

import entity.CursoTipo;

public class Aluno extends AbstractAluno {

    public Aluno(String nome, String sobrenome, CursoTipo cursoTipo) {
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setCursoTipo(cursoTipo);
        super.setPromocional(false);
    }

    @Override
    public float getPrecoMensalidade() {
        return super.getPreco();
    }
}
