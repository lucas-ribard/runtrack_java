package jour5;

import java.util.Arrays;
import java.util.HashSet;

public class Job02 {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>(Arrays.asList(args));
        //System.out.println(hash);

        for (String arg : hash) {
            System.out.println(arg);
        }
    }
}



