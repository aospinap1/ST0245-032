import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Estudiante{
 
    //Atributos del objeto estudiante 
    private String Nombre;
    private int Semestre;
    private String Materia;
    private double Nota;
    private int porcentaje;
    private int Definitva;

    public String getNombre() {return nombre;}
    public int getSemestre()  {return Semestre;}
    public String getMateria(){return Materia;}
    public double getNota()   {return Nota;}
    public int getPorcentaje(){return porcentaje;}
    public int getDfinitiva() {return Definitiva;}
    public string setNombre() {this.Nombre = nombre;}
    public int setSemestre()  {this.Semestre = semestre;}
    public String setMateria(){this.Materia = materia;}
    public double setNota()   {this.Nota = nota;}
    public int setPorcentaje(){this.Porcentaje = porcentaje;}
    public int Definitova()   {this.Definitiva = Definitiva;}
    public Estudiate(string Nombre, int Semestre, String Materia, double Nota) {
        this.Nombre = Nombre;
        this.Semestre = Semestre;
        this.Materia = Materia;
        this.Nota = Nota;
        this.Porcentaje = Porcentaje;
        this.Definitiva = Definitiva;
    }
}
//Clase para leer el archivo '.csv'


public class LectorDeDatos{
    public ArrayList<Estudiante> al = new ArrayList<>();

    public void leerEstudiante(String arch) throws exception{
        Scanner archivo = new Scanner(new File(arch));
        archivo.nextLine();
        String linea = null;
          while(archivo.hasNextLine()){
            linea = archivo.nextLine();
            linea = normalizarLinea(linea);
            String [] array = linea.split(",");
            String Nombre = array[0];
            array[1] = "-";
            array[2] = "-";
            int Semestre = Integer.parseInt(array[3]);
            array[4] = "-";
            array[5] = "-";
            array[6] = "-";
            array[7] = "-";
            int Porcentaje = Integer.parseInt(array[8]);
            array[9] = "-";
            String Materia = array[10];
            array[11] = "-";
            int Nota = Integer.parseInt(array[12]);
            int Definitiva = Integer.parseInt(array[13]);

            Estudiante estudiante = new Estudiante(nombre, semestre, porcentaje, materia, nota, definitiva);
            al.add(estudiante);
        }
    }
    private String normalizarLinea(String linea){
        return linea.replaceAll("\"", "").replaceAll(", ",".");
    }
}

public class Metodos{

    public void consulta1(ArrayList<>al, String materia, int semestre){
        for(Estudiante estudiante : al){
            if(estudiante.semestre == semestre && estudiante.materia == materia){
                System.out.println(estudiante.nombre + estudiante.definitiva);
            }
        }        
    }
    public void consulta2(ArrayList<>al, String name, int semestre){
        for(Estudiante estudiante : al){
            if(estudiante.nombre == name && estudiante.semstre == semestre){
                System.out.println(estudiante.materia + estudiante.nota);
            }
        }
    }
}

public class Main{

    LectorDeDatos ldd = new LectorDeDatos();
    Metodos marco = new Metodos();
    while(true){
        Scanner input = new Scanner(System.in);
        try{
              
            String nombreArchivo = input.next();
            ldd.leerDatos(nombreArchivo);
            System.out.println("El archivo se ha leído correctamente");
            String inpt = input.next();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Presione 1 para la primera consulta");
            System.out.println("Presione 2 para la segunda consulta");
            System.out.println("Presione 0 para salir");
            switch(inpt){
                case "1":
                System.out.println("Inserte la materia y el semestre: ");
                String palabra = input.nextLine();
                int numero = input.nextInt();
                marco.consulta1(ldd.al, palabra, numero);
                break;
                case "2":
                System.out.println("Inserte el nombre y el semestre: ");
                String pal = input.nextLine();
                int num = input.nextInt();
                marco.consulta2(ldd.al, pal, num);
                break;
                case "0":
                System.exit(0);
            }
        }
        catch (Exception e){
            System.out.println("No se pudo encontrar el archivo, por favor vuelva a intentar");
        }
    }
}
}
