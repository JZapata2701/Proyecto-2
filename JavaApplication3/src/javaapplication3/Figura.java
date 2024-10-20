/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;


public class Figura {
    // Atributos generales de cualquier figura
    private String color;

    // Constructor
    public Figura(String color) {
        this.color = color;
    }

    // Método para calcular el área (se puede sobrescribir en las clases hijas)
    public double calcularArea() {
        return 0.0; // Valor por defecto, ya que el área dependerá de la figura específica
    }

    // Método para obtener el color de la figura
    public String getColor() {
        return color;
    }

    // Método para establecer el color de la figura
    public void setColor(String color) {
        this.color = color;
    }



   
   
    
    
}
