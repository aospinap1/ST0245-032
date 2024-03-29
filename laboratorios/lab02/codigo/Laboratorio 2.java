/**
 * Laboratorio 1 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @version 1
 */

import java.util.Arrays;

public class Laboratory1
{
  // Computer the sum of an array
  public static int ArraySum(int[] A)
  {          
      int sum = 0;
      for (int i = 0; i < A.length; i++)
         sum = sum + A[i];
      return sum;
  }
  
  // Computes the maximum value of an array
  public static int ArrayMax(int[] A)
  {
      int max = A[0];
      for (int i = 0; i < A.length; i++)
         if (A[i] > max)
           max = A[i];
      return max;
  }
  
  // Sorts an array using Insertion Sort
  public static void InsertionSort(int[] A)
  {
       int temp,j;
       for (int i = 0; i < A.length; i++)
       {
         j = i;
         while (j > 0 && A[j-1] > A[j])
           {
               temp = A[j];
               A[j] = A[j-1];
               A[j-1] = temp;
               j = j-1;
            }           
       }
       //System.out.println(Arrays.toString(A));
	System.out.println ("");  
  }

      // Sorts an array using Merge Sort
      // Taken from www.cs.cmu.edu/
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
    
  
  public static void main(String[] args) {
        /*long TInicio; 
        long TFin; 
        long tiempo;
        TInicio = System.currentTimeMillis();
        int[] A = {1,5,3,2,6};
        int[] B = {1,5,3,2};
        int[] C = {1,5,2,6};
        int[][] Arrays = {A,B,C};  
        for (int[] X : Arrays)
        {        
        Laboratory1.mergeSort(X);
        Laboratory1.InsertionSort(X);
        System.out.println(Laboratory1.ArraySum(X) + " " + Laboratory1.ArrayMax(X) + "\n" );      
        }
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);*/
        System.out.println ("Tiempo de Insertion Sort");
        for (int i = 0; i < 20; i++) {
            long start = System.currentTimeMillis ();
            InsertionSort (nuevoArreglo (i*435));
            long end = System.currentTimeMillis ();
            System.out.println (end -start);
        }
        System.out.println ("");
        System.out.println ("Tiempo de Merge Sort");
        for (int i = 0; i < 20; i++) {
            long start = System.currentTimeMillis ();
            mergeSort (nuevoArreglo (i*435));
            long end = System.currentTimeMillis ();
            System.out.println (end -start);
        }
    }

    public static int[]nuevoArreglo (int tamaño) {
        int[] arreglo = new int [tamaño];
        for(int i = 0 ; i < tamaño ; i++){
            int num = (int) (Math.random()*100); 
            arreglo[i] = num;
        }
        return arreglo;
    }
  
}
