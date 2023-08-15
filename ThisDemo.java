class Sample{

    private int num1,num2;

    Sample(int num1, int num2){

        this.num1=num1;
        this.num2=num2;
    }

    void display(){

        System.out.println("Num1= " + this.num1);
        System.out.println("Num2= " + this.num2);
    }
}

public class ThisDemo{
    public static void main(String args[]){

        Sample s1=new Sample(23,14);
        Sample s2=new Sample(20,22);
        s2.display();
        s1.display();
    }
}