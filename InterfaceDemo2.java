interface Interface4{
    void method4();
}
interface Interface5{
    void method5();
}
interface Interface6 extends Interface4, Interface5{
    int x=23;
    void method6();
}

class Sample implements Interface6{
    public void method6(){
        System.out.println("Inside method6 of Sample");
    }
    public void method4(){
        System.out.println("Inside method4 of Sample");
    }
    public void method5(){
        System.out.println("Inside method5 of Sample");
    }
    void sampleOwnMethod(){
        System.out.println("Variable: " + Interface6.x);      // this line proves that interface variables are static final by default
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args){
        Sample s=new Sample();
        s.method4();

        Interface6 I6=s;         // as Interface6 extends Interface4 and Interface5 its reference variable 
        I6.method5();            // its reference variable can access the methods of the other two interfaces

        I6=new Sample();         // I6 assigned reference to a new object of Sample
        I6.method6();

        new Sample().sampleOwnMethod();    
    }
}
