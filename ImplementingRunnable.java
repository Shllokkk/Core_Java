class MySecondThread implements Runnable {
    Thread t;

    MySecondThread() {
        t=new Thread(this);
        t.start();
    }
    public void run() {
        try{
            for(int i=1;i<=3;i++) {
                System.out.println(this+":"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }    
    }
}

public class ImplementingRunnable {
    public static void main(String[] args) throws InterruptedException{
        new MySecondThread();

        for(int i=1;i<=3;i++) {
            System.out.println("MainThread:"+i);
            Thread.sleep(500);
        }
    }
}
