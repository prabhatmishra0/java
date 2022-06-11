package multithreading;

class pthreadname implements Runnable{
    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
           
            // try {
            //     Thread.sleep(0);
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
        }
    }
}

public class printthraedname {
    public static void main(String[] args) {
        pthreadname pt = new pthreadname();
        Thread t = new Thread(pt , "harry");
        t.start();
    }    
}
