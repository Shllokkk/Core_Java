class ThisPerson{
    private int age;
    private String name;

    ThisPerson(String n, int a){
        this.name=n;
        this.age=a;
    }

    ThisPerson findElder(ThisPerson obj){
        if(this.age<obj.age){
            return obj;                 // returns the object passed as argument 
        }
        return this;                    // returns the object which calls the method
    }

    String getDataInString(){
        return "ThisPerson [ " + this.name + ", " + this.age + "]";
    }
}

public class ThisDemo2 {
    public static void main(String[] args){

        ThisPerson p1=new ThisPerson("Shllok",19);
        ThisPerson p2=new ThisPerson("Mokksh",14);

        System.out.println(p1.getDataInString());
        System.out.println(p2.getDataInString());

        ThisPerson p3=p2.findElder(p1);

        System.out.println("Elder: " + p3.getDataInString());
    }
    
}
