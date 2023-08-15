class Calci{

    int num1, num2;

    //default constructor
    Calci(){                                                    
        System.out.println("Default constructor....");
        num1=10;
        num2=20;
    }

    //parameterised constructor 1
    Calci(int n){                                               
        System.out.println("Parameterised comstructor with one argument....");
        num1=n; 
        num2=n;
    }

    //parameterised constructor 2
    Calci(int a, int b){
        System.out.println("Parameterised constructor with two arguments....");
        num1=a;
        num2=b;
    }

    //overloaded method 2
     int add(){
        System.out.println("Add with no argument....");
        System.out.println("Addition: " + (num1+num2));
        return 0;
     }

     //overloaded method 2
    int add(boolean shouldprint){
        System.out.println("Add with boolean argument....");
        System.out.println("Addition: " + (num1+num2));
        return num1+num2;
    }
}

public class ConstructorDemo {

    public static void main(String[] args){

        Calci c1=new Calci();
        Calci c2=new Calci(23);
        Calci c3=new Calci(14,19);

        c1.add();
        c2.add();
        c3.add(false);
    }
}

//if any tyoe of constructor is defined by the programmer then the JVM will not create a dynamic constructor
//instead, it will insert the dynamic code in the body of the constructors defined by the programmer