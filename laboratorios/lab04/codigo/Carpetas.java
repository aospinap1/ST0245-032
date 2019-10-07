import java.util.HashMap;
/**
 * Write a description of class Carpetas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carpetas
{
    private String usuario;
    private String tamaño;
    private String nombre;
    public Carpetas (String usuario, String tamaño, String nombre) {
        this.usuario = usuario; 
        this.tamaño = tamaño; 
        this.nombre = nombre;
    }
    
    public  String getUsuario (){
        return usuario;
    }
    public  String getTamaño (){
        return tamaño;
    }
    public  String getNombre (){
        return nombre;
    }
}
