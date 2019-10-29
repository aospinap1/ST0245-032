import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Ejecutar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ejecutar
{
    static Scanner inPut;
    static String line;
    static MarcoDeDatos marcoDatos = new MarcoDeDatos(); 

    public static void main (String [] args) {
        inPut = new Scanner (System.in);
        line = "";
        boolean reload = true;
        while (reload) {
            try {
                if (line.equals("salir")) {
                    System.exit(0);
                } else {
                    line = inPut.nextLine();
                    marcoDatos.cargarArchivo(line);
                    reload = false;
                }
            } catch (Exception FileNotFoundException){
                System.out.println ("Hubo un error con el archivo");
                System.out.println ("Verifique que el archivo se encuentre en la carpeta y que escribió bien el nombre. Vuelva a ingresarlo");
            }  
        }
        MarcoDeDatos.imprimirArchivo ();
        ImportanciaDeDatos.procesarDatosPh ();
        ImportanciaDeDatos.procesarDatosTemp ();
        ImportanciaDeDatos.procesarDatosMoisture ();
        ImportanciaDeDatos.procesarDatosIluminance ();
        ImportanciaDeDatos.procesarDatosTemp_env ();
        ImportanciaDeDatos.procesarDatosHumidity ();
    }
}
