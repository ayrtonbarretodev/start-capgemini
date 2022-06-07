package br.com.capgemini.interfaces_graficas.terceira_interface_grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class CadastroGUI extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton logarButton;
    private JButton esqueciMinhaSenhaButton;
    private JPasswordField passwordField1;

    public CadastroGUI(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        logarButton.addActionListener(e -> {
            String login = "Ayrton";
            String senha = "123456";


            if (textField1.getText().equals(login.trim()) && (new String(passwordField1.getPassword()).equals(senha))) {
                JOptionPane.showMessageDialog(null, "Logado com Sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Login ou Senha Incorretos");
            }

        });
        esqueciMinhaSenhaButton.addMouseListener(new MouseAdapter() {
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CadastroGUI("Cadastro de Usuário");
        frame.setVisible(true);
    }
}
