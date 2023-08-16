class Box{
    double width, height, depth;

    Box(double width, double height, double depth){
        this.width=width;
        this.depth=depth;
        this.height=height;
    }

    Box(Box obj){
        this.width=obj.width;
        this.depth=obj.depth;
        this.height=obj.height;
    }

    double volume(){
        return this.width*this.height*this.depth;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(double width, double height, double depth, double weight){
       super(width,height,depth);
       this.weight=weight; 
    }
}

public class SuperDemo {
    public static void main(String[] args){

        BoxWeight b=new BoxWeight(10,20, 30, 40);

        System.out.println("Volume of the box: " + b.volume());
        System.out.println("Weight of the box: " + b.weight);
    }
}

// if the base class has a parameterized constructor then it is mandatory for the derived class object to accept those parameters
// and pass those parameters using super() keyword

// super() keyword must be the first line within the constructor of the derived class as it is simple logic