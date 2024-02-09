class ClassThis{
    void m(){
        System.out.println("Hello m");
    }void n(){
        System.out.println("Hello n");
        m();
    }
}
public class This {
    public static void main(String[] args) {
        ClassThis ct=new ClassThis();
        ct.n();
    }
}
