package jour2;

import java.util.*;
class CompteBancaire{
    int soldeCompteCourant = 100;
    int soldeCompteEpargne= 100;
    int interet = 2;

    int revenu ;

    void genererInteret(){
        this.revenu = (this.soldeCompteEpargne*this.interet/100);
    }
    void deposer(int quantite) {
        this.soldeCompteCourant=this.soldeCompteCourant+quantite;
    }
    void deposerEpargne(int quantite) {
        if( (this.soldeCompteCourant-quantite) > 0){
            this.soldeCompteCourant=this.soldeCompteCourant-quantite;
            this.soldeCompteEpargne=this.soldeCompteEpargne+quantite;
        }else {
            System.out.println("Tentative de dépot de " + quantite+"€ ... "+ ConsoleColors.RED_BOLD_BRIGHT +"retrait impossible : solde insufisant"+ ConsoleColors.RESET);
        }
    }

    void retirerEpargne(int quantite) {
        if( (this.soldeCompteEpargne-quantite) > 0){
            this.soldeCompteEpargne=this.soldeCompteEpargne-quantite;
            this.soldeCompteCourant=this.soldeCompteCourant+quantite;
        }else {
            System.out.println("Tentative de retrait de " + quantite+"€ ... "+ ConsoleColors.RED_BOLD_BRIGHT +"retrait impossible : solde insufisant"+ ConsoleColors.RESET);
        }
    }

    void retirer(int quantite) {
        if( (this.soldeCompteCourant-quantite) > 0){
            this.soldeCompteCourant=this.soldeCompteCourant-quantite;
        }else {
            System.out.println("Tentative de retrait de " + quantite+"€ ... "+ ConsoleColors.RED_BOLD_BRIGHT +"retrait impossible"+ ConsoleColors.RESET);
        }

    }
    void consulterSolde() {
        System.out.println("Votre solde du compte courant est de " + ConsoleColors.YELLOW_BRIGHT + this.soldeCompteCourant+"€" + ConsoleColors.RESET);
        System.out.println("Votre solde du compte épargne est de " + ConsoleColors.YELLOW_BRIGHT + this.soldeCompteEpargne+"€" + ConsoleColors.RESET);
    }

    void consulterTaux() {
        genererInteret();
        System.out.println("Votre Taux du compte courant est de " + ConsoleColors.YELLOW_BRIGHT + this.interet+"%" + ConsoleColors.RESET);
        System.out.println("Le montant généré est de : " +  ConsoleColors.YELLOW_BRIGHT + this.revenu  + "€" + ConsoleColors.RESET);

    }
    void recupererInteret() {
        genererInteret();
        this.soldeCompteEpargne=this.soldeCompteEpargne+this.interet;
        System.out.println("Le montant généré est de : " +  ConsoleColors.YELLOW_BRIGHT + this.revenu  + "€" + ConsoleColors.RESET);
        System.out.println("votre nouveaux solde est de : " +  ConsoleColors.YELLOW_BRIGHT + this.soldeCompteEpargne  + "€" + ConsoleColors.RESET);
    }


    void menu(){
        System.out.println("Java Banque");
        System.out.println();
        System.out.println("Bienvenue, Veillez saisir votre action : ");
        Scanner sc= new Scanner(System.in);
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +" 1 - Déposer , 2 - Retirer , 3 - Afficher vos soldes"+ ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +" 4 - Déposer sur votre compte Courant , 5 - Retirer du compte courant"+ ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +" 6 - Afficher le taux d'interret , 7 - Récupérer l'interret"+ ConsoleColors.RESET);
        int action = sc.nextInt();

        if ((action <= 7) && (action >= 1)) {


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
            }else if (action==4){
                System.out.print("Saisissez combien déposer : ");
                int quantite = sc.nextInt();
                deposerEpargne(quantite);
                exit();
            }else if (action==5){
                System.out.print("Saisissez combien retirer : ");
                int quantite = sc.nextInt();
                retirerEpargne(quantite);
                exit();
            }else if (action==6){
                consulterTaux();
                exit();
            }else if (action==7){
                recupererInteret();
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
public class Job01 {


    public static void main(String[] args) {

        CompteBancaire compteBancaire = new CompteBancaire();
        //boucle infinie pour retourner au menu
        int i = 0;
        while ( i <= 5 ) {
            compteBancaire.menu();
        }

    }

}
