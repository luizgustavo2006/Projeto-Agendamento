package br.senai.sp.jandira.gui;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        nomeEspecialidadeLabel = new javax.swing.JLabel();
        nomeEspecialidadeTextField = new javax.swing.JTextField();
        descricaoEspecialidadeLabel = new javax.swing.JLabel();
        descricaoEspecialidadeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(818, 545));
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(0, 204, 204));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/mais.png"))); // NOI18N
        labelTitulo.setText("Plano De Saúde - ADICIONAR");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(70, 0, 460, 90);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 820, 90);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        jPanel2.setLayout(null);

        codigoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoLabel.setText("Código:");
        jPanel2.add(codigoLabel);
        codigoLabel.setBounds(40, 20, 90, 20);

        codigoTextField.setEditable(false);
        codigoTextField.setBackground(new java.awt.Color(255, 255, 204));
        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(codigoTextField);
        codigoTextField.setBounds(40, 40, 100, 40);

        nomeEspecialidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeEspecialidadeLabel.setText("Nome da Especialidade:");
        jPanel2.add(nomeEspecialidadeLabel);
        nomeEspecialidadeLabel.setBounds(40, 100, 170, 20);

        nomeEspecialidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEspecialidadeTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nomeEspecialidadeTextField);
        nomeEspecialidadeTextField.setBounds(40, 130, 580, 40);

        descricaoEspecialidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoEspecialidadeLabel.setText("Descrição da Especialidade:");
        jPanel2.add(descricaoEspecialidadeLabel);
        descricaoEspecialidadeLabel.setBounds(40, 200, 240, 20);

        descricaoEspecialidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoEspecialidadeTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(descricaoEspecialidadeTextField);
        descricaoEspecialidadeTextField.setBounds(40, 220, 680, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 10, 760, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 820, 460);

        setSize(new java.awt.Dimension(818, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private void nomeEspecialidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEspecialidadeTextFieldActionPerformed

    }//GEN-LAST:event_nomeEspecialidadeTextFieldActionPerformed

    private void descricaoEspecialidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoEspecialidadeTextFieldActionPerformed

    }//GEN-LAST:event_descricaoEspecialidadeTextFieldActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel descricaoEspecialidadeLabel;
    private javax.swing.JTextField descricaoEspecialidadeTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel nomeEspecialidadeLabel;
    private javax.swing.JTextField nomeEspecialidadeTextField;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
