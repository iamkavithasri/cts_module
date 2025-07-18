class MessageThread extends Thread {
    String msg;
    MessageThread(String msg) { this.msg = msg; }
    public void run() {
        for (int i=0; i<3; ++i) {
            System.out.println(msg + " " + (i+1));
        }
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        new MessageThread("Thread 1").start();
        new MessageThread("Thread 2").start();
    }
}
