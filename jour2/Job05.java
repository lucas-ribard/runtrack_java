package jour2;

import java.util.Scanner;


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
        if (this.Statut){
            skip();
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "la voiture est déjà démarré"+ ConsoleColors.PURPLE_BOLD);
        }else {
            this.Statut = true;
            skip();
            System.out.println(ConsoleColors.CYAN_BRIGHT + "La Voiture démarre" + ConsoleColors.PURPLE_BOLD);
        }
    }

    public void accelerer() {
        if(this.Statut){
        this.vitesse = this.vitesse+10;
        skip();
        System.out.println("La vitesse est maintenant de " + ConsoleColors.CYAN_BRIGHT + this.vitesse + ConsoleColors.PURPLE_BOLD + " Km/h.");
        }else{
            skip();
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "la voiture est à l'arret"+ ConsoleColors.PURPLE_BOLD);
        }
    }

    public void freiner() {
        if(this.vitesse>0){
        this.vitesse=this.vitesse-10;
        skip();
        System.out.println("La vitesse est maintenant de "+ ConsoleColors.CYAN_BRIGHT + this.vitesse+"Km/h"+ ConsoleColors.PURPLE_BOLD);
    }else {
            skip();
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "la voiture est à l'arret"+ ConsoleColors.PURPLE_BOLD);
        }
    }

    public void arreter() {
        if(this.Statut){
            this.vitesse=0;
            this.Statut=false;
            skip();
            System.out.println("La Voiture s'arrete, la vitesse réinitialisé a "+ ConsoleColors.CYAN_BRIGHT + "0Km/h"+ ConsoleColors.PURPLE_BOLD);

        }else{
            skip();
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "la voiture est déjà à l'arret"+ ConsoleColors.PURPLE_BOLD);
    }}

    public void skip(){
        for (int i=0;i<10;i++){
            System.out.println();
        }
    }

}
public class Job05 {
    public static void main(String[] args) {

        System.out.println(ConsoleColors.PURPLE_BOLD + "Créer Votre Voiture :");

        Scanner sc= new Scanner(System.in);
        System.out.print("Choissisez la marque de votre voiture : ");
        String marque= sc.nextLine();

        System.out.print("Choissisez la couleur de votre voiture : ");
        String couleur= sc.nextLine();

        Voiture voiture = new Voiture(marque,couleur,0);
        while(true){
            System.out.println("Que voulez vous faire ? ");
            System.out.println("1 : Démarrer la voiture");
            System.out.println("2 : Accélérer la voiture");
            System.out.println("3 : Freiner la voiture");
            System.out.println("4 : Arreter la voiture");
            System.out.println("5 : Quitter");
            System.out.print("Votre choix : ");
            int choix = sc.nextInt();
            switch (choix) {
                case 1 -> voiture.demarrer();
                case 2 -> voiture.accelerer();
                case 3 -> voiture.freiner();
                case 4 -> voiture.arreter();
                case 5 -> System.exit(0);
                default -> System.out.println("Choix invalide");
            }

            try {
               if(voiture.vitesse>110){
                   throw new Exception();
               }
            } catch (Exception e) {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT +"erreur : La VitesseLimiteDepasseeException .");
                break   ;
            }

        }
    }
}