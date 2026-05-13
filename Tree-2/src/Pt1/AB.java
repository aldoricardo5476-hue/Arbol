
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
    public boolean isVacio(){
        return raiz == null;
    }
    public void preOrden(NodoAR r){
        if(r != null){
            System.out.println(r.dato);
            preOrden(r.hijoiz);
            preOrden(r.hijod);
        }
}
  public void inOrden(NodoAR r){
        if(r != null){
            inOrden(r.hijoiz);
            System.out.println(r.dato);
            inOrden(r.hijod);
        }
  }
   public void postOrden(NodoAR r){
        if(r != null){
            preOrden(r.hijoiz);
            preOrden(r.hijod);
            System.out.println(r.dato);
        }
   }
   public NodoAR buscarNodo(int d){
       NodoAR aux = raiz;
       while(aux.dato != d){
           if (d < aux.dato){
               aux = aux.hijoiz;
           }else{
               aux = aux.hijod;
           }
           if(aux == null){
               return null;
           }
       }
           return aux;
   }
}
