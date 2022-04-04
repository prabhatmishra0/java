package basicjava;

public class break_continue {
    public static void main(String[] args){
        // wap to write even using while and break and continue statement 
        
        // Break & continue 

        int i=1;
        while(true){
            if(i%2 == 0){
                i = i+1;
                continue;
            }
            
            i = i+1;
            System.out.println(i);

            if(i > 20){
                break;
            }
        }

        // int i = 1;
        // if(i%2 == 0){
        //     System.out.println(i);
        // }

        // int i = 90;
        // if(i==20){
        //     System.out.println("Yes");
        // } else{
        //     System.out.println("No");
        // }
    }   
}
