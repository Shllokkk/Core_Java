class CallMe {
    public void /*synchronized*/ call(String msg) {         // we can also use synchronized keyword in method signature
        System.out.print("["+msg);
        try{
        Thread.sleep(500);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class CallMeCaller implements Runnable {
    Thread t;
    CallMe target;                  // declaring a targetobj which will be used to call the method of the mentioned class from the run() method of the current thread obj
    String msg;

    public CallMeCaller(CallMe target,String msg) {
        t=new Thread(this);
        this.target=target;
        this.msg=msg;
        t.start();
    }

    public void run() {
        synchronized(target) {                             // we can either use a synchronized block
            target.call(msg);
        }
    }
}
public class Sync {
    public static void main(String[] args) {
        CallMe obj=new CallMe();                          // creating an object of the class we need to make a thread of
        new CallMeCaller(obj, "hello");               // passing obj to constructor of the class which is implementing runnable
        new CallMeCaller(obj, "world");
    }
}