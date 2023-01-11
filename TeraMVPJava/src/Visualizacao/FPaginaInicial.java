package Visualizacao;

import Panels.DadosClinica;
import Panels.DadosMonitor;
import Panels.ListaMonitores;
import Panels.DadosPaciente;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class FPaginaInicial extends javax.swing.JFrame {    
    DadosClinica pnlDadosClinica = new DadosClinica();
    DadosMonitor pnlDadosMonitor = new DadosMonitor();
    
    public FPaginaInicial() {
        initComponents();
        
        abrirPanel(pnlDadosClinica);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRounded1 = new Swing.PanelRounded();
        labelRounded1 = new Swing.LabelRounded();
        labelRounded3 = new Swing.LabelRounded();
        jPanel2 = new javax.swing.JPanel();
        panelRounded2 = new Swing.PanelRounded();
        lblDadosClinica = new Swing.LabelRounded();
        lblDadosMonitores = new Swing.LabelRounded();
        pnlContent = new Swing.PanelRounded();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 48, 71));

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 531));

        panelRounded1.setBackground(new java.awt.Color(251, 133, 0));
        panelRounded1.setRoundBottomLeft(50);
        panelRounded1.setRoundBottomRight(50);
        panelRounded1.setRoundTopLeft(50);
        panelRounded1.setRoundTopRight(50);

        labelRounded1.setBackground(new java.awt.Color(2, 48, 71));
        labelRounded1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRounded1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/iconDados.png"))); // NOI18N
        labelRounded1.setRoundBottomLeft(33);
        labelRounded1.setRoundBottomRight(33);
        labelRounded1.setRoundTopLeft(33);
        labelRounded1.setRoundTopRight(33);
        labelRounded1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRounded1MouseClicked(evt);
            }
        });

        labelRounded3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRounded3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/iconAdicionar.png"))); // NOI18N
        labelRounded3.setPreferredSize(new java.awt.Dimension(33, 33));
        labelRounded3.setRoundBottomLeft(33);
        labelRounded3.setRoundBottomRight(33);
        labelRounded3.setRoundTopLeft(33);
        labelRounded3.setRoundTopRight(33);
        labelRounded3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRounded3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRounded1Layout = new javax.swing.GroupLayout(panelRounded1);
        panelRounded1.setLayout(panelRounded1Layout);
        panelRounded1Layout.setHorizontalGroup(
            panelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRounded1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRounded3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRounded1Layout.setVerticalGroup(
            panelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(labelRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(658, 448));

        panelRounded2.setBackground(new java.awt.Color(2, 48, 71));
        panelRounded2.setAlignmentX(2.0F);
        panelRounded2.setRoundBottomLeft(30);
        panelRounded2.setRoundBottomRight(30);
        panelRounded2.setRoundTopLeft(30);
        panelRounded2.setRoundTopRight(30);

        lblDadosClinica.setBackground(new java.awt.Color(251, 133, 0));
        lblDadosClinica.setForeground(new java.awt.Color(255, 255, 255));
        lblDadosClinica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosClinica.setText("Dados Clínica");
        lblDadosClinica.setMaximumSize(new java.awt.Dimension(114, 24));
        lblDadosClinica.setPreferredSize(new java.awt.Dimension(114, 24));
        lblDadosClinica.setRoundBottomLeft(30);
        lblDadosClinica.setRoundBottomRight(30);
        lblDadosClinica.setRoundTopLeft(30);
        lblDadosClinica.setRoundTopRight(30);
        lblDadosClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDadosClinicaMouseClicked(evt);
            }
        });

        lblDadosMonitores.setForeground(new java.awt.Color(255, 255, 255));
        lblDadosMonitores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosMonitores.setText("Dados Monitor");
        lblDadosMonitores.setMaximumSize(new java.awt.Dimension(114, 48));
        lblDadosMonitores.setPreferredSize(new java.awt.Dimension(114, 24));
        lblDadosMonitores.setRoundBottomLeft(30);
        lblDadosMonitores.setRoundBottomRight(30);
        lblDadosMonitores.setRoundTopLeft(30);
        lblDadosMonitores.setRoundTopRight(30);
        lblDadosMonitores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDadosMonitoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRounded2Layout = new javax.swing.GroupLayout(panelRounded2);
        panelRounded2.setLayout(panelRounded2Layout);
        panelRounded2Layout.setHorizontalGroup(
            panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded2Layout.createSequentialGroup()
                .addComponent(lblDadosClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDadosMonitores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        panelRounded2Layout.setVerticalGroup(
            panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDadosClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDadosMonitores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(panelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void abrirPanel(JPanel p){
        p.setSize(658, 398);
        p.setLocation(0, 0);
        
        this.pnlContent.removeAll();
        this.pnlContent.add(p, BorderLayout.CENTER);
        this.pnlContent.revalidate();
        this.pnlContent.repaint();
    }
    
    private void lblDadosClinicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDadosClinicaMouseClicked
        lblDadosClinica.setBackground(new Color(251,133,0));
        lblDadosMonitores.setBackground(new Color(0f,0f,0f));
        
        
        abrirPanel(pnlDadosClinica);
    }//GEN-LAST:event_lblDadosClinicaMouseClicked

    private void lblDadosMonitoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDadosMonitoresMouseClicked
        lblDadosClinica.setBackground(new Color(0f,0f,0f));
        lblDadosMonitores.setBackground(new Color(251,133,0));
        
        
        abrirPanel(pnlDadosMonitor);
    }//GEN-LAST:event_lblDadosMonitoresMouseClicked

    private void labelRounded1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRounded1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRounded1MouseClicked

    private void labelRounded3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRounded3MouseClicked
        
    }//GEN-LAST:event_labelRounded3MouseClicked

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
            java.util.logging.Logger.getLogger(FPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Swing.LabelRounded labelRounded1;
    private Swing.LabelRounded labelRounded3;
    private Swing.LabelRounded lblDadosClinica;
    private Swing.LabelRounded lblDadosMonitores;
    private Swing.PanelRounded panelRounded1;
    private Swing.PanelRounded panelRounded2;
    private Swing.PanelRounded pnlContent;
    // End of variables declaration//GEN-END:variables
}
