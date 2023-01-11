package Visualizacao;

import Controle.Conexao;
import Modelagem.Clinica;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FCadastroClinica extends javax.swing.JFrame {

    Clinica clinica = new Clinica();
    Conexao con = new Conexao();
    
    public FCadastroClinica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRazaoSocialCadCli = new javax.swing.JTextField();
        txtNomeFantasiaCadCli = new javax.swing.JTextField();
        txtEnderecoCadCli = new javax.swing.JTextField();
        txtCidadeCadCli = new javax.swing.JTextField();
        txtEmailCadCli = new javax.swing.JTextField();
        txtSenhaCadCli = new javax.swing.JTextField();
        txtConfirmaSenhaCadCli = new javax.swing.JTextField();
        txtCnpjCadCli = new javax.swing.JTextField();
        txtTelefoneCadCli = new javax.swing.JTextField();
        txtEstadoCadCli = new javax.swing.JTextField();
        btnProximoCadCli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Seja Bem Vindo!");

        jLabel3.setText("Registre sua Clínica para fazer parte da");

        jLabel4.setForeground(new java.awt.Color(251, 133, 0));
        jLabel4.setText("melhor forma de reeintregar!");

        txtRazaoSocialCadCli.setText("Razão Social");

        txtNomeFantasiaCadCli.setText("Nome Fantasia");
        txtNomeFantasiaCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaCadCliActionPerformed(evt);
            }
        });

        txtEnderecoCadCli.setText("Endereço");

        txtCidadeCadCli.setText("Cidade");

        txtEmailCadCli.setText("Email");

        txtSenhaCadCli.setText("Senha");

        txtConfirmaSenhaCadCli.setText("Confirmar Senha");

        txtCnpjCadCli.setText("CNPJ");

        txtTelefoneCadCli.setText("Telefone");

        txtEstadoCadCli.setText("Estado");

        btnProximoCadCli.setBackground(new java.awt.Color(251, 133, 0));
        btnProximoCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/btn2ProximoCadCli.png"))); // NOI18N
        btnProximoCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoCadCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirmaSenhaCadCli, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEnderecoCadCli)
                    .addComponent(txtEmailCadCli)
                    .addComponent(txtSenhaCadCli)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomeFantasiaCadCli, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txtRazaoSocialCadCli))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCnpjCadCli)
                            .addComponent(txtTelefoneCadCli)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCidadeCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoCadCli))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addGap(77, 77, 77))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnProximoCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazaoSocialCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpjCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFantasiaCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEnderecoCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadeCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmaSenhaCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProximoCadCli)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/img2FamiliaMenor.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/iconPequenoTera.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtNomeFantasiaCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaCadCliActionPerformed

    }//GEN-LAST:event_txtNomeFantasiaCadCliActionPerformed

    private void btnProximoCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoCadCliActionPerformed
        clinica.setCNPJ(txtCnpjCadCli.getText());
        clinica.setRazaoSocial(txtRazaoSocialCadCli.getText());
        clinica.setNomeFantasia(txtNomeFantasiaCadCli.getText());
        clinica.setTelefone(txtTelefoneCadCli.getText());
        clinica.setEndereco(txtEnderecoCadCli.getText());
        clinica.setCidade(txtCidadeCadCli.getText());
        clinica.setEstado(txtEstadoCadCli.getText());
        clinica.setEmail(txtEmailCadCli.getText());
        clinica.setSenha(txtSenhaCadCli.getText());
        
        clinica.cadastrar();
        
        try{
            FPaginaInicial PgIni = new FPaginaInicial();
            PgIni.pnlDadosClinica.listarDadosCadastrais(clinica);
            FOpcoesCadastroInterno FOpCadInt = new FOpcoesCadastroInterno();
            FOpCadInt.setVisible(true);
            this.setVisible(false);
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de Opções de cadastro interno: " + erro);
        }
        
        /*try{
            FPaginaInicial pgIni  = new FPaginaInicial();
            pgIni.pnlDadosClinica.listarDadosCadastrais(clinica);
            pgIni.setVisible(true);
            this.setVisible(false);
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Não foi possível executar a Página Inicial: " + erro);
        }*/
        /*ResultSet tabela;
        tabela = null;
        
        tabela = clinica.consultarClinica();
        
        try{
            tabela.first();
            clinica.cadastrarClinica();
            FPaginaInicial pgIni  = new FPaginaInicial();
            pgIni.listarDadosCadastrais(clinica.getCNPJ());
            pgIni.setVisible(true);
            this.setVisible(false);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela " + erro);
        }*/
    }//GEN-LAST:event_btnProximoCadCliActionPerformed

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
            java.util.logging.Logger.getLogger(FCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCadastroClinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProximoCadCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCidadeCadCli;
    private javax.swing.JTextField txtCnpjCadCli;
    private javax.swing.JTextField txtConfirmaSenhaCadCli;
    private javax.swing.JTextField txtEmailCadCli;
    private javax.swing.JTextField txtEnderecoCadCli;
    private javax.swing.JTextField txtEstadoCadCli;
    private javax.swing.JTextField txtNomeFantasiaCadCli;
    private javax.swing.JTextField txtRazaoSocialCadCli;
    private javax.swing.JTextField txtSenhaCadCli;
    private javax.swing.JTextField txtTelefoneCadCli;
    // End of variables declaration//GEN-END:variables
}
