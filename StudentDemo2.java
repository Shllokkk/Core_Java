class Stud{

    private String name,branch;
    private int proll, roll;
    private static int prncounter, compscounter, itcounter;
    double perc;

    Stud(String n,String b, double p){
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

        }

    }

    void showData(){
        System.out.println("[ NAME: " + this.name + ", PRN: " + this.proll + ", RollNo: " + this.roll + "]");
    }
}

public class StudentDemo2 {

    public static void main(String[] args){
        
        String name[]={"Shllok", "Mokksh", "Vini"};
        String branch[]={"IT", "COMPS", "EXTC"};
        int perc[]={44, 55, 66};

        Stud[] s=new Stud[name.length];

        for(int i=0;i<s.length;i++){

            s[i]=new Stud (name[i], branch[i], perc[i]);
        }
    }
}
