package basicjava;
import java.util.Scanner;
public class randomno {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernum = 0;
        do{
        System.out.println("Guess my number(1-100) : ");
        usernum = sc.nextInt();

        if(mynumber == usernum){
            System.out.println("Correct Number .... !!!!");
            break;
        }
        
        else if(usernum > mynumber){
            System.out.println("Your Number is too big.");
        }
        
        else{
            System.out.println("Your Number is so small.");
        }
    }while(usernum >= 0);

        System.out.println("My Number was :");
        System.out.println(mynumber);
    }
}
