interface Interface1{
    void method1();
    void method2();
}
interface Interface2{
    void method3();
}

class Interface1Sample implements Interface1, Interface2{
    public void method1(){
        System.out.println("Inside method1 of Interface1Sample");
    }
    public void method2(){
        System.out.println("Inside method2 of Interface1Sample");
    }
    public void method3(){
        System.out.println("Inside method3 of Interface1Sample");
    }
    void sampleOwnMethod(){
        System.out.println("Inside Interface1Sample's own method");
    }
}

class AnotherSample implements Interface1{
    public void method1(){
        System.out.println("Inside method1 of AnotherSample");
    }
    public void method2(){
        System.out.println("Inside method2 of AnotherSample");
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args){

        Interface1 I1;
        Interface1Sample s=new Interface1Sample();
        I1=s;
        s.method1();
        I1.method2();
        s.method3();
        s.sampleOwnMethod();

        // I1.method3();             both these lines produce compile time error as I1 is reference object of Interface1 and 
        // I1.SampleOwnMethod();     these methods are not present in Interface1

        I1=new AnotherSample();
        I1.method1();
        I1.method2();
    }
}

// interface keyword is used to fully abstract a class from its implementation
// one class can extend only one other class but can implement many interfaces
// one interface can extend many imteraces but cannot implement other interfaces
// the default access specifier for an interface member variable and method is public
// and interface member variables are static final by default
// hence while giving body to interface methods in another class, it is mandatory to use public keyword   
// final keyword is similar to const keyword but diference is that const is universal constant
// while final is object-wise constant