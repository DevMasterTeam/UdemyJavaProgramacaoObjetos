package ui;

import business.AlunoBusiness;
import entity.aluno.AbstractAluno;
import entity.aluno.Aluno;
import entity.aluno.AlunoPromocional;
import entity.CursoTipo;
import infrastructure.AlunoListener;
import infrastructure.ValidationException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends FaculdadeFrame {
    private JPanel rootPanel;
    private JTextField textNome;
    private JTextField textSobrenome;
    private JRadioButton radioMatematica;
    private JRadioButton radioEngenharia;
    private JRadioButton radioInformatica;
    private JCheckBox checkPromocional;
    private JButton buttonSalvar;
    private JButton buttonSair;

    private AlunoBusiness mAlunoBusiness;
    private int mAlunoId = 0;
    private AlunoListener mAlunoListener;

    /**
     * Construtor
     */
    public UserForm(AlunoListener listener) {
        this.setContentPane(rootPanel);
        this.setSize(600, 300);
        this.setTitle("Cadastro de usuário");

        // Chama as configurações padrão
        super.defaultConfigurations();

        // Acesso a lógica de negócios
        this.mAlunoBusiness = new AlunoBusiness();
        this.mAlunoListener = listener;

        // Valores padrão
        this.radioMatematica.setSelected(true);

        // Atribui eventos
        this.setEvents();
    }

    /**
     * Salva o ID do usuário para edição
     */
    public void setAlunoId(int id) {
        this.mAlunoId = id;
        this.loadAluno();
    }

    /**
     * Carrega dados do aluno para edição
     */
    private void loadAluno() {
        AbstractAluno aluno = this.mAlunoBusiness.getAluno(this.mAlunoId);
        this.textNome.setText(aluno.getNome());
        this.textSobrenome.setText(aluno.getSobrenome());
        this.checkPromocional.setSelected(aluno.isPromocional());

        this.radioEngenharia.setSelected(aluno.getCursoTipo() == CursoTipo.ENGENHARIA);
        this.radioInformatica.setSelected(aluno.getCursoTipo() == CursoTipo.INFORMATICA);
        this.radioMatematica.setSelected(aluno.getCursoTipo() == CursoTipo.MATEMATICA);
    }

    /**
     * Atribui eventos aos elementos da interface
     */
    private void setEvents() {
        this.buttonSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        this.buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSave();
            }
        });
    }

    /**
     * Faz o tratamento para salvar os dados do usuário
     */
    private void handleSave() {

        try {
            String nome = textNome.getText();
            String sobrenome = textSobrenome.getText();

            CursoTipo cursoTipo;
            if (radioEngenharia.isSelected())
                cursoTipo = CursoTipo.ENGENHARIA;
            else if (radioInformatica.isSelected())
                cursoTipo = CursoTipo.INFORMATICA;
            else
                cursoTipo = CursoTipo.MATEMATICA;

            boolean promocional = checkPromocional.isSelected();

            // Cria aluno com os dados informados
            AbstractAluno aluno = null;
            if (promocional)
                aluno = new AlunoPromocional(nome, sobrenome, cursoTipo);
            else
                aluno = new Aluno(nome, sobrenome, cursoTipo);

            // Faz a validação antes de prosseguir para salvar ou atualizar
            this.mAlunoBusiness.validateSave(aluno);

            // Salva aluno
            if (this.mAlunoId == 0) {
                this.mAlunoBusiness.save(aluno);
            } else {
                aluno.setId(this.mAlunoId);
                this.mAlunoBusiness.update(aluno);
            }

            // Atualiza a listagem de alunos e fecha a tela de edição
            this.mAlunoListener.onClose();
            dispose();

        } catch (ValidationException e) {
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Campo obrigatório!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
