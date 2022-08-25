import java.util.Scanner;

public class kurpech {
    public static void main(String[] args) {
        System.out.println("Enter Array size :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            System.out.println("Enter element in array");
            int[] arr;
            arr = new int[n];

            for(int i = 0; i < n; i++){
                    arr[i] = sc.nextInt();
            }

            System.out.println("Enter the Searching element : ");
            int x = sc.nextInt();

            for(int i=2; i<n; i++){
                if(arr[i] == x){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
                i++;
            }
            
        }  
    }
}
