/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

public class Circulo extends Figura {
    private double radio;

    // Constructor que incluye el color de la figura y el radio del círculo
    public Circulo(String color, double radio) {
        super(color); // Llamada al constructor de la clase madre
        this.radio = radio;
    }

    // Método sobrescrito para calcular el área del círculo
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // Área del círculo: π * r^2
    }

    // Método para obtener el radio del círculo
    public double getRadio() {
        return radio;
    }

    // Método para establecer el radio del círculo
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
