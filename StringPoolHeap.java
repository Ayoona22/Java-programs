/**
 * StringPoolHeap
 */
public class StringPoolHeap {

    public static void main(String[] args) {
        String s="abel";
        String s2="Abel";
        String s1=new String("Abel");
        String s3=new String(s1);
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s1.compareTo(s));
    }
}