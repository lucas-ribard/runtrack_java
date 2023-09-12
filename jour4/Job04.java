package jour4;

import java.util.Scanner;
import java.util.concurrent.*;

public class Job04 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        //executor is a service that creates and manages threads for us

        Scanner sc= new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        Callable<Integer> call = new CallableFuture(first,second);
        //callablefuture uses the callable interface to create a thread that returns a value

        Future<Integer> future = executor.submit(call);
        //future is a variable that will hold the result of the thread
        System.out.println(future.get());
        //future.get() will wait for the thread to finish and return the result
        executor.shutdown();

    }
}

class CallableFuture implements Callable<Integer> {
    private final int input1;
    private final int input2;

    public CallableFuture(Integer input1, Integer input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public Integer call() throws Exception {
        return input1 * input2;
    }
}
