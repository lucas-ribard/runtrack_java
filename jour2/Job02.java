package jour2;


interface Nageur {  // notre interface
    public void nager();
}

class Homme implements Nageur {
    @Override
    public void nager() {
        System.out.println("L'homme nage");
    }
}

class Poisson implements Nageur {
    @Override
    public void nager() {
        System.out.println("Le poisson nage rapidemment");
    }

}

public class Job02 {
    public static void main(String[] args) {
        Homme homme = new Homme();
        homme.nager();

        Poisson poisson = new Poisson();
        poisson.nager();
    }
}
