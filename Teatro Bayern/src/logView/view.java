package logView;

import javax.swing.*;
import java.awt.*;

public class view extends JFrame {

    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JButton jButtonEntrar;
    private JButton jButtonCadastro;
    private JLabel jLabel1;

    public view() {
        initComponents();
    }

    private void initComponents() {
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButtonEntrar = new JButton("Entrar");
        jButtonCadastro = new JButton("Cadastro");
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(500, 300));

        // Configurando os componentes
        jTextField1.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
        jLabel1.setIcon(new ImageIcon("resources/imagem/usuarioLogin.jpg")); // Atualize o caminho da imagem se necessário
        jLabel1.setPreferredSize(new Dimension(1180, 799));

        jButtonEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(evt -> jButtonEntrarActionPerformed(evt));

        jButtonCadastro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonCadastro.addActionListener(evt -> jButtonCadastroActionPerformed(evt));

        // Usando GroupLayout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(760, 760, 760)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1)
                                        .addComponent(jButtonEntrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonCadastro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonEntrar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButtonCadastro, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: Adicione lógica de tratamento aqui
    }

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: Adicione lógica de tratamento aqui
    }

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {
        cadastroView telaDeCadastro = new cadastroView();
        telaDeCadastro.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new view().setVisible(true));
    }
}
