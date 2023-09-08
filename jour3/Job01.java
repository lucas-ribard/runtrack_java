package jour3;

import java.util.ArrayList;
import java.util.Scanner;


public class Job01 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.print("Choissisez la quantité de valeurs dans l'array : " );
        int max = sc.nextInt();

        //boucle pour remplir l'array
        for(int i = 0; i < max; i++) {
            list.add(i);
        }

        int somme = 0;

        //boucle qui définit les nombres paires et les additionne
        System.out.println(list);
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                somme += integer;
            }
        }
        System.out.println("Somme des nombres pairs : " + somme);
    }
}

