class ThisSample{

    private int num1,num2;

    ThisSample(int num1, int num2){

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

        ThisSample s1=new ThisSample(23,14);
        ThisSample s2=new ThisSample(20,22);
        s2.display();
        s1.display();
    }
}