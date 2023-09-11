package jour4;

/*
un thread est composé d'un objet de type Runnable ici Job01
et d'un objet de type Thread ici thread (L19) qui prend en paramètre l'objet Runnable
et qui lance la méthode run() de l'objet Runnable
 */

class Job01 implements Runnable {
    @Override
    public void run(){
        System.out.println("Salut du Thread !");
    }
}

class SimpleThreadExercice{

    public static void main(String[] args) throws InterruptedException {
        Runnable job01 = new Job01();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(job01);
            thread.start();
            Thread.sleep(1000);
        }
    }
}
