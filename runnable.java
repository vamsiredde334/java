class MyThread implements Runnable{
    public void run(){
        System.out.println("learning Runnable");
    }
}
public class runnable {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj);
        t1.start();

    }
}
