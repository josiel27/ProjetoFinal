/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasBanzos;
import java.awt.Toolkit;


/**
 *
 * @author jejo
 */
public class TelaEmitirCertificado extends javax.swing.JFrame {

    /**
     * Creates new form TelaNovoOrcamento
     */
    public TelaEmitirCertificado() {
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

        botaoSalvarAtendente3 = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botaoSalvarAtendente4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
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
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Certificado");
        setMaximumSize(new java.awt.Dimension(880, 620));
        setMinimumSize(new java.awt.Dimension(880, 620));
        getContentPane().setLayout(null);

        botaoSalvarAtendente3.setBackground(new java.awt.Color(0, 0, 0));
        botaoSalvarAtendente3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoSalvarAtendente3.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarAtendente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/table.png"))); // NOI18N
        botaoSalvarAtendente3.setText("Gerar Certificado");
        getContentPane().add(botaoSalvarAtendente3);
        botaoSalvarAtendente3.setBounds(50, 210, 180, 30);

        botaoCancelar.setBackground(new java.awt.Color(0, 0, 0));
        botaoCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(160, 510, 109, 30);

        jLabel6.setText("Consultar Aproveitamento do Aluno");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 130, 200, 30);

        botaoSalvarAtendente4.setBackground(new java.awt.Color(0, 0, 0));
        botaoSalvarAtendente4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoSalvarAtendente4.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarAtendente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/page_save.png"))); // NOI18N
        botaoSalvarAtendente4.setText("Imprimir");
        getContentPane().add(botaoSalvarAtendente4);
        botaoSalvarAtendente4.setBounds(30, 510, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel7.setText("Emissão de Certificado");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 30, 430, 30);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel8.setText("21 de Abril de 2015 à 21de Novembro de 2015,");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(230, 250, 250, 30);

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel5.setText("Prática Violão Iniciante A,");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(280, 210, 160, 20);

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        jLabel2.setText("Carlos Henrique Alcantra,");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(260, 150, 200, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/certificadoRedimensionado.png"))); // NOI18N
        jPanel6.add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 410);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(290, 130, 550, 410);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/find.png"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.setRequestFocusEnabled(false);
        jToggleButton1.setRolloverEnabled(false);
        jToggleButton1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(40, 160, 30, 30);

        jFormattedTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(50, 160, 180, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botton_banzos_icon2.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(710, 10, 130, 110);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("Cadastrar");

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

        jMenu4.setText("|");
        jMenuBar1.add(jMenu4);

        jMenu2.setText("Emitir");

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

        jMenu5.setText("|");
        jMenuBar1.add(jMenu5);

        jMenu3.setText("Relatório");

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

        jMenu6.setText("|");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaEmitirCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmitirCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmitirCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmitirCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaEmitirCertificado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvarAtendente3;
    private javax.swing.JButton botaoSalvarAtendente4;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables


}
