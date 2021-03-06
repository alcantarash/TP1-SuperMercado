/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

/**
 *
 * @author sheldon
 */
public class AlterarPessoaFisica extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrame2
     */
    public AlterarPessoaFisica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlAlteraNomePessoaFisica = new javax.swing.JLabel();
        jtfAlteraNomePessoaFisica = new javax.swing.JTextField();
        jlAlteraIdadePessoaFisica = new javax.swing.JLabel();
        jtfAlteraIdadePessoaFisica = new javax.swing.JTextField();
        jbAlterarPessoaFisica = new javax.swing.JButton();
        jbAlteraCancelarPessoaFisica = new javax.swing.JButton();
        jlAlteraCPFpessoaFisica = new javax.swing.JLabel();
        jtfAlteraCPFpessoaFisica = new javax.swing.JTextField();
        jlAlteraDataNascimentoPessoaFisica = new javax.swing.JLabel();
        jtfAlteraDataNascimentoPessoaFisica = new javax.swing.JTextField();
        jlAlteraEnderecoPessoaFisica = new javax.swing.JLabel();
        jtfAlteraEnderecoPessoaFisica = new javax.swing.JTextField();
        jlAlteraSexoPessoaFisica = new javax.swing.JLabel();
        jcbAlteraSexoMasculinoPessoaFisica = new javax.swing.JCheckBox();
        jcbAlteraSexoFemininoPessoaFisica = new javax.swing.JCheckBox();
        jlPesquisaPessoaFisica = new javax.swing.JLabel();
        jtfPesquisaPEssoaFisica = new javax.swing.JTextField();
        jbPesquisaPessoaFisica = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alterar Pessoa Física");

        jlAlteraNomePessoaFisica.setText("Nome:");

        jtfAlteraNomePessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAlteraNomePessoaFisicaActionPerformed(evt);
            }
        });

        jlAlteraIdadePessoaFisica.setText("Idade:");

        jbAlterarPessoaFisica.setText("Alterar");
        jbAlterarPessoaFisica.setPreferredSize(new java.awt.Dimension(74, 29));
        jbAlterarPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarPessoaFisicaActionPerformed(evt);
            }
        });

        jbAlteraCancelarPessoaFisica.setText("Cancelar");
        jbAlteraCancelarPessoaFisica.setPreferredSize(new java.awt.Dimension(74, 29));

        jlAlteraCPFpessoaFisica.setText("CPF:");

        jtfAlteraCPFpessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAlteraCPFpessoaFisicaActionPerformed(evt);
            }
        });

        jlAlteraDataNascimentoPessoaFisica.setText("Data de Nascimento:");

        jlAlteraEnderecoPessoaFisica.setText("Endereço:");

        jlAlteraSexoPessoaFisica.setText("Sexo:");

        jcbAlteraSexoMasculinoPessoaFisica.setText("Masculino");
        jcbAlteraSexoMasculinoPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlteraSexoMasculinoPessoaFisicaActionPerformed(evt);
            }
        });

        jcbAlteraSexoFemininoPessoaFisica.setText("Feminino");

        jlPesquisaPessoaFisica.setText("Digite o CPF:");

        jbPesquisaPessoaFisica.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlAlteraEnderecoPessoaFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAlteraEnderecoPessoaFisica))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAlteraDataNascimentoPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAlteraDataNascimentoPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAlteraSexoPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbAlteraSexoMasculinoPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbAlteraSexoFemininoPessoaFisica))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAlteraCPFpessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAlteraCPFpessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAlteraIdadePessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAlteraIdadePessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAlteraNomePessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAlteraNomePessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlPesquisaPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPesquisaPEssoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPesquisaPessoaFisica)))
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jbAlterarPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jbAlteraCancelarPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlPesquisaPessoaFisica)
                        .addComponent(jtfPesquisaPEssoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisaPessoaFisica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraNomePessoaFisica)
                    .addComponent(jtfAlteraNomePessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraIdadePessoaFisica)
                    .addComponent(jtfAlteraIdadePessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraSexoPessoaFisica)
                    .addComponent(jcbAlteraSexoMasculinoPessoaFisica)
                    .addComponent(jcbAlteraSexoFemininoPessoaFisica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraCPFpessoaFisica)
                    .addComponent(jtfAlteraCPFpessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraDataNascimentoPessoaFisica)
                    .addComponent(jtfAlteraDataNascimentoPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraEnderecoPessoaFisica)
                    .addComponent(jtfAlteraEnderecoPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterarPessoaFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlteraCancelarPessoaFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        setBounds(0, 0, 600, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAlteraNomePessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAlteraNomePessoaFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAlteraNomePessoaFisicaActionPerformed

    private void jbAlterarPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarPessoaFisicaActionPerformed
        AlterarPessoaFisica pFisica = new AlterarPessoaFisica();
        
        pFisica.setVisible(false);
        
    }//GEN-LAST:event_jbAlterarPessoaFisicaActionPerformed

    private void jtfAlteraCPFpessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAlteraCPFpessoaFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAlteraCPFpessoaFisicaActionPerformed

    private void jcbAlteraSexoMasculinoPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlteraSexoMasculinoPessoaFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlteraSexoMasculinoPessoaFisicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlteraCancelarPessoaFisica;
    private javax.swing.JButton jbAlterarPessoaFisica;
    private javax.swing.JButton jbPesquisaPessoaFisica;
    private javax.swing.JCheckBox jcbAlteraSexoFemininoPessoaFisica;
    private javax.swing.JCheckBox jcbAlteraSexoMasculinoPessoaFisica;
    private javax.swing.JLabel jlAlteraCPFpessoaFisica;
    private javax.swing.JLabel jlAlteraDataNascimentoPessoaFisica;
    private javax.swing.JLabel jlAlteraEnderecoPessoaFisica;
    private javax.swing.JLabel jlAlteraIdadePessoaFisica;
    private javax.swing.JLabel jlAlteraNomePessoaFisica;
    private javax.swing.JLabel jlAlteraSexoPessoaFisica;
    private javax.swing.JLabel jlPesquisaPessoaFisica;
    private javax.swing.JTextField jtfAlteraCPFpessoaFisica;
    private javax.swing.JTextField jtfAlteraDataNascimentoPessoaFisica;
    private javax.swing.JTextField jtfAlteraEnderecoPessoaFisica;
    private javax.swing.JTextField jtfAlteraIdadePessoaFisica;
    private javax.swing.JTextField jtfAlteraNomePessoaFisica;
    private javax.swing.JTextField jtfPesquisaPEssoaFisica;
    // End of variables declaration//GEN-END:variables
}
