public class Exceptionmethod {
    public static void main(String[] args) {
        // Author : Prabhat 
        // Methods of print exception

        int c=0;

        
        try{
            c = 100/0;
            // Print the value of 
            System.out.println(c); 

        }catch(Exception e){
            // 1st Method of doing this
            // e.printStackTrace();

            // 2nd Method of doing this
            // System.out.println(e.toString());

            // 3rd Method of doing this
            System.out.println(e.getMessage());
            
            
        }
    }
}
