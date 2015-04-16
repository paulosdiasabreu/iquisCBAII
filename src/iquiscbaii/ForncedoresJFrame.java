package iquiscbaii;

import dataBase.ConectaDB;
import dataBase.SalvarFornecedor;
import iquiscbaii.FornecedoresJar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ForncedoresJFrame extends javax.swing.JFrame {

    //criando objeto
    FornecedoresJar objFornecedor;

    public ForncedoresJFrame() {
        initComponents();

        //Faz com que a janela inicialize no centro da tela
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        labelCPFCNPJ = new javax.swing.JLabel();
        entradaCpfCnpj = new javax.swing.JTextField();
        labelInscricaoEstadual = new javax.swing.JLabel();
        entradaInscricaoEstadual = new javax.swing.JTextField();
        labelRazaoSocial = new javax.swing.JLabel();
        entradaRazaoSocial = new javax.swing.JTextField();
        labelNomeFantasia = new javax.swing.JLabel();
        entradaNomeFantasia = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        entradaTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        entradaEmail = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Fornecedor");
        setBackground(new java.awt.Color(51, 51, 51));

        labelCPFCNPJ.setText("Inscrição CPF/CNPJ: ");

        labelInscricaoEstadual.setText("Inscrição Estadual: ");

        labelRazaoSocial.setText("Razão Social: ");

        labelNomeFantasia.setText("Nome Fantasia: ");
        labelNomeFantasia.setRequestFocusEnabled(false);
        labelNomeFantasia.setVerifyInputWhenFocusTarget(false);

        labelTelefone.setText("Telefone: ");

        labelEmail.setText("E-mail: ");

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNomeFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entradaNomeFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(entradaRazaoSocial))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelCPFCNPJ)
                        .addGap(18, 18, 18)
                        .addComponent(entradaCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(labelInscricaoEstadual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonCancelar)
                                .addGap(44, 44, 44)
                                .addComponent(buttonSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entradaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entradaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(228, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPFCNPJ)
                    .addComponent(entradaCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInscricaoEstadual)
                    .addComponent(entradaInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRazaoSocial)
                    .addComponent(entradaRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(entradaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(entradaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("Cadastro Fornecedor");

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    Ação do botão SALVAR
*/
    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        objFornecedor = new FornecedoresJar();

        if(validaCampos()){ //verifica se os campos estão preenchidos corretamente
            if (preencherForm()) { //se preencher o objeto...
                SalvarFornecedor DAO = new SalvarFornecedor();
                try {
                    if (DAO.salvar(objFornecedor)) { //pega os dados do objeto e salva no banco
                        JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                        DAO.getConexao().close();
                        limparCampos(); //limpar os campos após salvar no banco
                    } else {                         //se não, retorna mensagem que negativa
                        JOptionPane.showMessageDialog(this, "Não foi possível salvar as informações!");
                        DAO.getConexao().close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ForncedoresJFrame.class.getName()).log(Level.SEVERE, null, ex);

                }
            } //fim do preenchimento do objeto
        }  //fim da verificação do preenchimento dos campos      
        
    }//GEN-LAST:event_buttonSalvarActionPerformed
/**/
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        //JOptionPane.showMessageDialog(null, "Deseja realmente cancelar o cadastramento?", "Cancelar" , 3);
        //new CancelarFornecedoresJFrame().setVisible(true);
        int escolha = JOptionPane.showConfirmDialog(this, "Deseja relamente cancelar o cadastro?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (escolha == JOptionPane.YES_OPTION) {
            //new ForncedoresJFrame().setVisible(true);
            entradaCpfCnpj.setText("");
            entradaInscricaoEstadual.setText("");
            entradaRazaoSocial.setText("");
            entradaNomeFantasia.setText("");
            entradaTelefone.setText("");
            entradaEmail.setText("");
        } else {
            //não confirmou
        }
    }//GEN-LAST:event_buttonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ForncedoresJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForncedoresJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForncedoresJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForncedoresJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ForncedoresJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField entradaCpfCnpj;
    private javax.swing.JTextField entradaEmail;
    private javax.swing.JTextField entradaInscricaoEstadual;
    private javax.swing.JTextField entradaNomeFantasia;
    private javax.swing.JTextField entradaRazaoSocial;
    private javax.swing.JTextField entradaTelefone;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel labelCPFCNPJ;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelInscricaoEstadual;
    private javax.swing.JLabel labelNomeFantasia;
    private javax.swing.JLabel labelRazaoSocial;
    private javax.swing.JLabel labelTelefone;
    // End of variables declaration//GEN-END:variables
    
    //atributo para setar o valor da Inscrição Estadual como isento
    private String novaInscricaoEstadual;
    
    //Meus metodos
    
    private boolean preencherForm() {
           //Método para preencher os dados nos atributos...para serem salvos no BD
        objFornecedor = new FornecedoresJar();
        objFornecedor.setInscricaoCpfCnpj(entradaCpfCnpj.getText());
        objFornecedor.setInscricaoEstadual(entradaInscricaoEstadual.getText());
        objFornecedor.setRazaoSocial(entradaRazaoSocial.getText());
        objFornecedor.setNomeFantasia(entradaNomeFantasia.getText());
        objFornecedor.setTelefone(entradaTelefone.getText());
        objFornecedor.setEmail(entradaEmail.getText());

        return true;
    }
    
    private boolean validaCampos(){
        //Método para validar os campos do formulário
        //09:19min
        
        if(entradaCpfCnpj.getText().equals("") || entradaCpfCnpj.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Informe a Inscrição CPF/CNPJ.");
            entradaCpfCnpj.requestFocus();
            return false;
        }
        if(entradaInscricaoEstadual.getText().equals("") || entradaInscricaoEstadual.getText().equals(null) ){
            int opcao = JOptionPane.showConfirmDialog(this, "Inscrição Estadual não declarada.\n" +
                                                            "Deseja declarar este Fornecedor como \"ISENTO\"?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if(opcao == JOptionPane.YES_OPTION){
                entradaInscricaoEstadual.setText("ISENTO");
            }else{
                JOptionPane.showMessageDialog(this, "Informe a Inscrição Estadual.");
            }
        }
        if(entradaRazaoSocial.getText().equals("") || entradaRazaoSocial.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Informe o Nome Completo\n" +
                                                "ou Razão Social do Fornecedor.");
            entradaRazaoSocial.requestFocus();
            return false;
        }
        if(entradaNomeFantasia.getText().equals("") || entradaNomeFantasia.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Informe o Nome Fantasia do Fornecedor." +
                                                "\nCaso não possua, informe um apelido para identificação");
            entradaNomeFantasia.requestFocus();
            return false;
        }
        if(entradaTelefone.getText().equals("") || entradaTelefone.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Informe o telefone para contato.");
            entradaTelefone.requestFocus();
            return false;
        }
        if(entradaEmail.getText().equals("") || entradaEmail.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Informe o e-mail de contato do Fornecedor.");
            entradaEmail.requestFocus();
            return false;
        }
        
        return true;
    } //finaliza validaCampos()
    
    //Método para limpar os campos do formulário após alguma requisição
    private void limparCampos(){
        entradaCpfCnpj.setText("");
        entradaInscricaoEstadual.setText("");
        entradaRazaoSocial.setText("");
        entradaNomeFantasia.setText("");
        entradaTelefone.setText("");
        entradaEmail.setText("");
    }
    
    //Validar CPF/CNPJ
    
    //Validar Telefone
    
    //validar E-mail

/* Primeiro método para declarar a Inscrição Estadual como isento caso o usuário não informe algun valor
    
    private String parametrizaInscricaoEstadual(){
        //metodo para parametrizar o campo Inscrição Estadual
        //Se valor em branco: ele seta o valor como ISENTO
        if(entradaInscricaoEstadual.getText().equals("") || entradaInscricaoEstadual.getText().equals(null) ){
             novaInscricaoEstadual = ("ISENTO") ;
             return novaInscricaoEstadual;
        }else{
            novaInscricaoEstadual = entradaInscricaoEstadual.getText();
            return novaInscricaoEstadual;
        }
    }
    */


}
