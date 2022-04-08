package oops;


// inheritance four types in java 
// 🥇 first one is ( Single level inheritence ✋)
// Base class ----------> derived class 

// Second type is ( multilevel inheritence )
//  base class ------------> derived class ---------------> derived class


class school{
    String n;
}

class college extends school{
    String dress;

    public void printnd(){
        System.out.println(this.n);
        System.out.println(this.dress);
    }
}

class postgraduate extends college{
    String degree_name;

    public void printnd(String n , String dress , String degree_name){
        System.out.println(n + " , " + dress + " , " + degree_name );
    }
}

public class inheritance {
    

    public static void main(String[] arga){
    postgraduate c = new postgraduate();
    c.n = "Prabhat Mishra";
    c.dress = "No";
    c.degree_name = "MCA";

    c.printnd();

    }
}
