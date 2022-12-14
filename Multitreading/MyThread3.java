// thi thrad is user define 
class userThread extends Thread{
    public void run(){
        System.out.println("this is user define thread");
    }
}
 
 
 class MyThread3 {
    public static void main(String[] args) {
        System.out.println("Program is Start...");
        int a = 12+23;
        System.out.println("sum of "+12+" + "+13+" number this "+a);

        //find current thrad name..
        Thread t = Thread.currentThread();
        //get Current thread name...
        String tName = t.getName();
        // print current thrread name...
        System.out.println("Current running thread is "+tName);

        //change name of current thread...
        t.setName("MyName");
        //get change name of thread...
        System.out.println("New Name of  running thread is "+t.getName());
        // Sleep our program 5000 Milisecound...
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        };
        System.out.println(t.getId());
        // end of program...
        System.out.println("Program is End...");
        userThread thread =new userThread();
        thread.start();
    }
}
