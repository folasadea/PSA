import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner and initialisation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = sc.nextLine();
        int score = 0;


        //password length has to be at least 8 characters
        if(password.length() < 8) {
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
            System.out.println("Your password must contain at least one lowercase letter");
        } else {
            score++;
        }

        //password has to contain at lease one symbol
        if(!password.matches(".*[!\"\\#$%&'()*+,\n" + "\\-./:;<=>?@\\[\n" + "\\\\\\]^_`{|}~].*")) {
            System.out.println("Your password must contain at least one symbol");
        } else {
            score++;
        }

        if (password.contains("123456") || password.contains("123456789") || password.contains("qwerty") || password.contains("password") || password.contains("11111111") ||
                password.contains("12345678") || password.contains("abc123") || password.contains("1234567") || password.contains("password1") || password.contains("12345") ||
                password.contains("1234567890") || password.contains("123123") || password.contains("000000") || password.contains("Iloveyou") || password.contains("1234") ||
                password.contains("1q2w3e4r5t") || password.contains("Qwertyuiop") || password.contains("123") || password.contains("Monkey") || password.contains("Dragon")) {
            System.out.println("Your password strength is 0/5: extremely weak");
        }

        if (score == 1||score == 2) {
            System.out.println("Your password strength is " + score + "/5: weak.");
        } else if(score == 3) {
            System.out.println("Your password strength is " + score + "/5: medium.");
        } else if (score == 4|| score == 5) {
            System.out.println("Your password strength is " + score + "/5: strong.");
        }
    }
}