/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;

/**
 *
 * @author PC267
 */
public class Client implements Item{
    
    private String name;
    private String genre;
    private String id;
    private String birthday;
    private String address;
    
    public Client() {
        
    }

    public Client(String name, String genre, String id, String birthday, String address) {
        this.name = name;
        this.genre = genre;
        this.id = id;
        this.birthday = birthday;
        this.address = address;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return birthday;  // El campo 'birthday' representa la fecha en Client
    }

    @Override
    public void setDate(String birthday) {
        this.birthday = birthday;
    }
    
    
    
}
