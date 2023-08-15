class Student {

    String name;
    int roll;
    float perc;

    void setData(String n, int r, float p){

        name=n;
        roll=r; 
        perc=p;
    }

    void displayData() {

        System.out.println("----Student Data----");
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + roll);
        System.out.println("Percentage: " + perc);
        System.out.println("\n");
    }
} //end of Student

public class StudentDemo {

    public static void main(String [] args) {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.setData("Shllok", 41, 94);
        s2.setData("Mokksh", 32, (float)71.0); //manual typecasting method 1 
        s3.setData("Vini", 05, 88.56f); //manual typecasting method 2 

        s1.displayData();
        s2.displayData();
        s3.displayData();
    } //end of main
    
} //end of StudentDemo


        //typecasting is required to handle lossy conversion error which the compiler throws 
        //it is from double(8 bytes) to float(4 bytes) variable p
        //71.0 and 88.5 got assinged a default 8 bytes but declaring it (float)71.0 or 88.56f alloted them 4 bytes in stack
        //this allowed them to be directly assigned to float variable p and saves space
        //94 didn't need typecasting it got assigned to float as 94.0
        //float to double does not throw error
        //double to float or int throws error and needs typecasting
