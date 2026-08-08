public class ThreadControl extends Thread{
    public ThreadControl(String name) {
        super(name);
    }
    public void run(){
        String name = Thread.currentThread().getName();
        while(true) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        ThreadControl t1 = new ThreadControl("Hello");
        ThreadControl t2 = new ThreadControl("World");
        t1.start();
        t2.start();
    }
} 