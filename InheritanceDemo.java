class Base{
    int num;

    void timepass(){
        System.out.println("Timepass from Base....");
    }
    void display(){
        System.out.println("Num= " + num);
    }
}

class Derived extends Base{

    void derivedTimepass(){
         System.out.println("Timepass from Derived....");
    }
    void derivedDisplay(){
        num=100;
        System.out.println("Num= " + num);
    }

}

public class InheritanceDemo {
    
    public static void main(String [] args){

        Derived obj=new Derived();

        obj.timepass();
        obj.display();
        obj.derivedTimepass();
        obj.derivedDisplay();
    }
}

// the derived class has all properties of base class and also new properties of its own
// when object of the derived class is created, interanally it creates an object of the base class and binds it to the derived class object

// the memory allocated to the derived class object:
// sum of memory required by base class variables + sum of memory required by derived class variables + 
// some shared memory by base class methods + some shared memory by derived class methods 

// base class member variables and methods can be accessed by derived class objects 
// however private base members can not be accessed directly by derived object but can be accessed through base class methods

