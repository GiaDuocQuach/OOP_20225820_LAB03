package Lab1_B2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Calculator {

    public static void tinhTong2so(double a, double b) {
        System.out.println("Tong cua 2 so a va b la: " + (a + b));
    }

    public static void tinhHieu2so(double a, double b) {
        System.out.println("Hieu cua 2 so a va b la: " + (a - b));
    }

    public static void tinhTich2so(double a, double b) {
        System.out.println("Tich cua 2 so a va b la: " + (a * b));
    }

    public static void tinhThuong2so(double a, double b) {
        if (b != 0) {
            System.out.println("Thuong cua 2 so a va b la: " + (a / b));
        } else {
            System.out.println("Khong chia duoc cho 0. Vui long nhap gia tri b khac 0!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        while (true) {
            try {
                System.out.println("Nhap vao a:");
                a = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Gia tri dau vao khong hop le. Vui long nhap so thuc!");
                sc.next();
            }
        }
        while (true) {
            try {
                System.out.println("Nhap vao b:");
                b = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Gia tri dau vao khong hop le. Vui long nhap so thuc!");
                sc.next();
            }
        }
        tinhTong2so(a, b);
        tinhHieu2so(a, b);
        tinhTich2so(a, b);
        tinhThuong2so(a, b);
    }

}
