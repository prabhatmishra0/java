package multithreading;

class Totalearnigs extends Thread{
    int total = 0;
    public void run(){
        synchronized(this){
            for(int i = 1; i<=10; i++){
                total += 100;
            }
            this.notify();
        }
    }
}

public class interthread {
    public static void main(String[] args) throws InterruptedException{
        Totalearnigs t = new Totalearnigs();
        t.start();
        // System.out.println("Total earnings : " + t.total);

        synchronized(t){
            t.wait();
            // t.wait(10); // second method to provide a time because automatic this release the lock
            System.out.println("Total earnings : " + t.total);

        }
    }
}   
