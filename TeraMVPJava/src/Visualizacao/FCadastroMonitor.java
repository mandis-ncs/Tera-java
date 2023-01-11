package Visualizacao;

import Controle.Conexao;
import Modelagem.Monitor;
import Panels.ListaMonitores;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FCadastroMonitor extends javax.swing.JFrame {
    Monitor monitor = new Monitor();
    Conexao con = new Conexao();
    
    public FCadastroMonitor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeCadUsuario = new javax.swing.JTextField();
        txtCpfCadUsuario = new javax.swing.JTextField();
        txtCelularCadUsuario = new javax.swing.JTextField();
        txtEmailCadUsuario = new javax.swing.JTextField();
        txtSenhaCadUsuario = new javax.swing.JTextField();
        txtSobrenomeCadUsuario = new javax.swing.JTextField();
        txtLoginCadUsuario = new javax.swing.JTextField();
        txtTelefoneCadUsuario = new javax.swing.JTextField();
        txtConfirmarCadUsuario = new javax.swing.JTextField();
        btnProximoCadUsuario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Vamos agora ao cadastro do monitor!");

        jLabel4.setText("Registre seu Usuário para fazer parte");

        jLabel5.setForeground(new java.awt.Color(251, 133, 0));
        jLabel5.setText("do nosso time de apoio!");

        txtNomeCadUsuario.setText("Nome");
        txtNomeCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadUsuarioActionPerformed(evt);
            }
        });

        txtCpfCadUsuario.setText("CPF");
        txtCpfCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfCadUsuarioActionPerformed(evt);
            }
        });

        txtCelularCadUsuario.setText("Celular");

        txtEmailCadUsuario.setText("Email");

        txtSenhaCadUsuario.setText("Senha");

        txtSobrenomeCadUsuario.setText("Sobrenome");

        txtLoginCadUsuario.setText("Login do Usuário");
        txtLoginCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginCadUsuarioActionPerformed(evt);
            }
        });

        txtTelefoneCadUsuario.setText("Telefone");

        txtConfirmarCadUsuario.setText("Confirmar Senha");

        btnProximoCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/btn2ProximoCadCli.png"))); // NOI18N
        btnProximoCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoCadUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNomeCadUsuario)
                                        .addComponent(txtCpfCadUsuario)
                                        .addComponent(txtCelularCadUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSobrenomeCadUsuario)
                                        .addComponent(txtTelefoneCadUsuario)
                                        .addComponent(txtLoginCadUsuario)))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmailCadUsuario)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtSenhaCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtConfirmarCadUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProximoCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSobrenomeCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelularCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmailCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmarCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnProximoCadUsuario)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/iconPequenoTera.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/img2FamiliaMenor.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginCadUsuarioActionPerformed

    }//GEN-LAST:event_txtLoginCadUsuarioActionPerformed

    private void txtCpfCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfCadUsuarioActionPerformed

    }//GEN-LAST:event_txtCpfCadUsuarioActionPerformed

    private void btnProximoCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoCadUsuarioActionPerformed
        
        monitor.setCPF(txtCpfCadUsuario.getText());
        monitor.setNome(txtNomeCadUsuario.getText());
        monitor.setSobrenome(txtSobrenomeCadUsuario.getText());
        monitor.setLogin(txtLoginCadUsuario.getText());
        monitor.setCelular(txtCelularCadUsuario.getText());
        monitor.setTelefone(txtTelefoneCadUsuario.getText());
        monitor.setEmail(txtEmailCadUsuario.getText());
        monitor.setSenha(txtSenhaCadUsuario.getText());
        
        try{
            monitor.cadastrar();
        
            FVisualizacaoCadMonitor VCadMon = new FVisualizacaoCadMonitor();
            VCadMon.listarDadosCadastrais(monitor);
            VCadMon.setVisible(true);
            this.setVisible(false);
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de Opções de cadastro interno: " + erro);
        }
        
        /*ResultSet tabela;
        tabela = null;
        
        tabela = monitor.consultarUsuario();
        
        try{
            tabela.first();
            monitor.cadastrarUsuario();
            FCadPacHistMedico HistMed = new FCadPacHistMedico();
            HistMed.setVisible(true);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela " + erro);
        }*/
    }//GEN-LAST:event_btnProximoCadUsuarioActionPerformed

    private void txtNomeCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FCadastroMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadastroMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadastroMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadastroMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCadastroMonitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProximoCadUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCelularCadUsuario;
    private javax.swing.JTextField txtConfirmarCadUsuario;
    private javax.swing.JTextField txtCpfCadUsuario;
    private javax.swing.JTextField txtEmailCadUsuario;
    private javax.swing.JTextField txtLoginCadUsuario;
    private javax.swing.JTextField txtNomeCadUsuario;
    private javax.swing.JTextField txtSenhaCadUsuario;
    private javax.swing.JTextField txtSobrenomeCadUsuario;
    private javax.swing.JTextField txtTelefoneCadUsuario;
    // End of variables declaration//GEN-END:variables
}
