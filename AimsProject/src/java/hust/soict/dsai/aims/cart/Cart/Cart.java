/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

/**
 *
 * @author User
 */
public class Cart {

    private int qtyOrdered = 0;
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public Cart() {
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;  // Thêm đĩa vào mảng
            qtyOrdered++;  // Tăng số lượng đĩa trong giỏ
            System.out.println("The disc has been added.");  // In thông báo đĩa đã được thêm
        } else {
            System.out.println("The cart is almost full.");  // Thông báo giỏ đã đầy
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {  // Kiểm tra nếu đĩa hiện tại là đĩa cần xóa
                found = true;
                // Dịch chuyển các phần tử phía sau đĩa bị xóa lên một vị trí
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;  // Đặt phần tử cuối thành null
                qtyOrdered--;  // Giảm số lượng đĩa trong giỏ
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc was not found in the cart.");
        }
    }

    public float getTotalCost() {
        float sum = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

//  public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//    for (DigitalVideoDisc disc : dvdList) {
//        if (qtyOrdered < MAX_NUMBER_ORDERED) {
//            itemsOrdered[qtyOrdered] = disc;  // Thêm đĩa vào mảng
//            qtyOrdered++;  // Tăng số lượng đĩa trong giỏ
//            System.out.println("The disc \"" + disc.getTitle() + "\" has been added to the cart.");
//        } else {
//            System.out.println("The cart is full. Cannot add more discs.");
//            break;
//        }
//    }
//}
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBER_ORDERED) {
                itemsOrdered[qtyOrdered] = disc;  // Thêm đĩa vào mảng
                qtyOrdered++;  // Tăng số lượng đĩa trong giỏ
                System.out.println("The disc \"" + disc.getTitle() + "\" has been added to the cart.");
            } else {
                System.out.println("The cart is full. Cannot add more discs.");
                break;
            }
        }
    }
    // Phương thức nhận tham số là danh sách số lượng tùy ý (varargs)

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;  // Thêm đĩa vào mảng
            qtyOrdered++;  // Tăng số lượng đĩa trong giỏ
            System.out.println("The disc has been added.");  // In thông báo đĩa đã được thêm
        } else {
            System.out.println("The cart is almost full.");  // Thông báo giỏ đã đầy
        }
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd2;  // Thêm đĩa vào mảng
            qtyOrdered++;  // Tăng số lượng đĩa trong giỏ
            System.out.println("The disc has been added.");  // In thông báo đĩa đã được thêm
        } else {
            System.out.println("The cart is almost full.");  // Thông báo giỏ đã đầy
        }
    }

    public void printCart() {
        System.out.println("***********************CART**********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        int count = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
             if (disc == null) {
                continue;  // Bỏ qua các phần tử null
            }
            System.out.println(count + ". " + disc.toString());
            totalCost += disc.getCost();
            count++;
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc == null) {
                continue;  // Bỏ qua các phần tử null
            }
            if (disc.getId() == id) {   // So sánh ID
                System.out.println("Found: " + disc.toString());
                return;
            }
        }
        System.out.println("No DVD found with ID: " + id);
    }

    public void searchByTitle(String title) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc == null) {
                continue;
            }
            if (disc.isMatch(title)) {
                System.out.println("Found: " + disc.toString());
                return;
            }
        }
        System.out.println("No DVD found with title: " + title);

    }
}
