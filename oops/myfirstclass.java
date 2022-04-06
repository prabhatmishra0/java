package oops;

class myne{
    String name;
    int age;
    public void pna(){
        System.out.println(this.name);
        System.out.println(this.age);
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
