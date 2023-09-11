package jour4;

public class Job03 {
    static int solde = 200;
    static int retrait = 50;

    public static synchronized void run(){
      solde = solde - retrait;
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("SynchronizationExercice");
        Thread thread1 = new Thread(Job03::run);
        Thread thread2 = new Thread(Job03::run);

        thread1.start();
        thread2.start();
        //Thread.sleep(10);

        thread2.join(); // wait for thread2 to finish
        // the use of syncronized in the run method ensures that the two threads do not access the variable at the same time and that the result is always 100

        System.out.println(solde);
    }
}

