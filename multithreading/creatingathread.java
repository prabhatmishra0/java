package multithreading;

class Test extends Thread{
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println(i);
        }
    }
}

class Testtwo extends Thread{
    public void run(){
        for(int i=0; i<=2000; i++){
            System.out.println("I starting view tutorial !!");
        }
    }
} 

public class creatingathread {
    public static void main(String[] args){
        Test t = new Test();
        Test t2 = new Test();
        t.start();
        t2.start();
    }
}
