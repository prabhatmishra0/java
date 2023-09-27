package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileio {
    public static void main(String[] args) {
        


        try {
            FileInputStream fis = new FileInputStream("h:abc.text");
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
