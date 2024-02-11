import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class MyException extends Exception{
    MyException(String s){
        System.out.println(s);
    }
}

public class CountsTextFile {
    public static void main(String[] args) {
        try{
            FileReader r=new FileReader("original.txt");
            BufferedReader br = new BufferedReader(r);
            int c=0,l=0,w=0;
            String str;
            while((str=br.readLine())!=null){
                l+=1;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='\n'){
                        w+=1;
                    }else if(str.charAt(i)==' '){
                        w+=1;
                    }else{
                        c+=1;
                    }
                }
            }w+=1;
            System.out.println("Characters : "+c+"\nWords : "+w+"\nLines : "+l);
            if(w>10){
                String s="Words is greater than 10";
                throw new MyException(s);
            }
        }catch(MyException e){
            System.out.println(e);
        }catch(FileNotFoundException fe){
            System.out.println("File Not Found");
        }catch(IOException io){
            System.out.println("IOException");
        }

    }    
}
