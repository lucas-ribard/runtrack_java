package jour5;

import java.util.function.Consumer;

public class Job04 {
    public static void main(String[] args) {
        System.out.println(" LambdaArgumentExercice");
        if (args.length != 2) {
            System.out.println("deux arguments sont attendus");
            return;
        }

        String inputString = args[0];
        int minLength = Integer.parseInt(args[1]);

        Consumer<String> afficher = (String str) -> {
            if (str.length()>minLength) {

                System.out.println("La chaîne " + str + " a une longueur supérieure à " + minLength);
            } else {
                System.out.println("La chaîne " + str + " n'a pas une longueur supérieure à " + minLength);
            }
        };
        afficher.accept(inputString);


        /*
            System.out.println("inputString: " + inputString);
            System.out.println("minLength: " + minLength);
            System.out.println(inputString.length());

         */


    }

}
