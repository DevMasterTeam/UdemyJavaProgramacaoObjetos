package ui;

import business.AlunoBusiness;
import entity.aluno.AbstractAluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pagamento extends FaculdadeFrame {
    private JPanel rootPanel;
    private JLabel labelNome;
    private JLabel labelCurso;
    private JButton buttonFechar;
    private JLabel labelValor;

    private AlunoBusiness mAlunoBusiness;

    /**
     * Construtor
     */
    public Pagamento() {
        this.setContentPane(rootPanel);
        this.setSize(600, 200);
        this.setTitle("Pagamento");

        // Chama as configurações padrão
        super.defaultConfigurations();

        // Acesso a lógica de negócios
        this.mAlunoBusiness = new AlunoBusiness();

        // Atribui eventos
        this.setEvents();
    }

    /**
     * Atribui eventos aos elementos da interface
     */
    private void setEvents() {

        // Fecha a mensalidade
        this.buttonFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }

    /**
     * Carrega os dados do usuário e pagamento de mensalidade
     */
    public void loadPagamento(int alunoId) {

        AbstractAluno aluno = this.mAlunoBusiness.getAluno(alunoId);
        this.labelNome.setText(aluno.getNome() + " " + aluno.getSobrenome());
        this.labelCurso.setText(aluno.getCursoTipo().toString());
        this.labelValor.setText(String.format("R$ %.2f", aluno.getPrecoMensalidade()));

    }

}
