package Panels;

import Modelagem.Monitor;
import Modelagem.Monitor;
import Modelagem.Monitor;
import Visualizacao.FOpcoesCadastroInterno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DadosMonitor extends javax.swing.JPanel {
    Connection conn = null;
    PreparedStatement pstmt = null;
        
    public void listarDadosCadastrais(Monitor monitor){
          
        try{
            monitor.getMonitor(monitor.getCPF());
            
            this.lblId.setText(String.valueOf(monitor.getId()));
            this.txtNome.setText(monitor.getNome());
            this.txtSobrenome.setText(monitor.getSobrenome());
            this.txtCPF.setText(monitor.getCPF());
            this.txtTelefone.setText(monitor.getTelefone());
            this.txtCelular.setText(monitor.getCelular());
            this.txtLogin.setText(monitor.getLogin());
            this.txtEmail.setText(monitor.getEmail());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher os dados " + erro);
        }
        
        
    }
    public void editarDadosCadastrais(boolean x){
        this.txtNome.setEditable(x);
        this.txtSobrenome.setEditable(x);
        this.txtCPF.setEditable(x);
        this.txtLogin.setEditable(x);
        this.txtTelefone.setEditable(x);
        this.txtCelular.setEditable(x);
        this.txtEmail.setEditable(x);
    }
    public DadosMonitor() {
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
        btnExcluir = new Swing.ButtonRounded();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAlterar = new Swing.ButtonRounded();
        lblId = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSalvar = new Swing.ButtonRounded();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(658, 448));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dados Cadastrais");

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Sobrenome:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Celular");

        jLabel7.setText("E-mail:");

        btnExcluir.setBackground(new java.awt.Color(251, 133, 0));
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 133, 0)));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtNome.setEditable(false);

        txtSobrenome.setEditable(false);

        txtTelefone.setEditable(false);

        txtCPF.setEditable(false);
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtCelular.setEditable(false);

        txtEmail.setEditable(false);

        btnAlterar.setBackground(new java.awt.Color(251, 133, 0));
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 133, 0)));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setEnabled(false);
        lblId.setMinimumSize(new java.awt.Dimension(1, 1));
        lblId.setPreferredSize(new java.awt.Dimension(3, 3));

        txtLogin.setEditable(false);
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jLabel10.setText("Login:");

        btnSalvar.setBackground(new java.awt.Color(251, 133, 0));
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 133, 0)));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(154, 154, 154))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(164, 164, 164)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel2))
                                    .addGap(127, 127, 127)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(2, 2, 2)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(24, 24, 24)))
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Monitor monitor = new Monitor();
        monitor.setId(Integer.parseInt(lblId.getText()));
        
        try{
            monitor.excluir(monitor.getId());
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
            FOpcoesCadastroInterno OpCadInt = new FOpcoesCadastroInterno();
            OpCadInt.setVisible(true);

        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar exclusão: " + erro);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed

    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.editarDadosCadastrais(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Monitor monitor = new Monitor();

        monitor.setId(Integer.parseInt(this.lblId.getText()));
        monitor.setCPF(this.txtCPF.getText());
        monitor.setNome(this.txtNome.getText());
        monitor.setSobrenome(this.txtSobrenome.getText());
        monitor.setTelefone(this.txtTelefone.getText());
        monitor.setLogin(this.txtLogin.getText());
        monitor.setCelular(this.txtCelular.getText());
        monitor.setEmail(this.txtEmail.getText());

        monitor.alterar(monitor);

        this.listarDadosCadastrais(monitor);
        this.editarDadosCadastrais(false);
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonRounded btnAlterar;
    private Swing.ButtonRounded btnExcluir;
    private Swing.ButtonRounded btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
