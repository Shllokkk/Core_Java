class MyThread extends Thread{

    MyThread(String tname) {
        super(tname);
    }

    @Override
    public void run() {
        try{
            for(int i=1;i<4;i++) {
                System.out.println(this.getName()+":"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        Thread t=new MyThread("MyFirstThread");
        t.start();        
        try{
          for(int i=1;i<4;i++) {
                System.out.println("MainThread:"+i);
                Thread.sleep(1000);
        }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
