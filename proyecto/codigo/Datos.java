/**
 * Esta clase es la que crea los objetos del proyecto.
 * @author (Andrés Ospina Patiño)
 * @version (31 de mayo de 2019)
 */
public class Datos
{
    // instance variables - replace the example below with your own
    private Double ph; // Para poder poner el null.
    private Double temp;
    private Double moisture;
    private Double iluminance;
    private Double temp_env;
    private Double humidity;
    private String label;

    public Datos (Double ph, Double temp, Double moisture, Double iluminance,Double temp_env, Double humidity, String label) {
        this.ph = ph; 
        this.temp = temp;
        this.moisture = moisture;
        this.iluminance = iluminance;
        this.temp_env = temp_env;
        this.humidity = humidity;
        this.label = label;
    }

    public Double getPh () {
        return ph;
    }

    public Double getTemp () {
        return temp;
    }

    public Double getMoisture () {
        return moisture;
    }

    public Double getIluminance () {
        return iluminance;
    }

    public Double getTemp_env () {
        return temp_env;
    }

    public Double getHumidity () {
        return humidity;
    }

    public String getLabel () {
        return label;
    }
}
