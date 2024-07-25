import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadInputStream {
    public static void main(String[] args){
        try {
            File f=new File("Samplefile1.txt");
            FileInputStream fis=new FileInputStream(f);

            int readchar;

            while((readchar=fis.read())!=-1){
                System.out.print((char)readchar);
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
