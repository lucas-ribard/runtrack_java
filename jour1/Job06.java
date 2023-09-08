package jour1;
import java.util.*;
class Etudiant{
    String nom;
    ArrayList<Integer> notes = new ArrayList<Integer>();
    Etudiant(String nom) {
        //Initialise l’attribut nom
        this.nom = nom;
    }
    void menu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Java Etudiant");
        System.out.println();
        System.out.println("Bienvenue " + this.nom + ", Veillez saisir votre action : ");
        System.out.print(ConsoleColors.CYAN_BOLD_BRIGHT +" 1 Ajouter une note , 2 Afficher les note , 3 Afficher les statistiques "+ ConsoleColors.RESET);
        int action = sc.nextInt();

        if ((action <= 3) && (action >= 1)) {


            if (action==1){
                System.out.print("Saisissez la note à ajouter : ");
                int note = sc.nextInt();
                notes.add(note);
                exit();
            } else if (action==2) {
                System.out.println(notes);
                exit();
            }else if (action==3) {
                getMoyenne();
                getNoteHaute();
                getNoteBasse();
                exit();
            }



        } else {
            System.out.println("Veillez saisir un action valide");
            clear();
        }


    }
    void getMoyenne() {
        float moyenne = 0;
        int i;
        for (i = 0; i < notes.size(); i++) {
            moyenne = moyenne + (notes.get(i));
        }
        System.out.println("Votre moyenne est de : " + (moyenne / i));
    }

    void getNoteHaute() {
        int noteHaute = 0;
        int i;
        for (i = 0; i < notes.size(); i++) {
            if (noteHaute < (notes.get(i))){
                noteHaute = notes.get(i);
            }
        }
        System.out.println("Votre Note la plus haute est  : " + noteHaute);
    }
    void getNoteBasse() {
        int noteBasse = 100;
        int i;
        for (i = 0; i < notes.size(); i++) {
            if (noteBasse > (notes.get(i))){
                noteBasse = notes.get(i);
            }
        }
        System.out.println("Votre Note la plus haute est  : " + noteBasse);
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
public class Job06 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bienvenue, Veillez saisir votre nom : ");
        String nom = sc.nextLine();
        Etudiant etudiant = new Etudiant(nom);
        //boucle infinie pour retourner au menu
        int i = 0;
        while ( i <= 5 ) {
            etudiant.menu();
        }

    }

}
