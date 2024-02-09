import java.io.*;
import java.util.Scanner;
public class palindrome {
    palindrome(String s){
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }if(s2.equals(s)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        palindrome p=new palindrome(str);
    }
    
}