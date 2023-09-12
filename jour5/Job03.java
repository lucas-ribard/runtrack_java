package jour5;

import java.util.HashMap;
public class Job03 {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        for (int i = 0; i < args.length; i += 2) {
            String cle = args[i];
            String valeur = args[i + 1];
            hash.put(cle, valeur);
        }


        System.out.println(hash);
}}



