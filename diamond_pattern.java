public class diamond_pattern {
    public static void main(String[] args){

        // printing diamond pattern here

        int m = 4;

        for(int i = 1; i<=m; i++){

            // printing space
            for(int j = 1; j<=m-i; j++){
                System.out.print(" ");
            }

            // printing star
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            } 
            

            // for printing left portion
            for(int j = 1; j<=i-1; j++){
                System.out.print("*");
            }

            // for going next line 
            System.out.println();
        }

        // for printing lower portion of diamond

        for(int i = m; i>=1; i--){

            // printing space
            for(int j = 1; j<=m-i; j++){
                System.out.print(" ");
            }

            // printing star
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            } 
            

            // for printing left portion
            for(int j = 1; j<=i-1; j++){
                System.out.print("*");
            }

            // for going next line 
            System.out.println();
        }
    }
}
