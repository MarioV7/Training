/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;
import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
import javax.swing.JOptionPane;
/**
 *
 * @author strik
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static int sumar(int x,int y) {
        int suma = x+y;
        return suma;
    }
    
    public static void pedirAcceso() {
        String U = "mario";
        String C = "1907";
        boolean bucle = true;
        
        while (bucle) {    
            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema. \n"
                    + "Primero debemos verificar sus datos.");
            String usuario = JOptionPane.showInputDialog("Ingrese el usuario:");
            String contra = JOptionPane.showInputDialog("Ingrese su contraseña:");

            if (U.equals(usuario)) {
                if (C.equals(contra)) {
                    JOptionPane.showMessageDialog(null, "Ha ingresado correctamente.\n"+"Bienvenido al Sistema.");
                    bucle = false;
                } else {
                JOptionPane.showMessageDialog(null, 
                        "La contraseña introducida es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                        "El usuario introducido es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    String[] login = {"mario","1907"};
    
    
    public static void main(String[] args) {
        
        int aux = 1;
        
        for(int i=0; i<100; i++) {
            System.out.println(aux);
            aux++;
        }
                
        System.out.println(sumar(5,10));
        
        pedirAcceso();
        
    }
    
}
