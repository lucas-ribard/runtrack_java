package jour4;

class SimpleThreadExercice{

    public static void run() {
        System.out.println("Salut du thread!");
    }
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(SimpleThreadExercice::run);
            thread.start();
            Thread.sleep(1000);
        }
    }
}
