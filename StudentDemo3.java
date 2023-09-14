import java.io.BufferedReader;
import java.io.InputStreamReader;

class Student3{
    static int idcntr=2300;
    int id;
    String name;
    double perc;

    Student3(){
        id=0000;
        this.name="null";
        this.perc=0.0;
    }
    void add(BufferedReader br){
        try{
            System.out.println("Add Student Name and Percentage:");
            name=br.readLine();
            perc=Double.parseDouble(br.readLine());
            System.out.println("Data added Successfully!");
            idcntr++;
            this.id=idcntr;
            System.out.println("Your Student ID: "+this.id);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    void search(){
        System.out.println("Student record found!");
        System.out.println("Student ID: "+this.id+"\nStudent name: "+this.name+"\nStudent percentage: "+this.perc);
    }
    void update(BufferedReader br){
        try{
            System.out.print("Update name(1) or percentage(2): ");
            int tempfield=Integer.parseInt(br.readLine());
            if(tempfield==1){
                System.out.print("Enter new name: ");
                this.name=br.readLine();
                System.out.println("Record updated successfully!");
            }
            else if(tempfield==2){
                System.out.print("Enter new percentage: ");
                this.perc=Double.parseDouble(br.readLine());
                System.out.println("Record updated successfully!");
            }
            else
                System.out.println("Invalid Field!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    void delete(){
        this.id=0000;
        this.name="null";
        this.perc=0.0;
        System.out.println("Student record deleted successfully!");
    }
}

public class StudentDemo3 {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Student3[] obj=new Student3[20];
        int addcntr=0;

        for(int i=0;i<obj.length;i++)
            obj[i]=new Student3();

        System.out.println("------STUDENT RECORD------");
        while(true){
            System.out.println("\n1. Enter new student record");
            System.out.println("2. Search student record");
            System.out.println("3. Update existing student record");
            System.out.println("4. Delete student record");
            System.out.println("5. View Student records sorted by name");
            System.out.println("6. View student records sorted by percentage");
            System.out.print("Select: ");

            try{
                switch(Integer.parseInt(br.readLine())){
                    case 1:
                        if(addcntr<obj.length){
                            obj[addcntr].add(br);
                            addcntr++;
                        }
                        break;

                    case 2:
                        System.out.print("Enter Student ID: ");
                        int tempid=Integer.parseInt(br.readLine());
                        int cntr2=0;
                        for(int i=0;i<addcntr;i++){
                            if(tempid==obj[i].id){
                                obj[i].search();
                                cntr2++;
                                break;
                            }
                        }
                        if(cntr2==0)
                            System.out.println("Invalid Student ID!");
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        tempid=Integer.parseInt(br.readLine());
                        int cntr3=0;
                        for(int i=0;i<addcntr;i++){
                            if(tempid==obj[i].id){
                                obj[i].update(br);
                                cntr3++;
                                break;
                            }
                        }
                        if(cntr3==0)
                            System.out.println("Invalid Student ID!");
                        break;
                    
                    case 4:
                        System.out.print("Enter Student ID: ");
                        tempid=Integer.parseInt(br.readLine());
                        int cntr4=0;
                        for(int i=0;i<addcntr;i++){
                            if(tempid==obj[i].id){
                                obj[i].delete();
                                cntr4++;
                                break;
                            }
                        }
                        if(cntr4==0)
                            System.out.println("Invalid Student ID!");
                        break;

                    case 5:
                        Student3 temp=new Student3();
                        System.out.println("Records sorted by Name(asc)----");
                        for(int i=0;i<obj.length;i++){
                            for(int j=i+1;j<obj.length;j++){
                                if((obj[i].name.compareToIgnoreCase(obj[j].name))>0){
                                    temp=obj[i];
                                    obj[i]=obj[j];
                                    obj[j]=temp;
                                }
                            }
                        }
                        for(int i=0;i<obj.length;i++)
                            System.out.println("Student ID: "+obj[i].id+"\nStudent name: "+obj[i].name+"\nStudent percentage: "+obj[i].perc);
                        break;

                    case 6:
                        temp=new Student3();
                        System.out.println("Records sorted by percentage(desc)----");
                        for(int i=0;i<obj.length;i++){
                            for(int j=i+1;j<obj.length;j++){
                                if(obj[i].perc<obj[j].perc){
                                    temp=obj[i];
                                    obj[i]=obj[j];
                                    obj[j]=temp;
                                }
                            }
                        }   
                        for(int i=0;i<obj.length;i++)
                            System.out.println("Student ID: "+obj[i].id+"\nStudent name: "+obj[i].name+"\nStudent percentage: "+obj[i].perc);
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                        break;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
