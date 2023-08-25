abstract class Shape{

    int side1,side2;
    int side;

    Shape(int side1, int side2){                // an abstract class can have non abstract methods as well
        this.side1=side1;
        this.side2=side2;
    }

    Shape(int side){
        this.side=side;
    }

    void setside1(int side1){
        this.side1=side1;
    }

    void setside2(int side2){
        this.side2=side2;
    }

    abstract void perimeter();                   // when we use abstract keyword it means that we can give body to the method somewhere else
    abstract void area();
}

class Rectangle extends Shape{

    Rectangle(int side1, int side2){
        super(side1, side2);
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle is: " + (2*(side1+side2)));       // a inherited class has to give body to all the abstract methods of the parent class
    }                                                                                // if it fails to do so then the class has to be made abstract itself
    void area(){
        System.out.println("Area of Rectangle is: " + (side1*side2));
    }
}

class Square extends Shape{

    Square(int side){
        super(side);
    }

    void perimeter(){
        System.out.println("Perimeter of Square is: " + (4*side));
    }
    void area(){
        System.out.println("Area of Square is: " + (side*side));
    }
}

class IscTriangle extends Shape {

    IscTriangle(int side1, int side2){
        super(side1, side2);
    }
        void perimeter(){
        System.out.println("Perimeter of Triangle is: " + (2*side1+side2));
    }
    void area(){
        System.out.println("Area of Triangle is: " + (0.5*(side1*side2)));
    }
}

public class AbstractDemo {
    public static void main(String[] args){
        Shape s=new Rectangle(10,20);             // a parent class reference object can be used to point to chlid class object
        s.perimeter();                                        // here we fool compiler into thinking that the reference variable is calling a method of parent class
        s.area();                                             // but while execution the method of child class is called instead.

        s=new Square(10);                                // reassigning the reference object to other clid class
        s.perimeter();                                        // the method to be called is decided at runtime, hence it is called runtime polymorphism
        s.area();

        s=new IscTriangle(10, 20);
        s.perimeter();
        s.area();
    }
}

// demonstration for abstract keyword and dynamic binding or rumtime polymorphism
// we cannot create an instance of an abstract class but we can create reference objects of them
// they are meant to be inherited 