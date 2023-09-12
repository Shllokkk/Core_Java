import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;


public class FileReadCharacterStream {
    public static void main(String[] args) {
        try{
            File f=new File("Samplefile1.txt");
            FileInputStream fis=new FileInputStream(f);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));

            String line;
            
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            fis.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
