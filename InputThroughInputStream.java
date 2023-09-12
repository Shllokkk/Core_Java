import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputThroughInputStream {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.print("Enter name: ");
        String name=br.readLine();
        System.out.print("Enter address: ");
        String add=br.readLine();
        System.out.print("Enter percentage: ");
        String percent=br.readLine();

        float perc=Float.parseFloat(percent);

        System.out.println("Name: "+name);
        System.out.println("Address: "+add);
        System.out.println("Percentage: "+perc);
    }
}
