/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1_B6;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ChoosingOption2 {

    public static void main(String[] args) {
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Choose an option",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option == 0 ? "Yes" : "No"));
        System.exit(0);
    }
}
