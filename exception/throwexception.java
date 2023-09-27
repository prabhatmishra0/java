package exception;
import java.util.Scanner;

class Youngerageexception extends RuntimeException {
    Youngerageexception(String msg) {
        super(msg);
    }
}

public class throwexception {

    public static void main(String[] args) {

        int age;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age");
            age = sc.nextInt();
        }
        if(age < 18) {
            throw new Youngerageexception("you are not eligible to vote");
        } else {
            System.out.println("You are eligible for voting ");
        }
    }
}
