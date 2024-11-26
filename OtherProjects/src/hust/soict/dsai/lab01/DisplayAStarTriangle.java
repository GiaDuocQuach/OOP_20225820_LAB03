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
public class DisplayAStarTriangle {

    static Scanner sc = new Scanner(System.in);

    public static void starTriangle() {
        int n;
        while (true) {
            try {
                System.out.println("Nhap n: ");
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Gia tri n nhap vao phai lon hon 0. Vui long nhap lai!");
                }

            } catch (Exception e) {
                System.out.println("Gia tri n nhap vao khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starTriangle();
    }
}
