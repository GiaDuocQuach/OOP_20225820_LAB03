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
public class AddTwoMatrices {

    static Scanner sc = new Scanner(System.in);
    static int[][] matrix1;
    static int[][] matrix2;
    static int rows;
    static int cols;
    static int[][] resultMatrix;

    public static void EnterRowsAndCols() {
        while (true) {
            try {
                System.out.print("Nhap so hang: ");
                rows = sc.nextInt();

                if (rows > 0) {
                    break;
                } else {
                    System.out.println("So hang phai lon hon 0. Vui long nhap lai!");
                }

            } catch (Exception e) {
                System.out.println("So hang khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }
        while (true) {
            try {
                System.out.print("Nhap so cot: ");
                cols = sc.nextInt();

                if (cols > 0) {
                    break;
                } else {
                    System.out.println("So cot phai lon hon 0. Vui long nhap lai!");
                }

            } catch (Exception e) {
                System.out.println("So cot khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }
        matrix1 = new int[rows][cols];
        matrix2 = new int[rows][cols];
    }

    public static void EnterMatrix(int[][] matrix, int matrixNumber) {
        System.out.println("Nhap vao ma tran " + matrixNumber + ": ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    try {
                        matrix[i][j] = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Gia tri khong hop le. Vui long nhap lai!");
                        sc.next();
                    }
                }
            }
        }
    }

    public static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void AddMatrices() {
        resultMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    public static void main(String[] args) {
        EnterRowsAndCols();
        EnterMatrix(matrix1, 1);
        EnterMatrix(matrix2, 2);
        AddMatrices();
        System.out.println("Ma tran 1: ");
        PrintMatrix(matrix1);
        System.out.println("Ma tran 2: ");
        PrintMatrix(matrix2);
        System.out.println("Tong cua 2 ma tran: ");
        PrintMatrix(resultMatrix);
    }
}
