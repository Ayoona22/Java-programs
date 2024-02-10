import java.util.*;
public class Tokenizer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the integers : ");
        String numList=sc.nextLine();
        StringTokenizer st=new StringTokenizer(numList," ");
        int sum=0;
        while(st.hasMoreTokens()){
            sum+=Integer.parseInt(st.nextToken());
        }System.out.println("Sum = "+sum);
    }
    
}
