
/**
 * Write a description of class Taller9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taller9
{
    class Nodo {
        public int dato;
        public Nodo izq;
        public Nodo der;
        public Nodo (int d) {dato = d;}
    }

    class Arbol {
        public Nodo raiz;
        private boolean buscar(Nodo n, int k){
            if (n == null)
                return false;
            else {
                if (n.dato == k)
                    return true;
                else {
                    if (k < n.dato)    // T(n/2)
                        return buscar(n.izq,k);
                    return buscar(n.der, k); //else  T(n/2)
                    // T(n) = T(n/2) + C es O(log n)
                }
            }  
        }

        public boolean buscar(int k){
            return buscar(raiz, k);
        }

        private String toString(Nodo n){
            if (n.izq == null && n.der == null)
                return "";
            else //Falla cuando sólo tiene un hijo
                return "\""+n.dato+"\"->\""+n.izq.dato+"\"\n"+
                "\""+n.dato+"\"->\""+n.der.dato+"\"\n"+
                toString(n.izq)+toString(n.der);
        }

        public String toString(){
            return "digraph G {\n"+toString(raiz)+"\n}";
        }
    }
}
