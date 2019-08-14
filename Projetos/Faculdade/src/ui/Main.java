package ui;

import business.AlunoBusiness;
import entity.aluno.AbstractAluno;
import entity.Inscricoes;
import infrastructure.AlunoListener;
import infrastructure.ValidationException;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Main extends FaculdadeFrame {
    private JPanel rootPanel;
    private JButton buttonNovoAluno;
    private JButton buttonMensalidade;
    private JButton buttonExcluir;
    private JButton buttonEditar;
    private JTable tableAlunos;
    private JLabel labelMatematica;
    private JLabel labelInformatica;
    private JLabel labelEngenharia;

    private AlunoBusiness mAlunoBusiness;
    private int mAlunoId = 0;

    /**
     * Construtor
     */
    public Main() {
        this.setContentPane(rootPanel);
        this.setSize(800, 450);
        this.setTitle("Faculdade YEST");

        // Chama as configurações padrão
        super.defaultConfigurations();

        // Aplicação fecha ao fechar uma janela
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Acesso a lógica de negócios
        this.mAlunoBusiness = new AlunoBusiness();

        // Atribui eventos
        this.setEvents();

        // Carrega dados
        this.loadData();
    }

    /**
     * Atribui eventos aos elementos da interface
     */
    private void setEvents() {

        // Novo aluno
        this.buttonNovoAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserForm(new AlunoListener() {
                    @Override
                    public void onClose() {
                        loadData();
                    }
                });
            }
        });

        // Editar aluno
        this.buttonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mAlunoId == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "É necessário selecionar um aluno.", "Aluno não selecionado", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                UserForm userForm = new UserForm(new AlunoListener() {
                    @Override
                    public void onClose() {
                        loadData();
                    }
                });
                userForm.setAlunoId(mAlunoId);
            }
        });

        // Excluir aluno
        this.buttonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mAlunoBusiness.delete(mAlunoId);

                    // Ao remover um aluno, limpar o ID armazenado
                    mAlunoId = 0;

                    // Atualizar a listagem e informações de inscrições
                    loadData();
                } catch (ValidationException excp) {
                    JOptionPane.showMessageDialog(new JFrame(), excp.getMessage(), "Aluno não selecionado", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Gera boleto de mensalidade
        this.buttonMensalidade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (mAlunoId == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "É necessário selecionar um aluno.", "Aluno não selecionado", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Pagamento pagamento = new Pagamento();
                pagamento.loadPagamento(mAlunoId);
            }
        });

        // Seleção na lista de alunos
        this.tableAlunos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {

                    // Obtém o valor da linha que foi clicada
                    if (tableAlunos.getSelectedRow() != -1) {
                        mAlunoId = Integer.parseInt(tableAlunos.getModel().getValueAt(tableAlunos.getSelectedRow(), 4).toString());
                    }
                }
            }
        });
    }

    /**
     * Carrega a lista de alunos e a quantidade de alunos inscritos em cada curso
     */
    private void loadData() {

        // Lista de alunos
        List<AbstractAluno> alunoList = this.mAlunoBusiness.getList();

        // Java Swing - Cria o modelo que será usado na tabela
        String[] columnNames = {"Nome", "Sobrenome", "Curso", "Promocional", "Id"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);

        for (AbstractAluno aluno : alunoList) {
            Object[] o = new Object[5];
            o[0] = aluno.getNome();
            o[1] = aluno.getSobrenome();
            o[2] = aluno.getCursoTipo();
            o[3] = aluno.isPromocional() ? "Sim" : "Não";
            o[4] = aluno.getId();

            model.addRow(o);
        }

        // Atribui os valores preenchidos à tabela
        this.tableAlunos.clearSelection();
        this.tableAlunos.setModel(model);

        // Remove a coluna ID
        tableAlunos.removeColumn(tableAlunos.getColumnModel().getColumn(4));

        // Atualiza contagem de alunos em cada curso
        Inscricoes inscricoes = this.mAlunoBusiness.getInscricoes();
        this.labelEngenharia.setText("Engenharia: " + inscricoes.getEngenharia());
        this.labelInformatica.setText("Informática: " + inscricoes.getInformatica());
        this.labelMatematica.setText("Matemática: " + inscricoes.getMatematica());
    }

}