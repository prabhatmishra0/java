package multithreading;

class runThread implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=450; i++){
            System.out.println(i);
        }
    }
    
}

class runthread2 implements Runnable{
    public void run(){
        for(int i=0; i<=450; i++){
            System.out.println(i);
        }
    }
}

public class runnablethread {
    public static void main(String[] args){
        runThread run = new runThread();
        Thread t = new Thread(run);
        Thread t2 =  new Thread(run);

        t.start();
        t2.start();
    }
}
