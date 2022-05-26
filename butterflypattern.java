public class butterflypattern {


    public static void main(String[] args){
        
        int m = 6;

        // upper portion of butterflyr
        for(int i = 1; i<m; i++){


            // print star Right
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // Print Space right and left
            for(int j = 1; j<= 2*(m-i); j++){
                System.out.print(" ");
            }

            // Print Star right 
            
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // lower portion of butterfly
        
        for(int i = m; i>=1; i--){


            // print star Right
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // Print Space right and left
            for(int j = 1; j<= 2*(m-i); j++){
                System.out.print(" ");
            }

            // Print Star right 
            
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
