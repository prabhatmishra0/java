package basicjavaquestions;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Input a Number (String) :");
        String str = sc.nextLine();
        int result = Integer.parseInt(str);
        System.out.printf("Integer is : %d" , result);
        System.out.println("\n");
        System.out.printf(((Object)result).getClass().getSimpleName());
        }
    }
}
