/**
 * InnerMultithreading
 */
class InnerMultithreading implements Runnable{
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
    
}
public class Multithreading {
    public static void main(String[] args) {
        InnerMultithreading in=new InnerMultithreading();
        Thread t1=new Thread(in);
        t1.start();
    }
}
