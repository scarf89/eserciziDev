/* Scrivere un programma che contenga una classe chiamata Forma
 ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override
del metodo calcolaArea() per calcolare l'area del rettangolo.
*/

class Forma{

    public void calcolaArea(){

        System.out.println("L'area è: ");
    }

    public static class Rettangolo extends Forma {

         double base;
         double altezza;

        // costrutore
        public Rettangolo(double altezza, double base) {
            this.altezza = altezza;
            this.base = base;
        }

        @Override
        public void calcolaArea() {

            double area= base * altezza;

            System.out.println("L'area del rettangolo è: " + area);


        }
    }
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo ;
        rettangolo =new Rettangolo(15,10);


        rettangolo.calcolaArea();

        }
    }
}