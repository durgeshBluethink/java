//Create thread using Runnable Interface  
public class MyThread implements Runnable
{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i <= 10; i++) {
            System.out.println(" Another value of i is "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread thread = new Thread(t);
        //MY Another thread
        MyThread1 t1 = new MyThread1();
        thread.start();
        t1.start();
    }

}