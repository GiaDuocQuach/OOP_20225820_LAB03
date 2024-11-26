/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore; // Danh sach DVD trong kho

    public Store() {
        itemsInStore =new ArrayList<>();
    }
    // Them DVD vao kho
    public  void addDVD(DigitalVideoDisc dvd){
        itemsInStore.add(dvd);
        System.out.println("Added DVD to the store: "+dvd.getTitle());
    }
    
    //Xoa DVD khoi kho
    public void removeDVD(DigitalVideoDisc dvd){
        if(itemsInStore.remove(dvd)){
            System.out.println("Remove DVD from the store: "+dvd.getTitle());
       }
        else{
            System.out.println("DVD not found in the store: "+dvd.getTitle());
        }
    }
    
    //Hien thi danh sach DVD trong kho
    public  void displayStore(){
        System.out.println("\n---Store Inventory---");
        for(DigitalVideoDisc dvd: itemsInStore){
            System.out.println(dvd.toString());
        }
        System.out.println("-----------------------");
    }
}
