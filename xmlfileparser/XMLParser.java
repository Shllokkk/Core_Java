package xmlfileparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class XMLParser {
    private String fileName;

    public XMLParser(String fileName) {
        this.fileName=fileName;
    }

    public boolean parseXMLFile() {
        try {
            Stack<String> tagStack=new Stack<String>();

            BufferedReader br=new BufferedReader(new FileReader(fileName));

            String line;
            int lineNumber=1;
            boolean flag=true;

            while((line=br.readLine())!=null) {
                int startIndex=-1;
                while((startIndex=line.indexOf("<",startIndex+1))!=-1) {
                    String tagElement=line.substring(startIndex, line.indexOf(">", startIndex+1)+1);

                    int endIndex=tagElement.indexOf(' ')==-1?tagElement.indexOf(">"):tagElement.indexOf(" ");

                    String tagName=tagElement.substring(1,endIndex);

                    if(tagName.startsWith("/")) {
                        tagName=tagName.substring(1);
                        String stackTop=tagStack.peek();
                        if(stackTop.equalsIgnoreCase(tagName))
                            tagStack.pop();
                        else {
                            System.out.println("Error on line number "+lineNumber+" for tag: "+tagName+" !");
                            flag=false;
                        }
                    }
                    else
                        tagStack.push(tagName);
                }
                lineNumber++;
            }
            br.close();
            return flag;
        }catch(IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
