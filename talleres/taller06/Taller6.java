public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva parámetros en este caso.
     */
    public MiArrayList() {
        size = 0; 
        elements = new int [DEFAULT_CAPACITY];
    }     

    /**
     * Tiene la intención de retornar la longitud del objeto
     * @return longitud del objeto
     *
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        return this.size;
    }   

    /** 
     * @param e el elemento a guardar
     * Agrega un elemento e a la última posición de la lista
     *
     */
    public void add(int e) {
        if (size == elements.length) {
            int [] nums = new int [2*elements.length];
            for (int i = 0; i < elements.length; i++) {
                nums [i] = elements [i]; 
            }
            elements = nums; 
        }
        elements [size] = e;
        size++;
    }    

    /** 
     * @param i es un íncide donde se encuentra el elemento posicionado
     * Retorna el elemento que se encuentra en la posición i de la lista.
     *
     */
    public int get(int i) {
        return elements[i];
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e el elemento a guardar
     * Agrega un elemento e en la posición index de la lista
     *
     */
    public void add(int index, int e) {
        if (index > elements.length-1) {
            add(e);
        } else {
            for (int i = elements.length; i >= index; i--) {
                elements [i+1] = elements [i];
            }
            elements [index] = e; 
            size++;
        }
    } 

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     *
     * ELimina el elemento  en la posición index de la lista
     *
     */
    public void del(int index){
        for (int i = index; i < elements.length; i++) {
            elements [i-1] = elements [i];
        }
        size--;
    }
    
    
}