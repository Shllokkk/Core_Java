class Sample{

    static int a=3;
    static int b;

    static{
        System.out.println("Inside Static block of Sample....");
        b=a*4;
    }

    static void set(int x){
        System.out.println("Value of x: " + x);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}

public class StaticSample1 {

    static{
        System.out.println("Inside Static of StaticSample....");
    }
    public static void main(String[] args){

        System.out.println("Inside Main....");
        Sample obj1=new Sample();
        Sample obj2=new Sample();
        Sample obj3=new Sample();

        Sample.set(100);
        obj1.a=1000;
        obj1.b=4;
        Sample.set(20);
        Sample.a=12;
        obj2.set(40);
        obj3.b=1;
        obj1.a=2;
        obj3.set(3);
        }
}
