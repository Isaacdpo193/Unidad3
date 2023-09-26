/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1.pkgif.statemenr;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class Practica1IfStatemenr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scanner.nextInt();
        
        if(numero%2 ==0){
        System.out.println("El numero"+numero+"es par");
        }else{
        
        System.out.println("el numero es impar");
        }
    }
}
    
