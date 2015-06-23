/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dataBase.SalvarFornecedor;
import iquiscbaii.FornecedoresJar;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class ConsultaFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaFornecedor
     */
    public ConsultaFornecedor() {
        initComponents();
        preencheTabela();
        
        setLocationRelativeTo(null);
        URL url = this.getClass().getResource("./img/fornecedor.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPainel = new javax.swing.JPanel();
        jspScroll = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta - Fornecedores");
        setMinimumSize(new java.awt.Dimension(750, 540));

        jpPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta - Fornecedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Razão Social", "Nome Fantasia", "Inscrição", "Insc. Estadual", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspScroll.setViewportView(jtTabela);
        if (jtTabela.getColumnModel().getColumnCount() > 0) {
            jtTabela.getColumnModel().getColumn(0).setMinWidth(60);
            jtTabela.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtTabela.getColumnModel().getColumn(0).setMaxWidth(120);
            jtTabela.getColumnModel().getColumn(1).setMinWidth(150);
            jtTabela.getColumnModel().getColumn(2).setMinWidth(120);
            jtTabela.getColumnModel().getColumn(3).setMinWidth(130);
            jtTabela.getColumnModel().getColumn(3).setPreferredWidth(150);
            jtTabela.getColumnModel().getColumn(3).setMaxWidth(170);
            jtTabela.getColumnModel().getColumn(4).setMinWidth(90);
            jtTabela.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtTabela.getColumnModel().getColumn(4).setMaxWidth(150);
            jtTabela.getColumnModel().getColumn(5).setMinWidth(100);
            jtTabela.getColumnModel().getColumn(5).setPreferredWidth(120);
            jtTabela.getColumnModel().getColumn(5).setMaxWidth(160);
        }

        javax.swing.GroupLayout jpPainelLayout = new javax.swing.GroupLayout(jpPainel);
        jpPainel.setLayout(jpPainelLayout);
        jpPainelLayout.setHorizontalGroup(
            jpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        jpPainelLayout.setVerticalGroup(
            jpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpPainel;
    private javax.swing.JScrollPane jspScroll;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables

    private void preencheTabela() {
        SalvarFornecedor DAOConsulta = new SalvarFornecedor();
        FornecedoresJar uni = new FornecedoresJar();
        DefaultTableModel modeloTU = (DefaultTableModel) jtTabela.getModel();

        try {
            List<FornecedoresJar> todosFornecedores = DAOConsulta.consultaFornecedores();

            for (FornecedoresJar forn : todosFornecedores) {
                modeloTU.addRow(new Object[]{
                    forn.getIdFornecedores(),
                    forn.getRazaoSocial(),
                    forn.getNomeFantasia(),
                    forn.getInscricaoCpfCnpj(),
                    forn.getInscricaoEstadual(),
                    forn.getTelefone(),
                    forn.getEmail()
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeJFrame.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}