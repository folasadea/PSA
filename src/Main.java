import java.util.Scanner;

public class Main {

    public void length() {

    }
    
    public static void main(String[] args) {
        //scanner and initialisation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = sc.nextLine();
        int plength = 0;
        int score = 0;

        //password length has to be at least 8 characters
        for(int i=1;i<=password.length(); i++) {
            plength++;
        }
        if(plength < 8) {
            System.out.println("Your password must be at least 8 characters");
        } else {
            score++;
        }

        //password has to contain at least one number
        if(!password.matches(".*\\d.*")) {
            System.out.println("Your password must contain at least one number");
        } else {
            score++;
        }

        //password has to contain at least one uppercase letter
        if(!password.matches(".*[A-Z].*")) {
            System.out.println("Your password must contain at least one uppercase letter");
        } else {
            score++;
        }

        //password has to contain at least lowercase letter
        if(!password.matches(".*[a-z].*")) {
            System.out.println("Your password must contain at least one uppercase letter");
        } else {
            score++;
        }

        //password has to contain at lease one symbol
        if(!password.matches(".*[!\"\\#$%&'()*+,\n" + "\\-./:;<=>?@\\[\n" + "\\\\\\]^_`{|}~].*")) {
            System.out.println("Your password must contain at least one symbol");
        } else {
            score++;
        }
        System.out.println("Your password strength is " + score + "/5");
    }
}