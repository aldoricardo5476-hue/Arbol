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
            System.out.println("2. Recorrido InOrden");
            System.out.println("3. Recorrido PreOrden");
            System.out.println("4. Recorrido PostOrden");
            System.out.println("5. Buscar dato");
            System.out.println("6. Salir");
            
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Dato a ingresar: ");
                        int n = sc.nextInt();
                       ar.agregarnodo(n);
                        break;
                case 2: 
                        if(!ar.isVacio()){
                            ar.inOrden(ar.raiz);
                        }else{
                            System.out.println("El arbol esta vacio");
                        }
                        break;
                case 3: 
                    if(!ar.isVacio()){
                            ar.preOrden(ar.raiz);
                        }else{
                            System.out.println("El arbol esta vacio");
                        }
                    break;
                    case 4: 
                    if(!ar.isVacio()){
                            ar.postOrden(ar.raiz);
                        }else{
                            System.out.println("El arbol esta vacio");
                        }
                    break;
                    case 5: 
                    if(!ar.isVacio()){
                       System.out.print("Dato a buscar: ");
                        int b = sc.nextInt(); 
                       if(ar.buscarNodo(b) == null){
                           System.out.println("Nodo no esta en el arbol");
                       }else{
                           System.out.println("Nodo encontrado");
                       }
                    }else{
                        System.out.println("Arbol Vacio");
                    }
                    break;
                case 6:
                   System.out.println("Saliendo del programa...");
                    break;
                default:
                        System.out.println("Opcion no valida");
                        break;
            }
        } while (op != 4);
        {
            
        }
    }
    
}
