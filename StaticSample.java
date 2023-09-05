public class StaticSample{

    static int a=3;
    static int b;

    static{                                                       // static block is executed only once when ClassName is mentioned in command line
        System.out.println("Inside Static block....");             
        b=a*3;
    }

    static void set(int x){

        System.out.println("Value of x: " + x);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
    public static void main(String[] args){

        System.out.println("Inside Main....");
        StaticSample.set(100);
        a=23;
        StaticSample.set(200);
        b=14;
        StaticSample.set(300);
        StaticSample.set(300);
    }
}

// demonstration  for static keyword