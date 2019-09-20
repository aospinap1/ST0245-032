
/**
 * Write a description of class Recursión1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursión1
{
        public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n*factorial(n-1));
    }

    public int bunnyEars(int bunnies) {

        if (0 == bunnies) {
            return 0;
        }

        return 2 + bunnyEars (bunnies -1);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci (n-1) + fibonacci (n-2); 
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 != 0) {
            return 2 + bunnyEars2 (bunnies - 1);
        } else {
            return 3 + bunnyEars2 (bunnies - 1);
        }
    }

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle (rows - 1);
    }

    public int countX(String str) {
        if (str.equals ("")) {
            return 0; 
        } else if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring (1)); 
        }
        return 0 + countX(str.substring (1));
    }

    public int countHi(String str) {
        if(str.length() < 2)
            return 0;

        if(str.substring(0, 2).equals("hi"))
            return 1 + countHi(str.substring(2));

        return countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if (str.equals("")) {
            return str;
        } else {
            if (str.charAt(0) == 'x') {
                return "y"+ changeXY(str.substring (1));
            } else {
                return str.charAt(0) + changeXY(str.substring(1));
            }
        }
    }

    public String changePi(String str) {
        if (str.equals("")) {
            return str;
        } else {
            if (str.length() > 1) {
                if (str.substring(0,2).equals("pi")) {
                    return "3.14" + changePi(str.substring (2));
                }
            }
            return str.charAt(0) + changePi(str.substring (1));
        }
    }

    public String noX(String str) {
        if (str.equals("")) {
            return str;
        } else {
            if (str.charAt(0) == 'x') {
                return "" + noX(str.substring(1));
            }
            return str.charAt(0) + noX(str.substring(1));
        }
    }

}
