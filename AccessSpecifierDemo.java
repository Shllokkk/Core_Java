class Sample{

    private int a;
    int b;

    void getData(int x){
        a=x;
        System.out.println("The value of private variable a is " + a  + "and value of b is " + b);
    }
}
public class AccessSpecifierDemo {
    public static void main(String[] args){

        Sample s=new Sample();
    //  s.a=5;                this line will throw exception as AccessSpecifierDemo.java:15: error: a has private access in Sample
        s.b=10;
        s.getData(23);        // but this line is valid
    }   
}

// a variable specified as private can be only accessed within the same class
// it cant be accessed directy even by an object of the same class in the main method
// but it can be accessed in a controled manner by the object by calling a method of the class
// in which the private variable is declared 