package basicjavaquestions;

import java.util.*;

public class testing {
    public static void main(String[] args){
        int pin;
        System.out.println("Enter ATM pin : ");
        try (Scanner sc = new Scanner(System.in)) {
            pin = sc.nextInt();
        }
        if(pin == 857){
            System.out.println("Welcome to chadifc bank");
        }else{
            System.out.println("Invalid acces");
        }
    }
}
