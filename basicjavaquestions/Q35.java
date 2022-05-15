package basicjavaquestions;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args){
        System.out.println("Enter the length of side : ");
        try (Scanner sc = new Scanner(System.in)) {
            int sl = sc.nextInt();
            System.out.println("Enter the Number of sides : ");
            int ns = sc.nextInt();
            System.out.println("The area of Polygon is : " + poly_area(sl , ns));
        }

    }

    public static int poly_area(int l, int n){
        int a = (int) (n * (l*l) / 4 * Math.tan(Math.PI/n));
        return a;
    }
}
