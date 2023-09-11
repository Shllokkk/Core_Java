class Person{

    int age;
    String name;

    Person(int a, String n){        //parameterised constructor
        age=a;
        name=n;
    }

    Person(Person obj){             //clone constructor
        age=obj.age;                //the value of obj.age will be stored in the age of the object calling this constructor
        name=obj.name;              //the value of obj.name will be stored in the name of the object calling this constructor
    }
}

public class CloneDemo {
    public static void main(String[] args){

        Person p1=new Person(19,"Shllok");
        Person p2=new Person(21,"Vini");
        Person p3=new Person(p2);                  //the values of p2.age and p2.name are copied on to obj.age and obj.name

        System.out.println("Age of p1: " + p1.age);
        System.out.println("Name of p1: " + p1.name); 
        System.out.println("Age of p2: " + p2.age);
        System.out.println("Name of p2: " + p2.name); 
        
        System.out.println("Age of p3: " + p3.age);
        System.out.println("Name of p3: " + p3.name);  
    }
}
