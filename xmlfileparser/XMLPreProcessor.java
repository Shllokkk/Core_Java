package xmlfileparser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class XMLPreProcessor {
    String inputFileName;
    String outputFileName;

    public XMLPreProcessor(String inputFileName, String outputFileName) {
        this.inputFileName=inputFileName;
        this.outputFileName=outputFileName;
    }

    public void readAndWrite() {
        try{
            BufferedReader br=new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bw=new BufferedWriter(new FileWriter(outputFileName));

            String inputLine;

            while((inputLine=br.readLine())!=null) {
                String outputLine=convertSelfClosingTags(inputLine);
                bw.write(outputLine+"\n");
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String convertSelfClosingTags(String line) {
        return line;
    }
}
