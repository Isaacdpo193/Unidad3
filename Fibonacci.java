/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int a = 0, b = 1, c, n;
                
        System.out.println("Ingrese la cantidad de elemntos");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
        System.out.println(a);
        c = a+b;
        a = b;
        b = c;
        
        }
      
    }
    
}
