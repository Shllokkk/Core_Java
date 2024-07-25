package xmlfileparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFile;
            String tempFile="temp-"+String.valueOf(System.currentTimeMillis())+".tmp";

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your XML File name: ");
            inputFile=br.readLine();

            new XMLPreProcessor(inputFile, tempFile).readAndWrite();
            XMLParser obj=new XMLParser(tempFile);

            if(obj.parseXMLFile())
                System.out.println("File is Correct!");
            
            File f=new File(tempFile);

            if(f.delete())
                System.out.println("Completed Processing.....");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
