package jour4;


class Job02 implements Runnable {
    @Override
    public void run(){
        System.out.println("En cours d'exécution...");
    }
}

class RunnableInterfaceExercice{

    public static void main(String[] args) throws InterruptedException {
        Runnable job02 = new Job02();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(job02);
            thread.start();
            Thread.sleep(1000);
        }
    }
}
