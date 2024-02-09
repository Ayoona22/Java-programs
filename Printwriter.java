import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {
    public static void main(String[] args)throws IOException {
        PrintWriter w=new PrintWriter(new File("f1.txt"));
        PrintWriter w1=new PrintWriter(System.out);
        w1.write("Hello Java");
        w1.flush();
        w1.close();
        w.write("You are the");
        w.flush();
        w.close();
    }
}
