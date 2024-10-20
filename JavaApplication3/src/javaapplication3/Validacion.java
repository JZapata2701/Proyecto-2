/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import javax.swing.JOptionPane;
/**
 *
 * @author PC267
 */
     
import javax.swing.JOptionPane;

public class Validacion {
   

    // Método para validar el color ingresado
    public static String validarColor() {
        String color = "";
        boolean esValido = false;

        // Expresión regular para validar que solo contiene letras (mayúsculas y minúsculas)
        String regex = "^[a-zA-Z]+$";

        // Pedir el color del círculo al usuario hasta que ingrese uno válido
        while (!esValido) {
            color = JOptionPane.showInputDialog(null, "Ingrese el color del círculo (solo letras):");

            // Validar que el color ingresado solo contenga letras
            if (color != null && color.matches(regex)) {
                esValido = true; // El color es válido
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un color válido (solo letras).");
            }
        }

        return color; // Retornar el color válido
    }
}

