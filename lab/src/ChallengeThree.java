import java.time.LocalDate;

public class ChallengeThree {
    public static String dayOfWeek(String date) {
        /**
         * Returns a String storing the day of the week in all capital letters of the
         * given date String
         * Complete the implementation of the DateUtil class and use it in this function 
         * Arguments
         * date - a String storing a local date, such as "2000-01-01" 
         * Examples
         * dayOfWeek("2000-01-01") returns "SATURDAY"
         */

        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code to return the day of the week of the String date
        //        using the DateUtil class at the bottom of this file
        
    
        // ====================================
        // Do not change the code after this
    }

    public static void main(String[] args) {
        String theDayOfWeek = dayOfWeek("2000-01-01");
        String expected = "SATURDAY";
        // Expected output is 
        // true
        System.out.println(theDayOfWeek == expected);
    }
}

class DateUtil {
    LocalDate theDate;

    public DateUtil(String date) {
        /**
         * Initialize the theDate field using the String date argument
         * Arguments
         * date - a String storing a local date, such as "2000-01-01" 
         */

        // ====================================
        // Do not change the code before this
    
        // CODE2: Write code to initialize the date field of the class
        
    
        // ====================================
        // Do not change the code after this
    }

    public String dayOfWeek() {
        /**
         * Return a String the day of the week represented by theDate
         */

        // ====================================
        // Do not change the code before this
    
        // CODE3: Write code to return the String day of the week of theDate
        
    
        // ====================================
        // Do not change the code after this
    }
}