package oops;

class myne{
    String name;
    int age;
    public void pna(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non-para meterised constructor 
    myne(){
        System.out.println("I'll called itself without calling you");
    }
}
public class myfirstclass {
    public static void main(String[] args) {
        myne m = new myne();
        m.name = "Prabhat";
        m.age = 22;

        m.pna();
        
    }
}


// Constructor are called three types

// 1. Non-paramenterised Constructor
// 2. paramenterised Constructor
// 3. Copy Constructor 


