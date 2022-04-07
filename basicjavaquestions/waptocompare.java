package basicjavaquestions;

import java.util.Scanner;

public class waptocompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter three number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && b>c){
            System.out.println("a is greater no.");
        } else if(b>a && b>c){
            System.out.println("B is greater no.");
        }else {
            System.out.println("C is greater no.");
        }
    }
    
}
