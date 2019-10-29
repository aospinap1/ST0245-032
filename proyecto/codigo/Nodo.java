public class Nodo {
    Object valor; //para almacenar cualquier valor
    Nodo hermano;//variable nodo padre
    Nodo hijo;//variable nodo padre
    int numHijos;
 
    //Creando los constructores
    public Nodo(Object valor)
    {
        this.valor = valor;
        this.hermano = this.hijo = null;
 
    }
    public Nodo(Nodo hermano,Nodo hijo,Object valor)
    {
        this(valor);//invoca la variable valor del constructor anterior
        this.hermano = hermano;
        this.hijo = hijo;
    }
 
    /*
    Creando los metodos get a set para valor,padre e hijo
    */
    public Object getValor() {
        return valor;
    }
 
    public void setValor(Object valor) {
        this.valor = valor;
    }
 
    public Nodo getHermano() {
        return hermano;
    }
 
    public void setPadre(Nodo padre) {
        this.hermano = padre;
    }
 
    public Nodo getHijo() {
        return hijo;
    }
 
    public void setHijo(Nodo hijo) {
        this.hijo = hijo;
    }
 
    /* */
    public void nuevoHijo(Nodo nhj)
    {
        this.hijo = nhj;
        numHijos++;
    }
}