/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

/**
 *
 * @author Sheldon
 */
public class AlterarProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarProduto
     */
    public AlterarProdutos() {
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

        jlAlteraNomeProduto = new javax.swing.JLabel();
        jtfAlteraNomeProduto = new javax.swing.JTextField();
        jlAlteraQuantidade = new javax.swing.JLabel();
        jtfAlteraQuantidade = new javax.swing.JTextField();
        jlAlteraDataFabricacao = new javax.swing.JLabel();
        jtfAlteraDataFabricacao = new javax.swing.JTextField();
        jlAlteraDataValidade = new javax.swing.JLabel();
        jtfAlteraDataValidade = new javax.swing.JTextField();
        jlAlteraPreco = new javax.swing.JLabel();
        jtfAlteraPreco = new javax.swing.JTextField();
        jbAlteraAlterarProduto = new javax.swing.JButton();
        jbAlteraCancelarProduto = new javax.swing.JButton();
        jtfNomeProdutoAlteracao = new javax.swing.JTextField();
        jNomeProdutoAlteracao = new javax.swing.JLabel();
        jbPesquisaProduto = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alterar Produtos");
        setPreferredSize(new java.awt.Dimension(527, 343));

        jlAlteraNomeProduto.setText("Nome:");

        jlAlteraQuantidade.setText("Quantidade:");

        jlAlteraDataFabricacao.setText("Data de Fabricação:");

        jlAlteraDataValidade.setText("Data de Validade:");

        jlAlteraPreco.setText("Preço:");

        jtfAlteraPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAlteraPrecoActionPerformed(evt);
            }
        });

        jbAlteraAlterarProduto.setText("Alterar");
        jbAlteraAlterarProduto.setPreferredSize(new java.awt.Dimension(74, 29));
        jbAlteraAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlteraAlterarProdutoActionPerformed(evt);
            }
        });

        jbAlteraCancelarProduto.setText("Cancelar");
        jbAlteraCancelarProduto.setPreferredSize(new java.awt.Dimension(74, 29));

        jNomeProdutoAlteracao.setText("Nome do Produto:");

        jbPesquisaProduto.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAlteraAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jbAlteraCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlAlteraNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAlteraNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jlAlteraQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAlteraQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNomeProdutoAlteracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNomeProdutoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlAlteraPreco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAlteraPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlAlteraDataFabricacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAlteraDataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addComponent(jlAlteraDataValidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAlteraDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeProdutoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNomeProdutoAlteracao)
                    .addComponent(jbPesquisaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraNomeProduto)
                    .addComponent(jtfAlteraNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAlteraQuantidade)
                    .addComponent(jtfAlteraQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraDataFabricacao)
                    .addComponent(jtfAlteraDataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAlteraDataValidade)
                    .addComponent(jtfAlteraDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlteraPreco)
                    .addComponent(jtfAlteraPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlteraAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlteraCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAlteraPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAlteraPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAlteraPrecoActionPerformed

    private void jbAlteraAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlteraAlterarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlteraAlterarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jNomeProdutoAlteracao;
    private javax.swing.JButton jbAlteraAlterarProduto;
    private javax.swing.JButton jbAlteraCancelarProduto;
    private javax.swing.JButton jbPesquisaProduto;
    private javax.swing.JLabel jlAlteraDataFabricacao;
    private javax.swing.JLabel jlAlteraDataValidade;
    private javax.swing.JLabel jlAlteraNomeProduto;
    private javax.swing.JLabel jlAlteraPreco;
    private javax.swing.JLabel jlAlteraQuantidade;
    private javax.swing.JTextField jtfAlteraDataFabricacao;
    private javax.swing.JTextField jtfAlteraDataValidade;
    private javax.swing.JTextField jtfAlteraNomeProduto;
    private javax.swing.JTextField jtfAlteraPreco;
    private javax.swing.JTextField jtfAlteraQuantidade;
    private javax.swing.JTextField jtfNomeProdutoAlteracao;
    // End of variables declaration//GEN-END:variables
}
