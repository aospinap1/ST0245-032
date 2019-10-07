
/**
 * Write a description of class Archivos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Archivos
{
    private String usuario;
    private String tamaño;
    private String nombre;
    private String tipoDeArchivo;
    
    public Archivos (String usuario, String tamaño, String nombre, String tipodeArchivo) {
        this.usuario = usuario; 
        this.tamaño = tamaño; 
        this.nombre = nombre;
        this.tipoDeArchivo = tipoDeArchivo;
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
    public  String getTipoDeArchivo (){
        return tipoDeArchivo;
    }
}
