package Visualizacao;
    
import Controle.Conexao;
import Modelagem.HistMed2;
import Visualizacao.FVisualizacaoHistMed;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FCadPacHistMedico extends javax.swing.JFrame {
    HistMed2 hMed = new HistMed2();
    Conexao con = new Conexao();
    
    public FCadPacHistMedico() {
        initComponents(); 
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtAdmissaoHistMed = new javax.swing.JTextField();
        txtDiagnosticoHistMed = new javax.swing.JTextField();
        txtAltaHistMed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescPacHistMed = new javax.swing.JTextArea();
        btnAlterarHistMed = new javax.swing.JButton();
        btnSalvarHistMed = new javax.swing.JButton();
        btnExcluirHistMed = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtMedicacaoHistMed = new javax.swing.JTextField();
        txtCpfPacHistMed = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/2HistMed.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Histórico Médico");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/calendar2HistMed.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/bandeira2HistMed.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/desc2Hist.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/mais2HistMed.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/pills2HistMed.png"))); // NOI18N

        jLabel11.setText("Diagnóstico:");

        jLabel12.setText("Adimitido em:");

        jLabel13.setText("Medicações:");

        jLabel14.setText("Alta em:");

        jLabel16.setText("Descrição:");

        txtAdmissaoHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissaoHistMedActionPerformed(evt);
            }
        });

        txtDiagnosticoHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosticoHistMedActionPerformed(evt);
            }
        });

        txtAltaHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltaHistMedActionPerformed(evt);
            }
        });

        txtDescPacHistMed.setColumns(20);
        txtDescPacHistMed.setRows(5);
        jScrollPane1.setViewportView(txtDescPacHistMed);

        btnAlterarHistMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/btnAlterar.png"))); // NOI18N
        btnAlterarHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarHistMedActionPerformed(evt);
            }
        });

        btnSalvarHistMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/btnSalvar.png"))); // NOI18N
        btnSalvarHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarHistMedActionPerformed(evt);
            }
        });

        btnExcluirHistMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/btnExcluir.png"))); // NOI18N
        btnExcluirHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirHistMedActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/Aba2HistMed.png"))); // NOI18N

        txtMedicacaoHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicacaoHistMedActionPerformed(evt);
            }
        });

        txtCpfPacHistMed.setToolTipText("");
        txtCpfPacHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfPacHistMedActionPerformed(evt);
            }
        });

        jLabel15.setText("CPF:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAlterarHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnSalvarHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtAdmissaoHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(182, 182, 182)
                                        .addComponent(btnExcluirHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMedicacaoHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(167, 167, 167)
                                        .addComponent(txtAltaHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCpfPacHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDiagnosticoHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel9)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCpfPacHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtDiagnosticoHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtAltaHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAdmissaoHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtMedicacaoHistMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluirHistMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarHistMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarHistMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/iconTeraHistMed.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/navbarHistMed.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiagnosticoHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosticoHistMedActionPerformed
      
    }//GEN-LAST:event_txtDiagnosticoHistMedActionPerformed

    private void txtAdmissaoHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissaoHistMedActionPerformed
        
    }//GEN-LAST:event_txtAdmissaoHistMedActionPerformed

    private void txtAltaHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltaHistMedActionPerformed
        
    }//GEN-LAST:event_txtAltaHistMedActionPerformed

    private void txtMedicacaoHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicacaoHistMedActionPerformed
      
    }//GEN-LAST:event_txtMedicacaoHistMedActionPerformed

    private void btnAlterarHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarHistMedActionPerformed
        hMed.setDiagnosticoHistMed(txtDiagnosticoHistMed.getText());
        hMed.setAdmissaoHistMed(txtAdmissaoHistMed.getText());
        hMed.setAltaHistMed(txtAltaHistMed.getText());
        hMed.setMedicacaoHistMed(txtMedicacaoHistMed.getText());
        hMed.setDescPacHistMed(txtDescPacHistMed.getText());
        hMed.setCpfPacHistMed(txtCpfPacHistMed.getText());
        hMed.alterar();  
    }//GEN-LAST:event_btnAlterarHistMedActionPerformed

    private void btnSalvarHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarHistMedActionPerformed
        hMed.setDiagnosticoHistMed(txtDiagnosticoHistMed.getText());
        hMed.setAdmissaoHistMed(txtAdmissaoHistMed.getText());
        hMed.setAltaHistMed(txtAltaHistMed.getText());
        hMed.setMedicacaoHistMed(txtMedicacaoHistMed.getText());
        hMed.setDescPacHistMed(txtDescPacHistMed.getText());
        hMed.setCpfPacHistMed(txtCpfPacHistMed.getText());
        
         
        ResultSet tabela;
        tabela = null;
    
        tabela = hMed.consultarHistMed();
        /*DefaultTableModel modelo = (DefaultTableModel) tabela.getModel(); /*quero demonstrar esse cadastro só em outra tela de outro formulario*/
        /*modelo.setNumRows(0);*/
    
        try{
            tabela.first();
            hMed.salvar();
            JOptionPane.showMessageDialog(null, "Cadastrado!");

            

            String amanda = tabela.getString(0);
  
        }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao preencher tabela " + erro) ;    
        }
         
    }//GEN-LAST:event_btnSalvarHistMedActionPerformed

    private void btnExcluirHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirHistMedActionPerformed
    
        hMed.setDiagnosticoHistMed(txtDiagnosticoHistMed.getText());
        hMed.setAdmissaoHistMed(txtAdmissaoHistMed.getText());
        hMed.setAltaHistMed(txtAltaHistMed.getText());
        hMed.setMedicacaoHistMed(txtMedicacaoHistMed.getText());
        hMed.setDescPacHistMed(txtDescPacHistMed.getText());
        hMed.setCpfPacHistMed(txtCpfPacHistMed.getText());
    }//GEN-LAST:event_btnExcluirHistMedActionPerformed

    /*private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        usu.setCodigo(Integer.parseInt(txtCodigo.getText()));
        usu.setLogin(txtLogin.getText());        
        usu.setSenha(txtSenha.getText());
        usu.setTelefone(txtTelefone.getText());
        usu.alterar();
    }                                          

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        usu.setCodigo(Integer.parseInt(txtCodigo.getText()));
        usu.excluir();
    }     */
    
    private void txtCpfPacHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfPacHistMedActionPerformed
        
    }//GEN-LAST:event_txtCpfPacHistMedActionPerformed

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
            java.util.logging.Logger.getLogger(FCadPacHistMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadPacHistMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadPacHistMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadPacHistMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCadPacHistMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarHistMed;
    private javax.swing.JButton btnExcluirHistMed;
    private javax.swing.JButton btnSalvarHistMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtAdmissaoHistMed;
    private javax.swing.JTextField txtAltaHistMed;
    private javax.swing.JTextField txtCpfPacHistMed;
    private javax.swing.JTextArea txtDescPacHistMed;
    private javax.swing.JTextField txtDiagnosticoHistMed;
    private javax.swing.JTextField txtMedicacaoHistMed;
    // End of variables declaration//GEN-END:variables
}
