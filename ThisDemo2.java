class Person{
    private int age;
    private String name;

    Person(String n, int a){
        this.name=n;
        this.age=a;
    }

    Person findElder(Person obj){
        if(this.age<obj.age){
            return obj;                 // returns the object passed as argument 
        }
        return this;                    // returns the object which calls the method
    }

    String getDataInString(){
        return "Person [ " + this.name + ", " + this.age + "]";
    }
}

public class ThisDemo2 {
    public static void main(String[] args){

        Person p1=new Person("Shllok",19);
        Person p2=new Person("Mokksh",14);

        System.out.println(p1.getDataInString());
        System.out.println(p2.getDataInString());

        Person p3=p2.findElder(p1);

        System.out.println("Elder: " + p3.getDataInString());
    }
    
}
