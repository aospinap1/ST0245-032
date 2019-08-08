
/**
 *La clase Taller5 dos tiene como objetivo dar solución al taller5
 *
 *@autor Mauricio Toro, Camilo Paez
 *@version 1
 */
import java.lang.Math;
public class Taller4 {

    public static void main (String [] args) {
        System.out.println ("Tiempo suma");
        for (int i = 0; i < 20; i++) {
            long startTime = System.currentTimeMillis();
            arrayMax (nuevoArreglo(i*20), 0);
            long tiempo = System.currentTimeMillis() - startTime;
            System.out.println (tiempo);
        }
        System.out.println ("");
        System.out.println ("Tiempo groupSum");
        for (int i = 0; i < 20; i++) {
            long startTime = System.currentTimeMillis();
            groupSum(0, nuevoArreglo(i*100), (int) (Math.random()*100)*20);
            long tiempo = System.currentTimeMillis() - startTime;
            System.out.println (tiempo);
        }
        System.out.println ("");
        System.out.println ("Tiempo fibonacci");
        for (int i = 0; i < 20; i++) {
            long startTime = System.currentTimeMillis();
            fibonacci(i*2);
            long tiempo = System.currentTimeMillis() - startTime;
            System.out.println (tiempo);
        }
    }
    
    public static int[]nuevoArreglo (int tamaño) {
        int[] arreglo = new int [tamaño];
        for(int i = 0 ; i < tamaño ; i++){
           int num = (int) (Math.random()*100)*200; 
           arreglo[i] = num;
        }
        return arreglo;
        }

    /**
     * @param array es un arreglo de numeros enteros
     * @param n la longitud del array anterior 
     *
     *en este método se busca hacer la suma de los numeros en un
     *arreglo de forma recursiva.
     *
     * @return la suma
     */
    public static int arrayMax(int[] array, int n) {
        if (array.length == n) {
            return 0;// C1
        } else {
            return array[n] + arrayMax (array, n+1); // f(n) = C2 + f(n-1)
        }
    }

    /**
     * @param start es un contador, nos sirve para saber cuando debemos parar
     * @param array es un arreglo de numeros enteros, representan volumen
     * @param target es la meta, el numero que debe alacanzar la suma 
     *
     * en este método se busca hacer la suma de los volumnes posibles
     * de modo que se acomode de tal forma que se alcance el valor target
     * pista: la clave esta en el numero de elementos y que no siempre se toman
     * los elementos, en ocaciones pasan por ejemplo en un conjuntos [5,6,7,8] para un
     * target 12 se toman el 5 y el 7 pasando por 6 sin cogerlo.
     *
     *
     * @return verdadero si hay una combinación que suponga el valor target, falso de lo contrario
     */
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0; // C1
        } else {
            return groupSum (start + 1, nums, target) || groupSum (start + 1, nums, target - nums [start]);  //f(n)=2(n-1)
        }
    }

    /**
     * @param n numero entero, hasta que numero se hace la serie
     *
     * el metodo se encarga de devolvernos el valor fibonacci en la enesima posicion
     * @see <a href="https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci"> fibonnaci <a/>
     * @return el valor encontrado en long dada la posible cantidad de bits
     */
    public static long fibonacci(int n) { 
        if (n == 0) {
            return 0; //C1
        } else if (n == 1) {
            return 1;//C2
        }else {
            return fibonacci (n-1) + fibonacci (n-2); //f(n) = f(n-1) + f(n-2)
        }
    }
}