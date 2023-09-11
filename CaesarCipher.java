import java.util.*;


public class CaesarCipher {
    public static void main(String[] args) {
        int i=0;
        char[] encryptedtext=new char[500];
        char[] decryptedtext=new char[500];
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter text to be encrypted: ");
        String text=sc.nextLine();
        System.out.print("Enter KEY: ");
        int key=sc.nextInt();

        while(i<text.length()){
            if(text.charAt(i)>='A' && text.charAt(i)<='Z')
                encryptedtext[i]=(char)(((text.charAt(i)-'A'+3)%26)+'A');
            else if(text.charAt(i)>='a' && text.charAt(i)<='z')
                encryptedtext[i]=(char)(((text.charAt(i)-'a'+3)%26)+'a');
            else
                encryptedtext[i]=(char)text.charAt(i);
            i++;
        }
        i=0;
        System.out.print("Encrypted text: ");
        System.out.println(encryptedtext);

        System.out.print("Enter KEY to decrypt the text: ");

        if(sc.nextInt()==key){
            sc.close();
            while(i<encryptedtext.length){
                if(encryptedtext[i]>='A' && encryptedtext[i]<='Z')
                    decryptedtext[i]=(char)(((encryptedtext[i]-'Z'-3)%26)+'Z');
                else if(encryptedtext[i]>='a' && encryptedtext[i]<='z')
                    decryptedtext[i]=(char)(((encryptedtext[i]-'z'-3)%26)+'z');
                else
                    decryptedtext[i]=(char)encryptedtext[i];
                i++;
            }
            System.out.print("Decrypted text: ");
            for(i=0;i<decryptedtext.length;i++)
                System.out.print(decryptedtext[i]);
        }
        else
            System.out.println("Invalid KEY!");
    }
}