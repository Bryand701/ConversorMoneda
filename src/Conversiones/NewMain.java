/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conversiones;

/**
 *
 * @author bryan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conversion colonesDolares = new Conversion("Colones", "Dolares",542.92);
        System.out.println(colonesDolares.convertirPrincipalASecundario(542.92));
        System.out.println(colonesDolares.convertirSecundarioAPrincipal(2));
        System.out.println(colonesDolares);
        
        Conversion colonesYenes = new Conversion("Colones", "Yenes",3.75);
        System.out.println(colonesYenes.convertirPrincipalASecundario(542.92));
        System.out.println(colonesYenes.convertirSecundarioAPrincipal(2));
        System.out.println(colonesYenes);
        
        Conversion metroMil = new Conversion("Micrómetros", "Mil",25.4);
        System.out.println(metroMil.convertirPrincipalASecundario(25.4));
        System.out.println(metroMil.convertirSecundarioAPrincipal(1));
        System.out.println(metroMil);
        
        
    }
    
}
