/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pt1;

import java.util.Scanner;

/**
 *
 * @author aldoescobar
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        AB ar =new AB();
        do{
            System.out.println("menu");
            System.out.println("1. Insertar Dato ");
            System.out.println("2. Saliendo");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Dato a ingresar: ");
                        int n = sc.nextInt();
                       ar.agregarnodo(n);
                        break;
                case 2: 
                        System.out.println("Saliendo del programa...");
                        break;
                        
                default:
                        System.out.println("Opcion no valida");
                        break;
            }
        } while (op == 2);
        {
            
        }
    }
    
}
