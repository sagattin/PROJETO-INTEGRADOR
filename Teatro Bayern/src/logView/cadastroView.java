<<<<<<< HEAD

package logView;


public class cadastroView extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
=======
package logView;

import javax.swing.*;
import java.awt.*;

public class cadastroView extends JFrame {

    private JButton jButtonCadastrar;
    private JTextField jTextField2;
    private JPasswordField jPasswordField1;
    private JLabel jLabel1;

>>>>>>> upstream/main
    public cadastroView() {
        initComponents();
    }

<<<<<<< HEAD
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCADASTRAR = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCADASTRAR.setContentAreaFilled(false);
        jButtonCADASTRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCADASTRARActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 200, 60));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 210, 30));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 312, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/usuárioCadastro(2).jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1180, 799));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 1630, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCADASTRARActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCADASTRARActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCADASTRAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
=======
    private void initComponents() {
        jButtonCadastrar = new JButton("Cadastrar");
        jTextField2 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(500, 300));

        // Configurando componentes
        jLabel1.setIcon(new ImageIcon("resources/imagem/usuarioCadastro.jpg")); // Atualize o caminho se necessário
        jLabel1.setPreferredSize(new Dimension(1180, 799));

        jButtonCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(evt -> jButtonCadastrarActionPerformed(evt));

        jPasswordField1.addActionListener(evt -> jPasswordField1ActionPerformed(evt));

        // Usando GroupLayout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1))
                                .addGap(50, 50, 50)
                                .addComponent(jButtonCadastrar, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCadastrar))
                                .addGap(10, 10, 10)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: Adicione lógica de tratamento aqui
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new cadastroView().setVisible(true));
    }
>>>>>>> upstream/main
}
