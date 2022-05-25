package basicjavaquestions;

import java.util.Scanner;

public class lab1 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            switch(a){
                case 1 :
                System.out.println("It's Monday.");
                break;

                case 2:
                System.out.println("It's Tuesday.");
                break;

                case 3:
                System.out.println("It's Wednesday.");
                break;

                case 4:
                System.out.println("It's Thursday.");
                break;

                case 5:
                System.out.println("It's Friday.");
                break;

                case 6:
                System.out.println("It's Saturday.");
                break;

                case 7:
                System.out.println("It's Sunday.");
                break;

                default:
                System.out.println("Pls enter valid number");
            }
        }

    }
}
