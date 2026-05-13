
package Pt1;

public class AB {
    NodoAR raiz;
    
    public AB(){
        raiz = null;
    }
    public void agregarnodo(int d){
        NodoAR nuevo = new NodoAR(d);
        if(raiz==null){
            raiz = nuevo;
        } else {
            NodoAR aux = raiz;
            NodoAR padre;
            while(true){
                padre = aux;
                if(d < aux.dato){
                    aux = aux.hijoiz;
                    if(aux == null){
                        padre.hijoiz = nuevo;
                        return;
                    }
                } else {
                    aux = aux.hijod;
                    if (aux == null){
                        padre.hijod = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
}
