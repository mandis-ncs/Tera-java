package Panels;


import Modelagem.Clinica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DadosClinica extends javax.swing.JPanel {
    Connection conn = null;
    PreparedStatement pstmt = null;
        
    public void listarDadosCadastrais(Clinica clinica){
          
        try{
            clinica.getClinica(clinica.getCNPJ());
            
            this.lblId.setText(String.valueOf(clinica.getId()));
            this.txtCNPJ.setText(clinica.getCNPJ());
            this.txtRazaoSocial.setText(clinica.getRazaoSocial());
            this.txtNomeFantasia.setText(clinica.getNomeFantasia());
            this.txtTelefone.setText(clinica.getTelefone());
            this.txtEndereco.setText(clinica.getEndereco());
            this.txtCidade.setText(clinica.getCidade());
            this.txtEstado.setText(clinica.getEstado());
            this.txtEmail.setText(clinica.getEmail());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher os dados " + erro);
        }
        
        
    }
    public void editarDadosCadastrais(boolean x){
        this.txtRazaoSocial.setEditable(x);
        this.txtNomeFantasia.setEditable(x);
        this.txtTelefone.setEditable(x);
        this.txtEndereco.setEditable(x);
        this.txtCidade.setEditable(x);
        this.txtEstado.setEditable(x);
        this.txtEmail.setEditable(x);
        
        this.btnSalvar.setEnabled(x);
    }
    public DadosClinica() {
        initComponents();
        this.lblId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new Swing.ButtonRounded();
        txtRazaoSocial = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAlterar = new Swing.ButtonRounded();
        lblId = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(658, 448));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dados Cadastrais");

        jLabel1.setText("Razão Social:");

        jLabel2.setText("Nome Fantasia:");

        jLabel3.setText("CNPJ:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Endereço:");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Estado:");

        jLabel9.setText("E-mail:");

        btnSalvar.setBackground(new java.awt.Color(251, 133, 0));
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 133, 0)));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtRazaoSocial.setEditable(false);

        txtCNPJ.setEditable(false);

        txtTelefone.setEditable(false);

        txtNomeFantasia.setEditable(false);
        txtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaActionPerformed(evt);
            }
        });

        txtEstado.setEditable(false);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        txtEndereco.setEditable(false);

        txtCidade.setEditable(false);

        txtEmail.setEditable(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(251, 133, 0));
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 133, 0)));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblId.setEnabled(false);
        lblId.setMinimumSize(new java.awt.Dimension(1, 1));
        lblId.setPreferredSize(new java.awt.Dimension(3, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(txtRazaoSocial)
                                        .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel7))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3)
                                                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(2, 2, 2)
                                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.editarDadosCadastrais(true);
        this.btnAlterar.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaActionPerformed

    }//GEN-LAST:event_txtNomeFantasiaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Clinica clinica = new Clinica();

        clinica.setId(Integer.parseInt(this.lblId.getText()));
        clinica.setCNPJ(this.txtCNPJ.getText());
        clinica.setRazaoSocial(this.txtRazaoSocial.getText());
        clinica.setNomeFantasia(this.txtNomeFantasia.getText());
        clinica.setTelefone(this.txtTelefone.getText());
        clinica.setEndereco(this.txtEndereco.getText());
        clinica.setCidade(this.txtCidade.getText());
        clinica.setEstado(this.txtEstado.getText());
        clinica.setEmail(this.txtEmail.getText());

        clinica.alterar(clinica);

        this.listarDadosCadastrais(clinica);
        this.editarDadosCadastrais(false);
        this.btnAlterar.setEnabled(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonRounded btnAlterar;
    private Swing.ButtonRounded btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
