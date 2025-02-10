


class Animale {

    // Metodo che stampa il verso dell'animale
    public void faiIlVerso() {
        System.out.println("L'animale fa: AUUUU.");
    }
}

// Sottoclasse Gatto che estende Animale
class Gatto extends Animale {
    // Override del metodo faiIlVerso per il gatto
    @Override
    public void faiIlVerso() {
        System.out.println("Il gatto fa: Miaooo!");
    }
}


public class Main {
    public static void main(String[] args) {

        Animale animale = new Animale();
        animale.faiIlVerso(); // Stampa il verso dell'animale


        Gatto gatto = new Gatto();
        gatto.faiIlVerso(); // Stampa il verso del gatto
    }
}