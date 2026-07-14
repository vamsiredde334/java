class MyThread extends Thread {
    public void run() {
        System.out.println("WELCOME");
        
    }
}

public class sleep {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
    System.out.println("VAMSI");
    }

}
