package multithreading;

import java.util.ArrayList;

public class genrics {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("10");
        l.add("hello");
        // l.add(10); // it's give compile time error

        String s = l.get(0);
        System.out.println(s);
    }
    
}
