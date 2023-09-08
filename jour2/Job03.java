package jour2;
import java.util.*;

class Calculatrice {

    int premier;
    int deuxieme;
    int calcul;

    Calculatrice(int premier, int deuxieme, int calcul) {
        //Initialise l’attribut marque avec la valeur de l’argument marque
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.calcul = calcul;

        if(this.calcul==1){
            addition();
        } else if (this.calcul==2) {
            soustraction();
        }
        else if (this.calcul==3) {
            multiplication();
        }
        else if (this.calcul==4) {
            division();
        }
    }

    private void addition() {
        System.out.print("Le résultat de "+ ConsoleColors.YELLOW_BRIGHT + this.premier+" + "+this.deuxieme + " est : " + (this.premier+this.deuxieme)+ ConsoleColors.RESET);
    }
    private void soustraction() {
        System.out.print("Le résultat de "+ ConsoleColors.YELLOW_BRIGHT + this.premier+" - "+this.deuxieme + " est : " + (this.premier-this.deuxieme)+ ConsoleColors.RESET);
    }

    private void multiplication() {
        System.out.print("Le résultat de "+ ConsoleColors.YELLOW_BRIGHT + this.premier+" x "+this.deuxieme + " est : " + (this.premier*this.deuxieme)+ ConsoleColors.RESET);
    }

    private void division() {
        System.out.print("Le résultat de "+ ConsoleColors.YELLOW_BRIGHT + this.premier+ " \\ " +this.deuxieme + " est : " + (this.premier/this.deuxieme)+" avec pour reste : " + (this.premier%this.deuxieme) + ConsoleColors.RESET);
    }
}
public class Job03 {
    public static void main(String[] args) {
        System.out.println("Java Calculatrice");
        Scanner sc= new Scanner(System.in);
        System.out.print("Veillez saisir le premier chiffre : ");
        int premier = sc.nextInt();
        System.out.print("Veillez saisir le deuxieme chiffre : ");
        int deuxieme = sc.nextInt();

        System.out.print("Veillez saisir le calcul désiré :"+ ConsoleColors.CYAN_BRIGHT +" 1 ADDITION , 2 SOUSTRACTION , 3 MULTIPLICATION , 4 DIVISION :"+ ConsoleColors.RESET);
        int calcul = sc.nextInt();
        System.out.println();

        if ((calcul <= 4) && (calcul >= 1)) {
            Calculatrice calculatrice = new Calculatrice(premier,deuxieme,calcul);


        } else {
            System.out.println("Veillez saisir un chiffre de calcul valide");
        }


    }
}
