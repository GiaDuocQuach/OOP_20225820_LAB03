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
public class ArrayStatistics {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] array;

    public static void EnterArray() {
        while (true) {
            try {
                System.out.print("Nhap so luong phan tu cua mang: ");
                n = sc.nextInt();

                if (n > 0) {
                    break;
                } else {
                    System.out.println("So phan tu phai lon hon 0. Vui long nhap lai!");
                }

            } catch (Exception e) {
                System.out.println("So phan tu khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }
        array = new int[n];
        System.out.println("Nhap mang");
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    array[i] = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Gia tri phan tu khong hop le. Vui long nhap lai!");
                    sc.next();
                }
            }
        }
    }

    public static void PrintArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void BubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int SumArray(){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    public static void AverageArray(int sum){
        double average = (double) sum/n;
        System.out.println("Gia tri trung binh cua mang la: " + average);
    }
    
    public static void main(String[] args) {
        EnterArray();
        System.out.print("Mang vua nhap la: ");
        PrintArray();
        BubbleSort();
        System.out.print("\nMang da sap xep: ");
        PrintArray();
        int sum = SumArray();
        System.out.println("\nTong cac gia tri cua mang la: " + sum);
        AverageArray(sum);
    }
}
