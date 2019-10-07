/**
 * Write a description of class Carpetas here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class BinaryTree {
    public static Node root;

    public static void BinaryTree(){
        root = null;
    }

    public static boolean nulo(){
        return (root == null);
    }

    public static void insertar(int key){
        Node nuevo = new Node(key);
        if (nulo()) {
            root = nuevo;
        }
        else {
            Node temporal = root;
            while (temporal != null) {
                nuevo.p = temporal;
                if (nuevo.llave >= temporal.llave) {
                    temporal = temporal.right;
                } else {
                    temporal = temporal.left;
                }
            }
            if (nuevo.llave < nuevo.p.llave) {
                nuevo.p.left = nuevo;
            } else {
                nuevo.p.right = nuevo;
            }
        }
    }

    public static void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.llave);
        }

    }

    public static void recursivePrint()
    {
        recursivePrintAUX(root);
    }

}
