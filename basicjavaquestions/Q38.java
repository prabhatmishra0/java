package basicjavaquestions;

import java.util.Scanner;
import java.lang.String;

// Write a Java program to count the letters, spaces, numbers and other characters of an input string.

public class Q38 {
    public static void main(String[] args){
        
        System.out.println("Enter a sentence : ");
        try(Scanner sc = new Scanner(System.in)){
        String sentence = sc.nextLine();
        count(sentence);
        }

    }   

    public static void count(String x){
        char[] sen = x.toCharArray();
        int sen_length = x.length() - 1;

        int Number = 0;
        int letters = 0;
        int Spaces = 0;
        int other = 0;

        for(int i=0; i<=sen_length; i++){
            if(Character.isLetter(sen[i])){
                letters++;
            }else if(Character.isSpaceChar(sen[i])){
                Spaces++;
            }else if(Character.isDigit(sen[i])){
                Number++;
            }else {
                other++;
            }
        }

        System.out.println("Your Sentence is : ");
        System.out.println(x);
        System.out.println("Numbers : " + Number);
        System.out.println("Letters : " + letters);
        System.out.println("Spaces : " + Spaces);
        System.out.println("Others : " + other);
    }
}
