import java.util.ArrayList;
import java.util.Objects;

public abstract class Digraph {
	protected int size;

	/**
	* Constructor para el grafo dirigido
	* @param vertices el numero de vertices que tendra el grafo dirigido
	*/
	public Digraph(int vertices) {
		size = vertices;
	}

	/**
	* Metodo para añadir un arco nuevo, donde se representa cada nodo con un entero
	* y se le asigna un peso a la longitud entre un nodo fuente y uno destino	
	* @param source desde donde se hara el arco
	* @param destination hacia donde va el arco
	* @param weight el peso de la longitud entre source y destination
	*/
	public abstract void addArc(int source, int destination, int weight);

	/**
	* Metodo para obtener una lista de hijos desde un nodo, es decir todos los nodos
	* asociados al nodo pasado como argumento
	* @param vertex nodo al cual se le busca los asociados o hijos
	* @return todos los asociados o hijos del nodo vertex, listados en una ArrayList
	* Para más información de las clases:
 	* @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
	*/
	public abstract ArrayList<Integer> getSuccessors(int vertex);

	/**
	* Metodo para obtener el peso o longitud entre dos nodos
	* 
	* @param source desde donde inicia el arco
	* @param destination  donde termina el arco
	* @return un entero con dicho peso
	*/	
	public abstract int getWeight(int source, int destination);


	/**
	* Metodo que tiene la intencion de retornar el tamaño del grafo
	* @return tamaño del grafo
	*/
	public int size() {
		return size;
    }
}

/**
 * Implementacion de un grafo dirigido usando matrices de adyacencia
 *
 * @author Mauricio Toro, Mateo Agudelo, <su nombre>
 */
public class DigraphAM extends Digraph {
    private int[][] matriz;

    /**
     * Constructor para el grafo dirigido
     * @param vertices el numero de vertices que tendra el grafo dirigido
     *
     */
    public DigraphAM(int size) {
        super(size);
        matriz = new int[size][size];
    }

    /**
     * Metodo para añadir un arco nuevo, donde se representa cada nodo con un entero
     * y se le asigna un peso a la longitud entre un nodo fuente y uno destino	
     * @param source desde donde se hara el arco
     * @param destination hacia donde va el arco
     * @param weight el peso de la longitud entre source y destination
     */
    public void addArc(int source, int destination, int weight) {
        matriz[source][destination] = weight;
    }

    /**
     * Metodo para obtener una lista de hijos desde un nodo, es decir todos los nodos
     * asociados al nodo pasado como argumento
     * @param vertex nodo al cual se le busca los asociados o hijos
     * @return todos los asociados o hijos del nodo vertex, listados en una ArrayList
     * Para más información de las clases:
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
     */
    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList<Integer> respuesta = new ArrayList<Integer>();
        for (int i = 0 ; i < size; i++)
            if (matriz[vertex][i] != 0)
                respuesta.add(i);
        return respuesta;
    }

    /**
     * Metodo para obtener el peso o longitud entre dos nodos
     * 
     * @param source desde donde inicia el arco
     * @param destination  donde termina el arco
     * @return un entero con dicho peso
     */	
    public int getWeight(int source, int destination) {
        return matriz[source][destination];
    }
}


/**
 * Implementacion de un grafo dirigido usando listas de adyacencia
 *
 * @author Mauricio Toro, Mateo Agudelo, <su nombre>
 */
public class DigraphAL extends Digraph {
    ArrayList<LinkedList<Pair<Integer,Integer>>> listaDeListas;

    /**
     * Constructor para el grafo dirigido
     * @param vertices el numero de vertices que tendra el grafo dirigido
     *
     */
    public DigraphAL(int size) {
        super(size);
        listaDeListas = new ArrayList<LinkedList<Pair<F,S>>>();
    }

    /**
     * Metodo para añadir un arco nuevo, donde se representa cada nodo con un entero
     * y se le asigna un peso a la longitud entre un nodo fuente y uno destino	
     * @param source desde donde se hara el arco
     * @param destination hacia donde va el arco
     * @param weight el peso de la longitud entre source y destination
     */
    public void addArc(int source, int destination, int weight) {

    }

    /**
     * Metodo para obtener una lista de hijos desde un nodo, es decir todos los nodos
     * asocia-dos al nodo pasado como argumento
     * @param vertex nodo al cual se le busca los asociados o hijos
     * @return todos los asociados o hijos del nodo vertex, listados en una ArrayList
     * Para más información de las clases:

     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
     */
    public ArrayList<Integer> getSuccessors(int vertex) {

    }

    /**
     * Metodo para obtener el peso o longitud entre dos nodos
     * 
     * @param source desde donde inicia el arco
     * @param destination  donde termina el arco
     * @return un entero con dicho peso
     */	
    public int getWeight(int source, int destination) {

    }
}

/**
 * Contenedor para dos objetos de cualquier tipo. Basada en la implementacion de
 * Android.
 * @author Camilo Paez
 */
public class Pair<F, S> {
    public final F first;
    public final S second;

    /**
     * Constructor de pares
     * @param first primer objeto del par.
     * @param second segundo objeto del par.
     */
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Verifica si dos pares son equivalentes. Se comparan los objetos
     * correspondientes uno a uno: first con first, second con second.
     *
     * @param o el par con el cual este par (this) sera verificado
     * @return true (verdadero) si los objetos en cada 'componente' son
     * equivalentes entre si.
     */

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Pair)) {
            return false;
        }

        Pair<F, S> p = (Pair<F, S>) o;
        return Objects.equals(p.first, first) && Objects.equals(p.second, second);
    }

    /**
     * Computa el hash del objeto en base al hash de cada objeto que contiene.
     *
     * @return hash del par.
     */
    @Override
    public int hashCode() {
        int hashFirst = (first == null) ? 0 : first.hashCode();
        int hashSecond = (second == null) ? 0 : second.hashCode();
        return hashFirst ^ hashSecond;
    }

    @Override
    public String toString() {
        return "Pair{" + String.valueOf(first) + " " + String.valueOf(second) + "}";
    }

    /**
     * Metodo utilitario para crear un par debidamente tipado. Se recomienda
     * usar este en vez del constructor.
     * 
     * @param first  primer objeto del par.
     * @param second segundo objeto del par.
     * @return un par que contiene a 'a' y a 'b', y fue debidamente creado en
     * base al tipo de objeto que estos son.
     */
    public static <A, B> Pair<A, B> makePair(A a, B b) {
        return new Pair<A, B>(a, b);
    }

}