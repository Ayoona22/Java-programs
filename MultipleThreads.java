class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : a"+i);
        }
    }
}class ThreadB extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : b"+i);
        }
    }
}class ThreadC extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : c"+i);
        }
    }
}
public class MultipleThreads {
    public static void main(String[] args)  {
        try{
    ThreadA ta=new ThreadA();
    ta.setName("ThreadA");
    ThreadB tb=new ThreadB();
    tb.setName("ThreadB");
    ThreadC tc=new ThreadC();
    tc.setName("ThreadC");
    ta.start();
    tb.start();
    tc.start();
    }catch(Exception e){
        System.out.println("exception occurs");
    }
}}
