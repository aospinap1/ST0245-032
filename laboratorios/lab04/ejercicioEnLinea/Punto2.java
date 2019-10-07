import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Punto2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto2
{
    public static Scanner input = new Scanner (System.in);
    public static ArrayList <Integer> arbol = new ArrayList <>();
    public static void agregarAlArreglo (){
        int a = 1;
        while (a != 0) {
            a = input.nextInt();
            if (a == 0) {
                break;
            }
            arbol.add (a);
        }
    }

    public static void main(String [] args){
        System.out.println ("Introduzca el arbol en pre-orden");
        agregarAlArreglo ();
        for (int i = 0; i < arbol.size(); i++) {
            BinaryTree.insertar (arbol.get(i));
        }
        BinaryTree.recursivePrintAUX(BinaryTree.root);
    }
}
