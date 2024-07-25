import java.util.Scanner;

public class InputThroughScanner {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        //sc.nextLine();                                //adding extra nextLine() after a nextInt() 
        System.out.print("Enter address: ");
        String add=sc.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+add);
        sc.close();                                  // closing the scanner object to release system resources and prevent memory leak
    }
}

// nextLine() method reads till a "\n" is encountered, then it stops reading and removes the "\n" from the buffer
// nextInt() and other similar methods read till a whitespace or a "\n" is encountered but does not remove it from the buffer 

// hence after a nextInt() method if we use a nextLine() then the leftover "\n" by the nextInt() in the buffer 
// is accepted as end of line by the following nextLine() method and removes it from the buffer 
// this prevents us from providing an input for the concerned nextLine() method