public class SyncDemo implements Runnable {

    
    public void run() {
        String name = Thread.currentThread().getName();
        print(name);
    }

    private synchronized void print(String name) {
        try {
            System.out.println("[");
            Thread.sleep(1000);
            System.out.println(name);
            Thread.sleep(1000);                                                                            
            System.out.println("]");
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
    }

    public static void main(String[] args) { 
        SyncDemo sd = new SyncDemo();

        Thread t1 = new Thread(sd, "Alfa");
        Thread t2 = new Thread(sd, "Beta");

        t1.start();
        t2.start();
    }
}