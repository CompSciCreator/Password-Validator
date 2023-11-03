import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {

        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        int categories = 0; 
       

        if(containsLowercase(password)) {
            categories++;
        }
        if(containsUppercase(password)) {
            categories++;
        }
        if(containsNumbers(password)) {
            categories++;
        }
        if(containsSpecialSymbols(password)){
            categories++;
        }
        return categories >= 3;
    }

        public static boolean containsLowercase(String password) {
            return password.matches(".*[a-z].*");

        }
        public static boolean containsUppercase(String password){
            return password.matches(".*[A-Z].*");

        }
        public static boolean containsNumbers(String password) {
            return password.matches(".*[0-9].*");

        }

        public static boolean containsSpecialSymbols(String password){
        Pattern pattern = Pattern.compile(".*~!@#$%^&*()-=+_.*");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
        }

        
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a password:");
        String password = scanner.nextLine();
        scanner.close();
        boolean isValid = isValidPassword(password);
       
        if (isValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid");
        }  
        
        

        

    }


    
}
