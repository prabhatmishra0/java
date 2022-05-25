
package basicjava;

public class function {
    public static void printname(String name){
        System.out.println(name);
    }
    public static void printsum(int a , int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        String n = "Prabhat Mishra";
        printname(n);
        int a = 4;
        int h = 5;
        printsum(a, h);
    }
}
