/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasBanzos;

import Controller.ControladorAluno;
import java.awt.Toolkit; // importação para setar o icone

/**
 *
 * @author jejo
 */
public class TelaControlarSituacaoMatricula extends javax.swing.JFrame {

    /**
     * Creates new form TelaNovoAluno
     */
    public TelaControlarSituacaoMatricula() {
        initComponents();
        
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("BanzosIcon.png")));//para setar um icone na janela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCpfAluno = new javax.swing.JTextField();
        txtDescSituacao = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboSituacaoAluno = new javax.swing.JComboBox();
        botaoSalvarAtendente = new javax.swing.JButton();
        botaoCancelar4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        botaoCancelar8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);
        getContentPane().add(txtCpfAluno);
        txtCpfAluno.setBounds(200, 80, 110, 30);
        getContentPane().add(txtDescSituacao);
        txtDescSituacao.setBounds(200, 130, 320, 80);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/find.png"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.setRequestFocusEnabled(false);
        jToggleButton1.setRolloverEnabled(false);
        jToggleButton1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(390, 370, 30, 30);

        jFormattedTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(400, 370, 160, 30);

        jLabel3.setText("CPF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 80, 40, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botton_banzos_icon2.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 0, 160, 150);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel1.setText("Atualizar Situação");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 190, 30);

        jLabel10.setText("Descrição");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 130, 70, 30);

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel17.setText("Situações de Matrícula");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 360, 250, 30);

        jLabel18.setText("Pesquisar");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(340, 370, 60, 30);

        comboSituacaoAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Ativo", "Cancelado", "Concluído"}));
        comboSituacaoAluno.setToolTipText("M");
        comboSituacaoAluno.setName("M"); // NOI18N
        comboSituacaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSituacaoAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(comboSituacaoAluno);
        comboSituacaoAluno.setBounds(390, 80, 130, 30);
        comboSituacaoAluno.getAccessibleContext().setAccessibleName("");

        botaoSalvarAtendente.setBackground(new java.awt.Color(0, 0, 0));
        botaoSalvarAtendente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoSalvarAtendente.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/page_save.png"))); // NOI18N
        botaoSalvarAtendente.setText("Salvar");
        botaoSalvarAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAtendenteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarAtendente);
        botaoSalvarAtendente.setBounds(200, 250, 110, 30);

        botaoCancelar4.setBackground(new java.awt.Color(0, 0, 0));
        botaoCancelar4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoCancelar4.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel.png"))); // NOI18N
        botaoCancelar4.setText("Cancelar");
        botaoCancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelar4ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar4);
        botaoCancelar4.setBounds(410, 250, 109, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "João Paul", "061.987.456-25", "Ativo", "--", null},
                {"002", "Gabriel Ricardo", "987.687.754.65", "Ativo", "--", null},
                {"003", "Luana Alvez", "331.988.655-99", "Cancelado", "O aluno desistiu do curso por motivos pessoais", null},
                {"004", "Jessica Amorim", "132.454.885-74", "Concluído", "O aluno terminou o curso, e pretende faz outro ano que vem.", null},
                {"005", "Ricardo Lima", "978.556.332-35", "Ativo", "--", null},
                {"006", "Paulo Augusto", "332.661.123-31", "Concluído", "O aluno concluiu todos os cursos teórico e práticos no seu instrumento", ""},
                {"007", "Lucas Neto", "055.314.789-94", "Cancelado", "Problemas financeiros", null},
                {"008", "Matheus Pereira", "056.954.354-30", "Ativo", "--", null},
                {"009", "Jonhy Alcantara", "078.852.369-00", "Ativo", "--", null},
                {"010", "Augostinho Cunha", "005.445.114-98", "Ativo", "--", null},
                {"011", null, null, null, null, null}
            },
            new String [] {
                "Mat", "Nome", "CPF", "Situação", "Descrição", "Opções"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(4).setMinWidth(220);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 410, 760, 190);

        jLabel22.setText("Situação");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(330, 80, 140, 30);

        botaoCancelar8.setBackground(new java.awt.Color(0, 0, 0));
        botaoCancelar8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoCancelar8.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/page_attach.png"))); // NOI18N
        botaoCancelar8.setText("Editar");
        botaoCancelar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelar8ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar8);
        botaoCancelar8.setBounds(660, 370, 120, 30);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("Cadastrar  |");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        jMenuItem1.setText("Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user_gray.png"))); // NOI18N
        jMenuItem2.setText("Funcionário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/page.png"))); // NOI18N
        jMenuItem3.setText("Aproveitamento");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/music.png"))); // NOI18N
        jMenuItem4.setText("Instrumento");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/group_key.png"))); // NOI18N
        jMenuItem5.setText("Perfil de Acesso");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/money_add.png"))); // NOI18N
        jMenuItem6.setText("Planos de Matrícula");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/group_add.png"))); // NOI18N
        jMenuItem7.setText("Turmas");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/money.png"))); // NOI18N
        jMenuItem8.setText("Situação de Pagamento");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user_orange.png"))); // NOI18N
        jMenuItem9.setText("Situação de Matrícula");
        jMenu1.add(jMenuItem9);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Emitir  |");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/page_attach.png"))); // NOI18N
        jMenuItem10.setText("Histórico Escolar");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/page_green.png"))); // NOI18N
        jMenuItem11.setText("Declaração");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/page_go.png"))); // NOI18N
        jMenuItem12.setText("Certificado");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório  |");

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/table.png"))); // NOI18N
        jMenuItem13.setText("Aproveitamento");
        jMenu3.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/group.png"))); // NOI18N
        jMenuItem14.setText("Turmas");
        jMenu3.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/group_gear.png"))); // NOI18N
        jMenuItem15.setText("Professores");
        jMenu3.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/music.png"))); // NOI18N
        jMenuItem16.setText("Alunos/Instrumentos");
        jMenu3.add(jMenuItem16);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/money_delete.png"))); // NOI18N
        jMenuItem17.setText("Alunos Inadimplentes");
        jMenu3.add(jMenuItem17);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendar.png"))); // NOI18N
        jMenuItem18.setText("Alunos/Dia");
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(818, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAtendenteActionPerformed
        String cpf = txtCpfAluno.getText();
        String situacao = comboSituacaoAluno.getSelectedItem().toString();
        String descricao = txtDescSituacao.getText();
        
        ControladorAluno CA = new ControladorAluno();
        CA.AtualizarSituacaoMatricula(cpf, situacao, descricao);
    }//GEN-LAST:event_botaoSalvarAtendenteActionPerformed

    private void botaoCancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelar4ActionPerformed

    }//GEN-LAST:event_botaoCancelar4ActionPerformed

    private void comboSituacaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSituacaoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSituacaoAlunoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void botaoCancelar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCancelar8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaControlarSituacaoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaControlarSituacaoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaControlarSituacaoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaControlarSituacaoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaControlarSituacaoMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar4;
    private javax.swing.JButton botaoCancelar8;
    private javax.swing.JButton botaoSalvarAtendente;
    private javax.swing.JComboBox comboSituacaoAluno;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtCpfAluno;
    private javax.swing.JTextField txtDescSituacao;
    // End of variables declaration//GEN-END:variables

}
