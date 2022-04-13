package basicjavaquestions;

import java.util.Scanner;

// import javax.sql.rowset.spi.SyncFactory;

public class Q33 {
        public static void main(String[] args){
            System.out.println("Enter any number : ");
            try (Scanner sc = new Scanner(System.in)) {
                long input = sc.nextLong();
                System.out.println("Sum of your input : " + suminput(input));
            }
        }

        public static long suminput(long x){

            long sum = 0;
            while(x != 0){

                // 368 enter by user
                // sum = sum + (x%10)
                // x = x/10;

               
                sum = sum + (x%10);
                x = x/10;
            }

            return sum;
        }


}
