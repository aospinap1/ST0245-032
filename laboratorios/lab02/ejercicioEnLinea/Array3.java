
/**
 * Write a description of class Array3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array3
{
    public int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length <= 3) {
            if (nums [0] == nums [nums.length-1] ||  nums.length == 1) {
                return nums.length;
            } else {
                return nums.length -1;
            }
        } else {
            return nums.length -1;
        }
    }

    public int[] fix34(int[] nums) {
        int aux = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums [i] == 3 && nums [i+1] != 4) {
                aux = nums [i+1];
                nums [i+1] = 4; 
            }
            if (nums [i] == 4 && nums [i-1] != 3) {
                nums [i] = aux; 
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums [i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums [j] == 5) {
                        if (j > 0 && nums [j-1] != 4) {
                            int aux = nums [i+1];
                            nums [i + 1] = 5; 
                            nums [j] = aux;
                        } else if (nums [0] == 5) {
                            int aux = nums [i+1];
                            nums [i+1] = 5;
                            nums [0] = aux;
                        }
                    }
                }
            } 
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i ++) {
            cont += nums [i];
            int cont2 = 0;
            for (int j = nums.length-1; j > i; j--) {
                cont2 += nums [j];
            }
            if (cont == cont2) {
                return true;
            }
        }
        return false;
    }

    public int[] seriesUp(int n) {
        int [] nums = new int [n*(n + 1)/2];
        int b = n;
        for (int i = 0; i < n; i++) {
            int a = b;
            for (int j = (b*(b + 1)/2)-1; j > ((b-1)*(b)/2)-1; j--) {
                nums [j] = a;
                a--;
            }
            b--;
        }
        return nums;
    }
}
