class Base1{
    int num;

    void set(int num){
        this.num=num;
    }

    void show(){
        System.out.print(("Base num: " + num));
    }
}

class Derived1 extends Base1{
    int num;                                          // member variable overriding

    void set(int num1, int num2){                     // method overloading
        set(num1);
        this.num=num2;
    }
    void show(){                                      // method overriding
        System.out.println("Derived num: " + num);
        super.show();
    }  
}

public class MethodOverriding{
    public static void main(String[] args){

        Derived1 d=new Derived1();

        d.set(10,20);
        d.show();
    }
}
