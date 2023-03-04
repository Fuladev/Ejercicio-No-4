package com.diegofula.ejercicio4;

//  importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio4 {
    
    
    public static void main(String[] args) {
        //  Declaramos el Scanner con la variable scan
        Scanner scan = new Scanner(System.in);
        
        //  Pedimos al usuario la edad de Juan usando la herramienta scanner
        System.out.println("Digite la edad de Juan");
        int ejuan = scan.nextInt();
        
        //  Teniendo la edad de Juan calculamos la edad de Alberto sabiendo que es 2/3 la edad de Juan
        int ealberto = 2*ejuan/3;
        
        //  Teniendo la edad de Juan calculamos la edad de Ana sabiendo que es 4/3 la edad de Juan
        int eana = 4*ejuan/3;
        
        //  Teniendo las edades de los 3 hijos procedemos a calcular la edad de la madre, sabiendo que es la suma de los 3
        int emadre = ejuan + ealberto + eana;
        System.out.println("La edad de la madre es de: " + emadre);
    }
    
}
