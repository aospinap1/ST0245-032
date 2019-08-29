import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedList {
    private Node first;
    Nodo siguiente = new Nodo();
    private int size;
    //Constructor 
    public LinkedList(){
	size = 0;
	first = null;	
    }

	/**
	 * Returns the node at the specified position in this list.
	 * @param index - index of the node to return
	 * @return the node at the specified position in this list
	 * @throws IndexOutOfBoundsException
	*/
	private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < size) {
			Node temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
         * @throws IndexOutOfBoundsException
	 */
	public int get(int index) throws IndexOutOfBoundsException {
		temp = getNode(index);
		return temp.data;
	}

    // Retorna el tamaño actual de la lista
    public int size(){
	return size;
    }

    //Busca un elemento de la lista
    private Nodo getConCiclos(int i){
        Nodo temporal =  elPrimerElementoDeLaLista;
        for(int j = 1; j<= i; j++){
            temporal = temporal.elSiguienteDespuesDeMi;
            return temporal;
        }
    }

    // Inserta un dato en la posición index
    public void insertar(int data, int index){
        Nodo nuevo = new Nodo(data);
        Nodo Imenos1 = getConCiclos(i-1);
        nuevo.elSiguienteDespuesDeMi = Imenos1.elSiguienteDespuesDeMi;
        Imenos1.elSiguienteDespuesDeMi = nuevo;
        return nuevo;
    }

    // Borra el dato en la posición index
    public void remove(int index){
        if(size>= index){
            remove.getConCiclos(index);
        }
	    System.out.print(size);
    }

    // Verifica si está un dato en la lista
    public boolean contains(int data){

    }

}