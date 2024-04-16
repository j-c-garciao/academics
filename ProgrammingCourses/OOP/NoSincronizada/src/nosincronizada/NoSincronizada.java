package nosincronizada;
   
public class NoSincronizada extends Thread {
    static int n = 1;
    static int id;
    
    public NoSincronizada(int id) {
        this.id=id;
    }
    
    @Override
    public void run() {
        System.out.println("Hilo :="+this.id);
        for (int i = 0; i < 10; i++) {
            System.out.println(n);
            n++;
        }
    }
    public static void main(String args[]) {
        Thread thr1 = new NoSincronizada(1);
        Thread thr2 = new NoSincronizada(2);
        thr1.start();
        thr2.start();
    }
}












