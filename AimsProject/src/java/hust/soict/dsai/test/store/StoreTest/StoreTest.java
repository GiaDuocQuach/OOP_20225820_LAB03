/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

/**
 *
 * @author User
 */
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lich", "Animation", "Roger", 87, 13.15f);
DigitalVideoDisc dvd2 = new DigitalVideoDisc("King Dom", "Science Fiction", "Lucas", 87, 27.55f);
//them cac DVD vao Store
System.out.println("\n--- Adding DVDs to the store ---");
store.addDVD(dvd1);
store.addDVD(dvd2);
// Hien thi danh sach DVD trong kho 
store.displayStore();
//Xoa DVD khoi kho
System.out.println("\n---Removing a DVD----");
store.removeDVD(dvd2);
//Hien thi danh sach DVD sau khi sua
store.displayStore();
//Xoa DVD khong co trong kho
store.removeDVD(dvd2);

    }

}
