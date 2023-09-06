import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        System.out.println("Java JeuDeDes");
        int premierDes = (int) (1+Math.round(Math.random() * ( 6 - 1 )));
        int deuxiemeDes = (int) (1+Math.round(Math.random() * ( 6 - 1 )));
        System.out.println("Dé 1 : " + premierDes);
        System.out.println("Dé 2 : " + deuxiemeDes);
        System.out.println("Somme : " + (premierDes+deuxiemeDes));


    }

}
