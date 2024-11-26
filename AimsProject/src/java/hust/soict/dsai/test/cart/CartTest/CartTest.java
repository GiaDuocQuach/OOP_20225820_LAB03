/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.test.cart.CartTest;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

/**
 *
 * @author User
 */
public class CartTest {
    public static void main(String[] args) {
        Cart cart =new Cart();
        // Tao doi tuong DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Arcane", "Animation", "Dung g", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Arcane2", "Animation", "Dung g", 90, 20.05f);
        // them vao gio hang
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
//        in gio hang
        System.out.println("\n---Printing Cart---");
         cart.printCart();
        //Tim kiem theo ID
        System.out.println("\n---Searching by ID---");
        cart.searchById(1);
        cart.searchById(3);
        //Tim theo title
        System.out.println("\n---Searching by Title---");
        cart.searchByTitle("Arcane");
        cart.searchByTitle("arcane3");
    }
}
