class A{
    A(){
        System.out.println("Constructor of A....");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor of B....");
    }
}
class C extends B{
    C(){
        System.out.println("Constructor of C....");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args){
        A obj=new A();                              // object of parent
        A obj1=new B();                             // a reference object of parent class can be assigned to object of child class
        obj=new C();                                // now the parent class object points to another child class object
    }
}
 
// when an object of class C is created then internally an object of class A
// is created at first followed by object of class B and finally object of class C