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
        new Box().set(23, 14,19);           // we can call methods in this way too

        System.out.println("Volume of box 1: " + b1.volume());
        System.out.println("Volume of box 2: " + b2.volume());
        System.out.println("Volume of box 3: " + new Box().volume());     // here output is 0 as a new object of class box calls the method and 
                                                                          // the instance variables for that object have not been initialised using set() method 
    }
}
