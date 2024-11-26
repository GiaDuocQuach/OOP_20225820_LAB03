/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1_B6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InputFromKeyboard {

    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);

        System.out.println("What's your name?");
        String strName = keybroad.nextLine();
        System.out.println("How old are you?");
        int iAge = keybroad.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = keybroad.nextDouble();
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " year old. " + "Your height is " + dHeight + ".");
    }
}
