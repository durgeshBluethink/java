public class MyThread1 extends Thread
{
    @Override
    public void run(){
     for (int i = 10; i >0; i--) {
        System.out.println("value of i is "+i);
        try {
        Thread.sleep(2000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            
        }
     }
    }
    // public static void main(String[] args) {
    //     MyThread1 t = new MyThread1();
    //     t.start();
    // }
}
