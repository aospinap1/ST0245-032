
public class Laboratorio1{
    //Punto #1 secuencia mas larga
    public int  secuenciaMasLrga(char [] X, char [] Y, int a, int b){
        if (m == 0 || n == 0){  
            return 0;  
        }
        if (X[m-1] == Y[n-1]){
            return 1 + secuenciaMasLrga(X, Y, m-1, n-1);  
        }
        else
            return max(secuenciaMasLrga(X, Y, m, n-1), secuenciaMasLrga(X, Y, m-1, n));
    }
    // o(2n)




    //Punto #2 formas de llenar un rectangulo
    public int rectangulo(int n){
        if(n<=2){
            return n;
        } 
        return rectangulo(n-1)+rectangulo(n-2);
    }
}


