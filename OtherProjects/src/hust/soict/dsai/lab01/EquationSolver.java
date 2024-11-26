/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1_B2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EquationSolver {

    static Scanner sc = new Scanner(System.in);

    public static void LinearEquationSolver() {     // ax + b = 0
        double a;

        while (true) {
            try {
                System.out.println("Nhap a: ");
                a = sc.nextDouble();
                if (a == 0) {
                    System.out.println("Gia tri a phai khac 0. Vui long nhap lai!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Gia tri a khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }

        while (true) {
            try {
                System.out.println("Nhap b: ");
                double b = sc.nextDouble();
                if (b < 0) {
                    System.out.println("Phuong trinh " + a + "x + (" + b + ") = 0");
                } else {
                    System.out.println("Phuong trinh " + a + "x + " + b + " = 0");
                }
                System.out.println("Co nghiem la: x = " + (-b / a));
                break;
            } catch (Exception e) {
                System.out.println("Gia tri b khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }
    }

    public static void SystemOfEquationsSolver() {       // a11x1 + a12x2 = b1 | a21x1 + a22x2 = b2
        double[][] matrix = new double[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    try {
                        System.out.print((j <= 1 ? "a" + (j + 1) + (i + 1) + ": " : "b" + (i + 1) + ": "));
                        matrix[i][j] = sc.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.println("Gia tri khong hop le. Vui long nhap lai!");
                        sc.next();
                    }
                }
            }
        }
        System.out.println("Ma tran mo rong cua he phuong trinh la:");
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        double D = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        double D1 = matrix[0][2] * matrix[1][1] - matrix[1][2] * matrix[0][1];
        double D2 = matrix[0][0] * matrix[1][2] - matrix[1][0] * matrix[0][2];
        System.out.println("D = " + D);
        System.out.println("D1 = " + D1);
        System.out.println("D2 = " + D2);
        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("He phuong trinh co nghiem duy nhat:");
            System.out.println("x1 = D1/D = " + x1);
            System.out.println("x2 = D2/D = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        }
    }

    public static void QuadraticEquationSolver() {       //ax^2 + bx + c = 0
        while (true) {
            try {
                System.out.print("Nhap a: ");
                double a = sc.nextDouble();
                if (a == 0) {
                    System.out.println("Phuong trinh chuyen ve dang ax + b = 0");
                    LinearEquationSolver();
                } else {
                    double b;
                    while (true) {
                        try {
                            System.out.print("Nhap b: ");
                            b = sc.nextDouble();
                            break;
                        } catch (Exception e) {
                            System.out.println("Gia tri dau vao khong hop le. Vui long nhap lai!");
                            sc.next();
                        }
                    }
                    double c;
                    while (true) {
                        try {
                            System.out.print("Nhap c: ");
                            c = sc.nextDouble();
                            break;
                        } catch (Exception e) {
                            System.out.println("Gia tri dau vao khong hop le. Vui long nhap lai!");
                            sc.next();
                        }
                    }
                    double d = b * b - 4 * a * c;
                    System.out.println("d = " + d);
                    if (d > 0) {
                        System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                        System.out.println("x1 = " + (-b + Math.sqrt(d)) / (2 * a));
                        System.out.println("x2 = " + (-b - Math.sqrt(d)) / (2 * a));
                    } else if (d == 0) {
                        System.out.print("Phuong trinh co nghiem kep: ");
                        System.out.println("x = " + (-b / (2 * a)));
                    } else {
                        System.out.println("Phuong trinh vo nghiem");
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Gia tri dau vao khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }
    }

    public static void PrintMenu() {
        System.out.println("Chon Option");
        System.out.println("1. Giai phuong trinh bac nhat 1 an");
        System.out.println("2. Giai he phuong trinh bac nhat 2 an");
        System.out.println("3. Giai phuong trinh bac hai 1 an");
        System.out.println("4. Thoat chuong trinh");
    }

    public static void EnterOption() {
        int option;
        while (true) {
            try {
                System.out.println("Nhap option: ");
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        LinearEquationSolver();
                        break;
                    case 2:
                        SystemOfEquationsSolver();
                        break;
                    case 3:
                        QuadraticEquationSolver();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Option khong hop le. Vui long nhap lai!");
                        continue;
                }
                PrintMenu();
            } catch (Exception e) {
                System.out.println("Option khong hop le. Vui long nhap lai!");
                sc.next();      // Như trên
            }
        }
    }

    public static void main(String[] args) {
        PrintMenu();
        EnterOption();
    }
}
