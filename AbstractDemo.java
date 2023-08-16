abstract class Shape{

    int side1,side2;
    int side;

    Shape(int side1, int side2){
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

    abstract void perimeter();
    abstract void area();
}

class Rectangle extends Shape{

    Rectangle(int side1, int side2){
        super(side1, side2);
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle is: " + (2*(side1+side2)));
    }
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
        Shape s=new Rectangle(10,20);
        s.perimeter();
        s.area();

        s=new Square(10);
        s.perimeter();
        s.area();

        s=new IscTriangle(10, 20);
        s.perimeter();
        s.area();
    }
}

// demonstration for abstract keyword and dynamic binding or rumtime polymorphism