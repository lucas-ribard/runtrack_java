package jour2;
abstract  class Animal {
    abstract  void faireDuBruit() ;
    /*
    une fonction abstraite n'a pas de corps, elle est similaire à un contrat
    si la fonction n'est pas utilisé, le programme ne compile pas
     */

}

 class Chat  extends Animal {
     void faireDuBruit(){
         System.out.println("Le Chat miaule");
     }
}

class Chien  extends Animal {
    void faireDuBruit(){
        System.out.println("Le Chien aboie");
    }
}

class Oiseaux  extends Animal {
    void faireDuBruit(){
        System.out.println("L'oiseaux chante");
    }
}
public class Job03 {
    public static void main(String[] args) {
        System.out.println("Java Animal");
        System.out.println();

        Chat chat = new Chat();
        chat.faireDuBruit();

        Chien chien = new Chien();
        chien.faireDuBruit();

        Oiseaux oiseaux = new Oiseaux();
        oiseaux.faireDuBruit();
    }

}
