import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password to check its strength:");
        String password = input.nextLine();
        int strength = 0; // a variable to store the strength score
        // check if the password has at least 8 characters
        if (password.length() >= 8) {
            strength++;
        }
        // check if the password has at least one uppercase letter
        if (password.matches(".*[A-Z].*")) {
            strength++;
        }
        // check if the password has at least one lowercase letter
        if (password.matches(".*[a-z].*")) {
            strength++;
        }
        // check if the password has at least one digit
        if (password.matches(".*[0-9].*")) {
            strength++;
        }
        // check if the password has at least one special character
        if (password.matches(".*[!@#$%^&*].*")) {
            strength++;
        }
        // display the strength score and the corresponding message
        System.out.println("The strength score of the password is " + strength);
        switch (strength) {
            case 0:
            case 1:
                System.out.println("The password is very weak.");
                break;
            case 2:
                System.out.println("The password is weak.");
                break;
            case 3:
                System.out.println("The password is medium.");
                break;
            case 4:
                System.out.println("The password is strong.");
                break;
            case 5:
                System.out.println("The password is very strong.");
                break;
        }
        input.close();
    }
}
