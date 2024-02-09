

class InnerRecursion {
    int x;
    InnerRecursion(int n){
        x=n;
        System.out.println(x+"\n");
    }int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }else{
            return 0;
        }
    }
}
public class Recursion {
    public static void main(String[] args) {
        InnerRecursion i=new InnerRecursion(5);
        int ss=i.sum(5);
        System.out.println(ss);
    }
}
