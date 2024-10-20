/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;

/**
 *
 * @author PC267
 */
public class Movie implements Item {
    
    private String name;
    private String genre;
    private String director;
    private int year;
    private double rentalCost;
    private String rental;

    public Movie(){
        
    }
    
    public Movie(String name, String genre, String director, int year, double rentalCost, String rental) {
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.year = year;
        this.rentalCost = rentalCost;
        this.rental = rental;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getRental() {
        return rental;
    }

    public void setRental(String rental) {
        this.rental = rental;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public String getDate() {
        return String.valueOf(year);
    }
    
    @Override
    public void setDate(String year){
        this.year = Integer.parseInt(year);
    }
    
}
