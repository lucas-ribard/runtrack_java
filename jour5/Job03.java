package jour5;

import java.util.HashMap;
public class Job03 {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        if (args.length % 2 != 0) {
            System.out.println("Le nombre d'arguments doit être pair !");
            return;
        }

        for (int i = 0; i < args.length; i += 2) {
            String cle = args[i];
            String valeur = args[i + 1];
            hash.put(cle, valeur);
        }


        System.out.println(hash);
}}



