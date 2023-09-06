import java.util.*;

class Voiture {

    String marque;
    String couleur;
    int vitesse;

    boolean Statut;  //statut de la voiture , 0 si à l'arret, 1 si démarré

    //Constructeur de la classe Voiture
    Voiture(String marque, String couleur, int vitesse) {
        //Initialise l’attribut marque avec la valeur de l’argument marque
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.Statut = false;
        System.out.println("La Voiture à été crée, c'est une "+ ConsoleColors.CYAN_BRIGHT + marque + " " + couleur + ConsoleColors.PURPLE_BOLD);
        System.out.println();
    }

    public  void demarrer() {
        this.Statut = true;

        if(this.Statut==true){
            System.out.println("La Voiture démarre");
        }else{
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "la voiture est en panne"+ ConsoleColors.PURPLE_BOLD);
        }
    }

    public void accelerer() {
        this.vitesse = this.vitesse+10;
        System.out.println("La vitesse est maintenant de " + ConsoleColors.CYAN_BRIGHT + this.vitesse + ConsoleColors.PURPLE_BOLD + " Km/h.");
    }

    public void freiner() {
        this.vitesse=0;
        System.out.println("La Voiture s'arrete, la vitesse réinitialisé a "+ ConsoleColors.CYAN_BRIGHT + "0Km/h"+ ConsoleColors.RESET);
    }

}
public class Job02 {
    public static void main(String[] args) {

        System.out.println(ConsoleColors.PURPLE_BOLD + "Créer Votre Voiture :");

        Scanner sc= new Scanner(System.in);
        System.out.print("Choissisez la marque de votre voiture : ");
        String marque= sc.nextLine();

        System.out.print("Choissisez la couleur de votre voiture : ");
        String couleur= sc.nextLine();

        Voiture voiture = new Voiture(marque,couleur,0);
        voiture.demarrer();
        voiture.accelerer();
        voiture.accelerer();
        voiture.freiner();
    }
}