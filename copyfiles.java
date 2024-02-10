import java.io.*;
public class copyfiles {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("original.txt");
            FileWriter fw=new FileWriter("copied.txt");
            BufferedReader br=new BufferedReader(fr);
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
                fw.write(str+"\n");
            }fr.close();
            fw.close();
        }catch(IOException e){
            System.out.println("IOException occured");
        }
    }
}
