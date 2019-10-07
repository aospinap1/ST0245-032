import java.util.HashMap;
import java.util.Scanner;
/**
 * Write a description of class Punto1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto1
{
    public static HashMap <String, Carpetas> carpetas = new HashMap <String, Carpetas> ();
    public static HashMap <String, Archivos> archivos = new HashMap <String, Archivos> ();
    public static Scanner input = new Scanner(System.in);
    public static String s = input.nextLine();
    public static int a = input.nextInt();
    
    public static void crearArbol () {
        arbol.insertar (1, carpetas);
        arbol.insertar (0, archivos);
    }
    
    public static String retornarUsuario (String s) {
        if (carpetas.get (s = input.nextLine()) != null) {
            return carpetas.get (s = input.nextLine()).getUsuario ();
        } 
        return archivos.get (s = input.nextLine()).getUsuario ();
    }

    public static String retornarTamaño (String s) {
        if (carpetas.get (s = input.nextLine()) != null) {
            return carpetas.get (s = input.nextLine()).getTamaño ();
        } 
        return archivos.get (s = input.nextLine()).getTamaño ();
    }

    public static String retornarNombre (String s) {
        if (carpetas.get (s = input.nextLine()) != null) {
            return carpetas.get (s = input.nextLine()).getNombre ();
        } 
        return archivos.get (s = input.nextLine()).getNombre ();
    }

    public static String retornarTipoDeArchivo(String s) {
        return archivos.get (s = input.nextLine()).getTamaño ();
    }

    public static void main (String [] args) {
        while (!s.equals(carpetas.get (s).getNombre ())){
            arbol.recorrer (arbol.root);
        }
    }
}
