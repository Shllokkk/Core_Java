class Box{

    double width, height, depth;

    void set(int w, int h, int d){
        width=w;
        depth=d;
        height=h;
    }

    double volume(){
        return width*depth*height;
    }
}



public class BoxDemo {
    public static void main(String[] args){

        Box b1=new Box();   // new keyword allocates memory at rumtime and is used to create an object and array
        Box b2=new Box();   // here we are calling the dynamic constructor Box() created by the JVM 
        
        b1.set(10,20,30);
        b2.set(1,2,3);

        System.out.println("Volume of box 1: " + b1.volume());
        System.out.println("Volume of box 2: " + b2.volume());
    }
}
