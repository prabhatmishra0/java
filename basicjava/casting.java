package basicjava;

public class casting {
    public static void main(String[] args){

        // casting have two types in java
        // implicit casting ✋
        // java allows us implicit casting

        // double price = 100.00;
        // int gst = 18;
        // double finalprice = price + gst;
        // System.out.println(finalprice);


        // Explicit Casting ✋
        // java don't allow to explicit cating 

        int price = 100;
        // double gst = (int)18.00;
        int finalprice = price+ (int)18.00;
        System.out.println(finalprice);
    }
}
