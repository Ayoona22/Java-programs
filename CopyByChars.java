import java.io.*;
public class CopyByChars {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("original.txt");
            FileOutputStream fout =new FileOutputStream("copied2.txt");
            int i;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
                fout.write((char)i);
            }fin.close();
            fout.close();
        }catch(IOException e){
            System.out.println("IOException occured");
        }
    }
}

