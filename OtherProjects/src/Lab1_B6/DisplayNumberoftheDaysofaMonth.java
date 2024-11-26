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
public class DisplayNumberoftheDaysofaMonth {
    
    static Scanner sc = new Scanner(System.in);
    static String monthInput;
    static int year;

    public static int month() {
        switch (monthInput) {
            case "January", "Jan.", "Jan", "1":
                return 1;
            case "February", "Feb.", "Feb", "2":
                return 2;
            case "March", "Mar.", "Mar", "3":
                return 3;
            case "April", "Apr.", "Apr", "4":
                return 4;
            case "May", "5":
                return 5;
            case "June", "Jun", "6":
                return 6;
            case "July", "Jul", "7":
                return 7;
            case "August", "Aug.", "Aug", "8":
                return 8;
            case "September", "Sep.", "Sep", "9":
                return 9;
            case "October", "Oct.", "Oct", "10":
                return 10;
            case "November", "Nov.", "Nov", "11":
                return 11;
            case "December", "Dec.", "Dec", "12":
                return 12;
            default:
                return 0;
        }
    }

    public static void SoNgaycuaThang() {
        int month = month();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang " + month + " nam " + year + " co 31 ngay");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang " + month + " nam " + year + " co 30 ngay");
                break;
            case 2:
                int daysoffebruary = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                System.out.println("Thang 2 nam " + year + " co " + daysoffebruary + " ngay");
                break;
            default:
                System.out.println("Thang khong hop le. Vui long nhap lai!");
        }

    }

    public static void NhapThang() {
        while (true) {
            System.out.println("Nhap thang: ");
            monthInput = sc.next();

            if (month() != 0) {
                break;
            } else {
                System.out.println("Thang khong hop le. Vui long nhap lai!");
            }
        }
    }

    public static void NhapNam() {
        while (true) {
            try {
                System.out.println("Nhap nam: ");
                year = sc.nextInt();

                if (year > 0) {
                    break;
                } else {
                    System.out.println("Nam nhap vao phai lon hon 0. Vui long nhap lai!");
                }

            } catch (Exception e) {
                System.out.println("Nam nhap vao khong hop le. Vui long nhap lai!");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        NhapThang();
        NhapNam();
        SoNgaycuaThang();
    }
}
