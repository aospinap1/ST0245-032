import java.util.LinkedList;
import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * Write a description of class ImportanciaDeDatos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImportanciaDeDatos extends MarcoDeDatos
{
    public static void procesarDatosPh () {
        LinkedList <Double> info = new LinkedList <>();
        DecimalFormat formato1 = new DecimalFormat("#0.00");
        System.out.println ("Ph:");
        for (double i = 4.52; i <= 9.32; i += 0.60) {
            double contNo = 0;
            double contSi = 0;
            double totalIguales = 0;
            for (int j = 0; j < arreglo.size(); j++) {
                if (arreglo.get(j).getPh() >= i && arreglo.get(j).getPh() < (i+0.60)){
                    if (arreglo.get(j).getLabel().equals("yes")) {
                        contSi ++;
                        totalIguales ++;
                    } else {
                        contNo ++;
                        totalIguales ++;
                    }
                }
            }
            double pos = contSi/totalIguales;
            double nega = contNo/totalIguales;
            double posi = 0; 
            double negai = 0;
            if (pos == 0) {
                posi=0;
            }else{
                posi = -pos *(Math.log(pos)/Math.log(2));
            }
            if (nega == 0) {
                negai=0;
            }else{
                negai = -nega *(Math.log(nega)/Math.log(2));
            }
            double total = posi + negai;
            double imp = (totalIguales/300.0)*total;
            System.out.println ("Imp en el intervalo "+formato1.format(i)+"-"+formato1.format(i+0.6)+":\t"+formato1.format(imp));
            info.add (imp);
        }
        double suma = 0;
        System.out.println ("Importancia del ph:");
        for (int i = 0; i < info.size(); i++) {
            suma += info.get(i);
        } 
        System.out.println (formato1.format(suma));
        System.out.println("");
    }

    public static void procesarDatosTemp () {
        LinkedList <Double> info = new LinkedList <>();     
        DecimalFormat formato1 = new DecimalFormat("#0.00");
        System.out.println ("Temperatura del suelo:");
        for (double i = 18.5; i <= 30.5; i += 1.5) {
            double contNo = 0;
            double contSi = 0;
            double totalIguales = 0;
            for (int j = 0; j < arreglo.size(); j++) {
                if (arreglo.get(j).getTemp() >= i && arreglo.get(j).getTemp() < i+1.5){
                    if (arreglo.get(j).getLabel().equals("yes")) {
                        contSi ++;
                        totalIguales ++;
                    } else {
                        contNo ++;
                        totalIguales ++;
                    }
                }
            }
            double pos = contSi/totalIguales;
            double nega = contNo/totalIguales;
            double posi = 0; 
            double negai = 0;
            if (pos == 0) {
                posi=0;
            }else{
                posi = -pos *(Math.log(pos)/Math.log(2));
            }
            if (nega == 0) {
                negai=0;
            }else{
                negai = -nega *(Math.log(nega)/Math.log(2));
            }
            double total = posi + negai;
            double imp = (totalIguales/300.0)*total;
            System.out.println ("Imp en el intervalo "+formato1.format(i)+"-"+formato1.format(i+0.6)+":\t"+formato1.format(imp));
            info.add (imp);
        }
        double suma = 0;
        System.out.println ("Importancia de la temperatura del suelo:");
        for (int i = 0; i < info.size(); i++) {
            suma += info.get(i);
        } 
        System.out.println (formato1.format(suma));
        System.out.println("");
    }

    public static void procesarDatosMoisture() {
        LinkedList <Double> info = new LinkedList <>();     
        DecimalFormat formato1 = new DecimalFormat("#0.00");
        System.out.println ("Humedad del suelo:");
        for (double i = 13.41; i <= 81.4; i += 9) {
            double contNo = 0;
            double contSi = 0;
            double totalIguales = 0;
            for (int j = 0; j < arreglo.size(); j++) {
                if (arreglo.get(j).getMoisture() >= i && arreglo.get(j).getMoisture() < i+9){
                    if (arreglo.get(j).getLabel().equals("yes")) {
                        contSi ++;
                        totalIguales ++;
                    } else {
                        contNo ++;
                        totalIguales ++;
                    }
                }
            }
            double pos = contSi/totalIguales;
            double nega = contNo/totalIguales;
            double posi = 0; 
            double negai = 0;
            if (pos == 0) {
                posi=0;
            }else{
                posi = -pos *(Math.log(pos)/Math.log(2));
            }
            if (nega == 0) {
                negai=0;
            }else{
                negai = -nega *(Math.log(nega)/Math.log(2));
            }
            double total = posi + negai;
            double imp = (totalIguales/300.0)*total;
            System.out.println ("Imp en el intervalo "+formato1.format(i)+"-"+formato1.format(i+0.6)+":\t"+formato1.format(imp));
            info.add (imp);
        }
        double suma = 0;
        System.out.println ("Importancia de la humedad del suelo:");
        for (int i = 0; i < info.size(); i++) {
            suma += info.get(i);
        } 
        System.out.println (formato1.format(suma));
        System.out.println("");
    }

    public static void procesarDatosIluminance() {
        LinkedList <Double> info = new LinkedList <>();     
        DecimalFormat formato1 = new DecimalFormat("#0.00");
        System.out.println ("Iluminacion:");
        for (double i = 455; i <= 13159; i += 1588) {
            double contNo = 0;
            double contSi = 0;
            double totalIguales = 0;
            for (int j = 0; j < arreglo.size(); j++) {
                if (arreglo.get(j).getIluminance() >= i && arreglo.get(j).getIluminance() < i+1588){
                    if (arreglo.get(j).getLabel().equals("yes")) {
                        contSi ++;
                        totalIguales ++;
                    } else {
                        contNo ++;
                        totalIguales ++;
                    }
                }
            }
            double pos = contSi/totalIguales;
            double nega = contNo/totalIguales;
            double posi = 0; 
            double negai = 0;
            if (pos == 0) {
                posi=0;
            }else{
                posi = -pos *(Math.log(pos)/Math.log(2));
            }
            if (nega == 0) {
                negai=0;
            }else{
                negai = -nega *(Math.log(nega)/Math.log(2));
            }
            double total = posi + negai;
            double imp = (totalIguales/300.0)*total;
            System.out.println ("Imp en el intervalo "+formato1.format(i)+"-"+formato1.format(i+0.6)+":\t"+formato1.format(imp));
            info.add (imp);
        }
        double suma = 0;
        System.out.println ("Importancia de la iluminacion:");
        for (int i = 0; i < info.size(); i++) {
            suma += info.get(i);
        } 
        System.out.println (formato1.format(suma));
        System.out.println("");
    }

    public static void procesarDatosTemp_env() {
        LinkedList <Double> info = new LinkedList <>();     
        DecimalFormat formato1 = new DecimalFormat("#0.00");
        System.out.println ("Temperatura del ambiente:");
        for (double i = 15; i <= 35.8; i += 2.6) {
            double contNo = 0;
            double contSi = 0;
            double totalIguales = 0;
            for (int j = 0; j < arreglo.size(); j++) {
                if (arreglo.get(j).getTemp_env() >= i && arreglo.get(j).getTemp_env() < i+2.6){
                    if (arreglo.get(j).getLabel().equals("yes")) {
                        contSi ++;
                        totalIguales ++;
                    } else {
                        contNo ++;
                        totalIguales ++;
                    }
                }
            }
            double pos = contSi/totalIguales;
            double nega = contNo/totalIguales;
            double posi = 0; 
            double negai = 0;
            if (pos == 0) {
                posi=0;
            }else{
                posi = -pos *(Math.log(pos)/Math.log(2));
            }
            if (nega == 0) {
                negai=0;
            }else{
                negai = -nega *(Math.log(nega)/Math.log(2));
            }
            double total = posi + negai;
            double imp = (totalIguales/300.0)*total;
            System.out.println ("Imp en el intervalo "+formato1.format(i)+"-"+formato1.format(i+0.6)+":\t"+formato1.format(imp));
            info.add (imp);
        }
        double suma = 0;
        System.out.println ("Importancia de la temperatura del ambiente:");
        for (int i = 0; i < info.size(); i++) {
            suma += info.get(i);
        } 
        System.out.println (formato1.format(suma));
        System.out.println("");
    }

    public static void procesarDatosHumidity() {
        LinkedList <Double> info = new LinkedList <>();     
        DecimalFormat formato1 = new DecimalFormat("#0.00");
        System.out.println ("Humedad en el ambiente:");
        for (double i = 21; i <= 90.6; i += 8.7) {
            double contNo = 0;
            double contSi = 0;
            double totalIguales = 0;
            for (int j = 0; j < arreglo.size(); j++) {
                if (arreglo.get(j).getHumidity() >= i && arreglo.get(j).getHumidity() < i+8.7){
                    if (arreglo.get(j).getLabel().equals("yes")) {
                        contSi ++;
                        totalIguales ++;
                    } else {
                        contNo ++;
                        totalIguales ++;
                    }
                }
            }
            double pos = contSi/totalIguales;
            double nega = contNo/totalIguales;
            double posi = 0; 
            double negai = 0;
            if (pos == 0) {
                posi=0;
            }else{
                posi = -pos *(Math.log(pos)/Math.log(2));
            }
            if (nega == 0) {
                negai=0;
            }else{
                negai = -nega *(Math.log(nega)/Math.log(2));
            }
            double total = posi + negai;
            double imp = (totalIguales/300.0)*total;
            System.out.println ("Imp en el intervalo "+formato1.format(i)+"-"+formato1.format(i+0.6)+":\t"+formato1.format(imp));
            info.add (imp);
        }
        double suma = 0;
        System.out.println ("Importancia de la humedad en el ambiente:");
        for (int i = 0; i < info.size(); i++) {
            suma += info.get(i);
        } 
        System.out.println (formato1.format(suma));
        System.out.println("");
    }
}

