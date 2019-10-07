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
    public static Scanner input = new Scanner(System.in);
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

    }

    public abb buscar(int a){
        abb arbolito = null;
        if (!esVacio()) {
            if (a == raiz.dato) {
                return this;
            }
            else {
                if (a < raiz.dato) {
                    arbolito = raiz.hi.buscar(a);
                }
                else {
                    arbolito = raiz.hd.buscar(a);
                }
            }
        }
        return arbolito;
    }
}