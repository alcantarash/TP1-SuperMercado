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
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Interface() {
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

        jpTelaPrincipal = new javax.swing.JPanel();
        jdpTelaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProdutos = new javax.swing.JMenu();
        jmiCadastrarProdutos = new javax.swing.JMenuItem();
        jmiAlterarProduto = new javax.swing.JMenuItem();
        jmiListarProdutos = new javax.swing.JMenuItem();
        jmiDeletarProdutos = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmiCadastrarClientes = new javax.swing.JMenuItem();
        jmiAlterarCliente = new javax.swing.JMenuItem();
        jmiListarClientes = new javax.swing.JMenuItem();
        jmiDeletarClientes = new javax.swing.JMenuItem();
        jmVendas = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpTelaPrincipalLayout = new javax.swing.GroupLayout(jpTelaPrincipal);
        jpTelaPrincipal.setLayout(jpTelaPrincipalLayout);
        jpTelaPrincipalLayout.setHorizontalGroup(
            jpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        jpTelaPrincipalLayout.setVerticalGroup(
            jpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        jmProdutos.setText("Produtos");
        jmProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdutosActionPerformed(evt);
            }
        });

        jmiCadastrarProdutos.setText("Cadastrar Produtos");
        jmiCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarProdutosActionPerformed(evt);
            }
        });
        jmProdutos.add(jmiCadastrarProdutos);

        jmiAlterarProduto.setText("Alterar Produto");
        jmiAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarProdutoActionPerformed(evt);
            }
        });
        jmProdutos.add(jmiAlterarProduto);

        jmiListarProdutos.setText("Listar Produtos");
        jmProdutos.add(jmiListarProdutos);

        jmiDeletarProdutos.setText("Deletar Produtos");
        jmProdutos.add(jmiDeletarProdutos);

        jMenuBar1.add(jmProdutos);

        jmClientes.setText("Clientes");

        jmiCadastrarClientes.setText("Cadastrar Clientes");
        jmiCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarClientesActionPerformed(evt);
            }
        });
        jmClientes.add(jmiCadastrarClientes);

        jmiAlterarCliente.setText("Alterar Cliente");
        jmiAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarClienteActionPerformed(evt);
            }
        });
        jmClientes.add(jmiAlterarCliente);

        jmiListarClientes.setText("Listar Clientes");
        jmClientes.add(jmiListarClientes);

        jmiDeletarClientes.setText("Deletar Clientes");
        jmClientes.add(jmiDeletarClientes);

        jMenuBar1.add(jmClientes);

        jmVendas.setText("Vendas");
        jMenuBar1.add(jmVendas);

        jMenu1.setText("Relatórios");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarProdutosActionPerformed
        CadastrarProdutos cadastroProduto = new CadastrarProdutos();
        jdpTelaPrincipal.add(cadastroProduto);
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarProdutosActionPerformed

    private void jmiCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarClientesActionPerformed
        CadastrarClientes cadastroCliente = new CadastrarClientes();
        jdpTelaPrincipal.add(cadastroCliente);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarClientesActionPerformed

    private void jmProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdutosActionPerformed
        
    }//GEN-LAST:event_jmProdutosActionPerformed

    private void jmiAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarProdutoActionPerformed
        AlterarProdutos AlteraProduto = new AlterarProdutos();
        jdpTelaPrincipal.add(AlteraProduto);
        AlteraProduto.setVisible(true);
    }//GEN-LAST:event_jmiAlterarProdutoActionPerformed

    private void jmiAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarClienteActionPerformed
        AlterarClientes AlteraCliente = new AlterarClientes();
        jdpTelaPrincipal.add(AlteraCliente);
        AlteraCliente.setVisible(true);
    }//GEN-LAST:event_jmiAlterarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpTelaPrincipal;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmProdutos;
    private javax.swing.JMenu jmVendas;
    private javax.swing.JMenuItem jmiAlterarCliente;
    private javax.swing.JMenuItem jmiAlterarProduto;
    private javax.swing.JMenuItem jmiCadastrarClientes;
    private javax.swing.JMenuItem jmiCadastrarProdutos;
    private javax.swing.JMenuItem jmiDeletarClientes;
    private javax.swing.JMenuItem jmiDeletarProdutos;
    private javax.swing.JMenuItem jmiListarClientes;
    private javax.swing.JMenuItem jmiListarProdutos;
    private javax.swing.JPanel jpTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
