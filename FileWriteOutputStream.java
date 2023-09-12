import java.io.*;

public class FileWriteOutputStream {
    public static void main(String[] args) {
        try{
            File f=new File("Samplefile2.txt");
            FileOutputStream fos=new FileOutputStream(f,true);               

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String consoleinput;

            System.out.println("Enter text to write to file and enter \"exit\" to stop");

            while(!((consoleinput=br.readLine()).equalsIgnoreCase("exit"))){
                consoleinput=consoleinput + "\n";
                fos.write(consoleinput.getBytes());
            }
            br.close();
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("Content written successfully to file");
        }
    }
}

// FileOutputStream fos=new FileOutputStream(f); if we use this constructor then whenever we run the program
// it truncates the existing data entered into the file and starts anew

// FileOutputStream fos=new FileOutputStream(f,true); this constructor does not truncate the file insteaad
// appends the new data at end of the file existing data