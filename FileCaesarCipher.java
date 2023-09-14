import java.io.*;

class FileCaesarCipher{
    public static void main(String[] args) {
        File f=null;
        FileInputStream fis=null;
        FileOutputStream fos=null;
        BufferedReader brconsole=null;
        BufferedReader brfile=null;

        try{
            brconsole=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter to be encrypted and stored. Enter \"exit\" to stop.");

            String inputline="";
            String temp;
            String encrypted="";
            int key=0;
            int i=0;

            while(!(temp=brconsole.readLine()).equalsIgnoreCase("exit")){
                inputline=inputline+temp;
                inputline=inputline+ "\n";
            }

            System.out.print("Enter Key: ");
            key=Integer.parseInt(brconsole.readLine());

            while(i<inputline.length()){

                if(inputline.charAt(i)>='a' && inputline.charAt(i)<='z')
                    encrypted = encrypted + (char)(((inputline.charAt(i)-'a'+3)%26)+'a'); 
                else 
                    encrypted = encrypted + (char)inputline.charAt(i);
                i++;
            }

            f=new File("Filecipher.txt");
            fos=new FileOutputStream(f);

            fos.write(encrypted.getBytes());
            System.out.println("Data encrypted and stored successfully!\n");

            fis=new FileInputStream(f);
            brfile= new BufferedReader(new InputStreamReader(fis));
            int readfile;
            String decrypted="";

            System.out.print("Enter Key to access data in file: ");

            if(Integer.parseInt(brconsole.readLine())==key){

                while((readfile=fis.read())!=-1){
                    
                    if(readfile>=97 && readfile<=122)
                        decrypted = decrypted + (char)(((readfile-122-3)%26)+122);
                    else   
                        decrypted=decrypted + (char)(readfile);
                }
                System.out.println("Decrypted Data: "+ decrypted);
            }
            else
                System.out.println("Invalid KEY!");

            fis.close();
            fos.close();
            brconsole.close();
            brfile.close();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("All streams closed.");
        }
    }
}