
/**
 * Write a description of class Taller5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 * La clase Taller5 tiene la intención de resolver el taller número 5.
 *
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class Taller5 {  
    public static void main (String [] args) {
        System.out.println ("Tiempo de sumar los elementos de un arreglo");
        for (int i = 0; i < 20; i++) {
            long start = System.currentTimeMillis ();
            suma (nuevoArreglo (i*180000));
            long end = System.currentTimeMillis ();
            System.out.println (end -start);
        }
        /*System.out.println ("");
        System.out.println ("Tiempo de tablas de multiplicar:");
        for (int i = 0; i < 20; i++) {
            long start = System.currentTimeMillis ();
            mul (i*43500);
            long end = System.currentTimeMillis ();
            System.out.println (end -start);
        }*/
        System.out.println ("");
        System.out.println ("Tiempo de ordenar un arreglo:");
        for (int i = 0; i < 20; i++) {
            long start = System.currentTimeMillis ();
            insertionSort (nuevoArreglo (i*435));
            long end = System.currentTimeMillis ();
            System.out.println (end -start);
        }
    }
    
    public static int[]nuevoArreglo (int tamaño) {
        int[] arreglo = new int [tamaño];
        for(int i = 0 ; i < tamaño ; i++){
           int num = (int) (Math.random()*100); 
           arreglo[i] = num;
        }
        return arreglo;
    }

    /**
     * @param array es una arreglo de numeros enteros.
     * El método suma tiene la intención de hacer el proceso de suma
     * mediante una funcion cíclica (while/for/...)
     * @return la suma de todos los numeros sumados.
     */
    public static int suma (int[]array){
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            cont += array [i]; // O(n)
        }
        return cont;
    }

    /**
     * @param num es el numero el cual se utiliza para ser multiplicado.
     * El método mul tiene la intención de hacer la multiplicación
     * de 1 a n por el numero mul
     * mediante una funcion cíclica (while/for/...)
     * 
     */
    public static void mul (int num){
        int aux = 0;   
        for (int i = 1; i <= num; i++) {
            System.out.println ("Tabla del " +i+ " hasta n:");
            for (int j = 1; j <= num; j++) {
                System.out.println (i + " x " +j+ " = " + i*j);                
            }
        } //O(n^2)
        System.out.println ();
    }

    /**
     * @param array es un arreglo de números desordenados
     * El método insertionSort tiene la intención ordenar los números
     * del arreglo array por el método insertion:
     * @see <a href="https://www.youtube.com/watch?v=OGzPmgsI-pQ"> Insertion Sort <a/>
     * mediante la anidación de funciones cíclicas (while/for/...)
     * 
     */
    public static int[] insertionSort (int[] array){
        int aux = 0;   
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array [i] > array [j]) {
                    aux = array [i];
                    array [i] = array [j];
                    array [j] = aux; 
                }
            }
        }
        return array; //O(n^2)
    }    
}
