public class Solid_Rohmbus {


    public static void main(String[] args){

    // Author : Prabhat Mishra
    // print the solid rohmbus

    int m = 5;

    for(int i = 1; i<=m; i++){

        // print space 
        
        for(int j = 1; j<=m-i; j++){
            System.out.print(" ");
        }

        // print star 

        for(int j = 1; j <= m; j++){
            System.out.print("*");
        }

        System.out.println();
    }

}
    
}


//     *****
//    *   *
//   *  *
// **    