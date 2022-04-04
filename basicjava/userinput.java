package basicjava;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter First Number: ");
        // int age = sc.nextInt();
        // System.out.println(age);

        // for enter float value
        // float age = sc.nextFloat();
        // System.out.println(age);

        // for enter float value 
        String name = sc.nextLine();
        System.out.println(name);


    }

    }
}
