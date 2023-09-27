public class hollowRectangle {
    // hollow triangle
    
    public static void main(String[] args){
        int m = 5;

        for(int i = 0; i<=m; i++){
            for(int j = 0; j<=m; j++){
                if(i == 0 || i == m || j == 0 || j == m ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
