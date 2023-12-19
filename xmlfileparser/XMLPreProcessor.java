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
            br.close();
            bw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    //<title>Document</title>
    public String convertSelfClosingTags(String line) {
        
        StringBuilder modifiedLine=new StringBuilder();
        
        int index=-1;
        int previousIndexToCopyFrom=0;

        while((index=line.indexOf('<',index+1))!=-1) {
            int startIndex=index;
            int closeIndex=line.indexOf('>', index+1);
            String tag=line.substring(startIndex, closeIndex+1);

            if(isSelfClosing(tag)) {
                String tagElement=tag.substring(1, tag.length()-2);

                int tagEndIndex=tagElement.indexOf(' ')==-1?tagElement.length():tagElement.indexOf(' ');

                String tagName=tagElement.substring(0, tagEndIndex);

                String startTag="<"+tagElement+">";
                String endTag="</"+tagName+">";

                String replaceTag=startTag+endTag;

                modifiedLine.append(line.substring(previousIndexToCopyFrom,startIndex));
                modifiedLine.append(replaceTag);
                previousIndexToCopyFrom=closeIndex+1;
            }
        }
        modifiedLine.append(line.substring(previousIndexToCopyFrom));
        return modifiedLine.toString();
    }

    private boolean isSelfClosing(String tag) {
        return tag.endsWith("/>");
    }
}
