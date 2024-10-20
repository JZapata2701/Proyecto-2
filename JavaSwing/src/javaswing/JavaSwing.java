/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing;

/**
 *
 * @author PC267
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                FmrMainBlockbuster mainFrame = new FmrMainBlockbuster();

                
                mainFrame.setVisible(true);

                // Establecer una operación de cierre cuando el usuario cierra la ventana
                mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                
                // Opcional: Establecer el tamaño del JFrame
                mainFrame.setSize(700, 500); // Puedes ajustar el tamaño según lo que necesites

                // Opcional: También puedes usar pack() si quieres que el tamaño del JFrame se ajuste automáticamente a los componentes
                // mainFrame.pack();
            }
        });
        
        
        
    }
    
}
