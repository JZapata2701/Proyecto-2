
package javaapplication3;
 import javax.swing.JOptionPane;
/**
 *
 * @author PC267
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        

        String colorValido = Validacion.validarColor();

        // Crear un círculo con el color validado y radio 5.0
        Circulo circulo = new Circulo(colorValido, 5.0);

        // Crear los mensajes para mostrar en JOptionPane
        String mensajeColor = "Color del círculo: " + circulo.getColor();
        String mensajeRadio = "Radio del círculo: " + circulo.getRadio();
        String mensajeArea = "Área del círculo: " + circulo.calcularArea();

        // Mostrar la información en cuadros de diálogo
        JOptionPane.showMessageDialog(null, mensajeColor +"\n"+mensajeArea+"\n"+mensajeRadio);
       
    }
}
 
        
        
        
        
    
    

