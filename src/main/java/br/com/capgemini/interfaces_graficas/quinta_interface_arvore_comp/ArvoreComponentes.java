/*
 * Created by JFormDesigner on Wed Jun 08 08:19:25 GFT 2022
 */

package br.com.capgemini.interfaces_graficas.quinta_interface_arvore_comp;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class ArvoreComponentes extends JPanel {
    public ArvoreComponentes() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[369,fill]",
                // rows
                "[54]" +
                "[53]" +
                "[139]"));

            //---- label1 ----
            label1.setText("Sobrenome");
            panel1.add(label1, "cell 0 1");

            //---- label2 ----
            label2.setText("Nome");
            panel1.add(label2, "cell 0 0");
            panel1.add(textField1, "cell 1 0");
            panel1.add(textField2, "cell 1 1");

            //======== panel2 ========
            {
                panel2.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[241,fill]" +
                    "[255,fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(textArea1);
                }
                panel2.add(scrollPane1, "cell 0 0 2 3");

                //---- button1 ----
                button1.setText("Confirmar");
                panel2.add(button1, "cell 1 3");
            }
            panel1.add(panel2, "cell 1 2");
        }
        add(panel1, "cell 0 0 2 3");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
