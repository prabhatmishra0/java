package multithreading;

class daemon extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("child thread");
    }
}

public class demonthread {
    public static void main(String[] args){
    
    // System.out.println("Parent thread");
    daemon d = new daemon();
    d.setDaemon(true);
        d.start();

    }


    // if parent thread not perform any task than daemon thread not provide service to the parent thread  
}
