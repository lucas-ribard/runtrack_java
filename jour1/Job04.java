package jour1;

import java.util.*;
class CompteBancaire{
    int solde = 100;


    void deposer(int quantite) {
        this.solde=this.solde+quantite;
        }

    void retirer(int quantite) {
        if( (this.solde-quantite) > 0){
            this.solde=this.solde-quantite;
        }else {
            System.out.println("Tentative de retrait de " + quantite+"€ ... "+ ConsoleColors.RED_BOLD_BRIGHT +"retrait impossible"+ ConsoleColors.RESET);
        }

    }
    void consulterSolde() {
        System.out.println("Votre solde est de " + ConsoleColors.YELLOW_BRIGHT + this.solde+"€" + ConsoleColors.RESET);
    }

    void menu(){
        System.out.println("Java Banque");
        System.out.println();
        System.out.println("Bienvenue, Veillez saisir votre action : ");
        Scanner sc= new Scanner(System.in);
        System.out.print(ConsoleColors.CYAN_BOLD_BRIGHT +" 1 Déposer , 2 Retirer , 3 Afficher votre solde "+ ConsoleColors.RESET);
        int action = sc.nextInt();

        if ((action <= 3) && (action >= 1)) {


            if (action==1){
                System.out.print("Saisissez combien déposer : ");
                int quantite = sc.nextInt();
                deposer(quantite);
                exit();
            } else if (action==2) {
                System.out.print("Saisissez combien retirer : ");
                int quantite = sc.nextInt();
                retirer(quantite);
                exit();
            }
            else if (action==3) {
                consulterSolde();
                exit();
            }


        } else {
            System.out.println("Veillez saisir un action valide");
            clear();
        }


    }

    void clear(){
        //saute la ligne 50 fois pour ne pas remplir l'écrans de ligne inutile
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }
    //menu de sortie
    void exit(){
        Scanner sc= new Scanner(System.in);
        System.out.println( ConsoleColors.CYAN_BOLD + " 1 Retourner au menu "+ ConsoleColors.RED_BOLD+"  2 Quitter "+ ConsoleColors.RESET);
        int action = sc.nextInt();
        if (action == 1){
            clear();
        } else if (action == 2) {
            //stop le code
            System. exit(0);
        }
    }


}
public class Job04 {


    public static void main(String[] args) {

        CompteBancaire compteBancaire = new CompteBancaire();
        //boucle infinie pour retourner au menu
        int i = 0;
        while ( i <= 5 ) {
            compteBancaire.menu();
        }

    }

}
