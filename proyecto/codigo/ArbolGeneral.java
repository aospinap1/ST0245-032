public class ArbolGeneral {
    Nodo raiz;

    public ArbolGeneral()
    {
        raiz = null;
    }

    public boolean vacia()
    {
        return (raiz == null) ? true : false;
    }

    public Nodo insertarRaiz(Object valor)
    {
        if (vacia())
        {
            raiz = new Nodo(valor);
        }
        return raiz;
    }

    public void insertarNodo(Nodo nodo,Object valor,String padre)
    {
        Nodo nuevo = new Nodo(valor);
        if(nodo.getValor().equals(padre))
        {
            nodo.nuevoHijo(nuevo); 
        }else {
            
        }
    }

    public String getRaiz() {
        return raiz.valor.toString();
    }
    
    
}