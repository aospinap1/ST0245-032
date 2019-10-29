import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;
/**
 * Esta clase permite descargar, leer y guardar el archivo en un arreglo.
 * @author (Andrés Ospina Patiño)
 * @version (31 de mayo de 2019)
 */
public class MarcoDeDatos
{
    static ArrayList <Datos> arreglo = new ArrayList <>();
    static Scanner input;
    static String [] encabezado;
    public static void cargarArchivo (String nombre) throws FileNotFoundException {
        File file = new File (nombre);
        input = new Scanner (file);

        encabezado = input.nextLine().split(",");
        while (input.hasNextLine()) {
            String [] cargar = input.nextLine().split(",");
            Datos dato = new Datos (Double.parseDouble (cargar [0]), Double.parseDouble (cargar [1]), Double.parseDouble (cargar [2]), 
                    Double.parseDouble (cargar [3]), Double.parseDouble (cargar [4]), Double.parseDouble (cargar [5]), cargar [6]);
            arreglo.add (dato);
        } 
    }

    public static void imprimirArchivo () {
        for (int i = 0; i < encabezado.length; i++) {
            System.out.print ("\t"+encabezado[i]);
        }
        System.out.println ();
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println ("\t"+arreglo.get(i).getPh()+"\t"+arreglo.get(i).getTemp()+"\t"+arreglo.get(i).getMoisture()+"\t"
                +arreglo.get(i).getIluminance()+"\t"+arreglo.get(i).getTemp_env()+"\t"+arreglo.get(i).getHumidity()+"\t"+arreglo.get(i).getLabel());
        }
    }
}