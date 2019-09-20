
/**
 * Write a description of class Array2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2
{
    public int countEvens(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] % 2 == 0) {
                a++;
            }
        }
        return a;
    }

    public int bigDiff(int[] nums) {
        int max = nums [0];
        int min = nums [0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min (min, nums [i]);
            max = Math.max (max, nums [i]);
        }
        return max-min;
    }

    public int centeredAverage(int[] nums) {
        int min = nums [0];
        int max = nums [0];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min (min, nums[i]);
            max = Math.max (max, nums[i]);
            a += nums [i];
        }
        return (a-min-max)/(nums.length-2);
    }

    public int sum13(int[] nums) {
        int a = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums [i] == 13 && i != nums.length-1) {
                nums [i] = 0;
                nums [i+1] = 0;
            } else if (nums [i] == 13 && i == nums.length-1) {
                nums [i] = 0;
            }
            a += nums [i];
        }
        if (nums.length == 0) {
            return 0;
        }
        return a;
    }

    public String[] fizzBuzz(int start, int end) {
        String a [] = new String [end - start];
        for (int i = 0; i < a.length; i++) {
            if ((i+start) % 3 == 0 && (i+start) % 5 == 0) {
                a [i] = "FizzBuzz";
            } else if ((i+start) % 3 == 0) {
                a [i] = "Fizz";
            } else if ((i+start) % 5 == 0) {
                a [i] = "Buzz";
            } else {
                a [i] = ""+(i+start);
            }
        }
        return a; 
    }
}
