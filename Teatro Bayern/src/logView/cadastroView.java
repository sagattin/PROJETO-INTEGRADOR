package logView;

import javax.swing.*;
import java.awt.*;

public class cadastroView extends JFrame {

    private JButton jButtonCadastrar;
    private JTextField jTextField2;
    private JPasswordField jPasswordField1;
    private JLabel jLabel1;

    public cadastroView() {
        initComponents();
    }

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
}
