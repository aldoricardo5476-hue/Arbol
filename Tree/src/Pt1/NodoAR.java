/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pt1;

public class NodoAR {
    int dato;
    NodoAR hijoiz, hijod;
    
    public NodoAR(int d){
        this.dato = d;
        this.hijod = null;
        this.hijoiz = null;
    }

    @Override
    public String toString() {
        return "NodoAR{" + "dato=" + dato + '}';
    }
}
