package collections;


import java.util.ArrayList;
import java.util.List;


import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        // ArrayList<String> al = new ArrayList<>();
        List<String> al = new ArrayList<>();

        al.add("Prabhat Mishra");
        al.add("1234");
        al.add("deepak");

        // Iterator itr = (Iterator) al.iterator();
        // itr.next();

        Iterator<String> itr = al.iterator();
        // itr.next();
        System.out.print(itr.next());


        

    }
}
