class Student2{

    private String name,branch;
    private int proll, roll;
    private static int prncounter, compscounter, itcounter;
    double perc;

    Student2(String n,String b, double p){
        this.name=n;
        this.branch=b;
        this.perc=p;

        if(this.branch.equals("IT")){
            prncounter++;
            proll=prncounter;
            itcounter++;
            roll=itcounter;
        }

         else if(this.branch.equals("COMPS")){
            prncounter++;
            proll=prncounter;
            compscounter++;
            roll=compscounter;
        }
        else{
            throw new ArithmeticException("ERROR: Wrong Branch");
        }

    }

    String showData(){
        return("[ NAME: " + this.name + ", PRN: " + this.proll + ", RollNo: " + this.roll + "]");
    }
}

public class StudentDemo2 {

    public static void main(String[] args){
        
        String name[]={"Shllok", "Mokksh", "Vini"};
        String branch[]={"IT", "COMPS", "IT"};
        int perc[]={44, 55, 66};

        Student2[] s=new Student2[name.length];

        for(int i=0;i<s.length;i++){

            s[i]=new Student2 (name[i], branch[i], perc[i]);
        }

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].showData());
        }
    }
}
