/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.disc.DigitalVideoDisc;

/**
 *
 * @author User
 */
public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private  String director;
    private int length;
    private float cost;
   
    public DigitalVideoDisc(){
        
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id=++nbDigitalVideoDiscs;
    }
    
     public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id=++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id=++nbDigitalVideoDiscs;
    }
   

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
     public boolean isMatch(String searchTitle) {
        return this.title.equalsIgnoreCase(searchTitle);
    }

    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }
     
}