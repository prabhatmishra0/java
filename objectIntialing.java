public class objectIntialing {
    // by using reference varible 
    String c;
    int a;

    // by using method 

    public void set(String s , int i){
        s = c;
        i = a;
    }

    public void prin(){
        System.out.println("color is :" + c + "value is :" + a);
    }

    public static void main(String[] args) {
        System.out.println("We using initialization by reference variable : ");
        objectIntialing ob = new objectIntialing();
        ob.c = "black";
        ob.a = 10;

        System.out.println(ob.c);
        System.out.println(ob.a);

        System.out.println("we using initialization by method");

        String v = "saf";
        int i = 34;

        ob.set(v,i);
        ob.prin();



    }
}
