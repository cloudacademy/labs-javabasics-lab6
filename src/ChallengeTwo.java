public class ChallengeTwo {
    public static double stringToDouble(String number) {
        /**
         * Return a double storing the value in the string number
         * Arguments
         * number - a string representing a double floating-point number
         * Examples
         * odds("3.14159") returns the double 3.14159
        */

        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code to store the number string in a double and return the double
        
    
        // ====================================
        // Do not change the code after this
    }

    public static void main(String[] args) {
        double theDouble = stringToDouble("3.14159");
        double expected = 3.14159;
        // Expected output is 
        // true
        System.out.println(theDouble == expected);
    }
}