/* Scrivere un programma che contenga una classe chiamata Animale ed
un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso()
per miagolare. Prova quindi a far stampare il verso di Animale e di Gatto.
 */


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