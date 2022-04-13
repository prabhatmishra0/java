package basicjavaquestions;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args){
        // Write a Java program to compute the area of a hexagon.
        // hexagon area = 6*s^2 / 4*tan(pi/6);

        System.out.println("Enter the side legth of hexagon : ");
        try(Scanner sc = new Scanner(System.in)){
        long s = sc.nextLong();
        System.out.println("The area of hexagon is : " + hexaarea(s));
        }
        
    }

    public static Long hexaarea(Long x){
        long a = (long) (6*(x*x) / (4*Math.tan(Math.PI/6)));
        return a;
    }
}
