package jour2;

import java.util.*;


public class Job04 {

    public static void main(String[] args)  {

        System.out.println("Java Division");
        Scanner sc = new Scanner(System.in);
        System.out.print("Saissisez le premier chiffre : ");
        int First = sc.nextInt();
        System.out.print("Saissisez le deuxieme chiffre : ");
        int Second = sc.nextInt();

        try {
            System.out.println("Résultat : "+First/Second);
        } catch (ArithmeticException e) {
            System.out.println("erreur : DivisionParZeroException.");
        }
    }
}


