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

            double area = base * altezza;

            System.out.println("L'area del rettangolo è: " + area);

        }
        }
        public static class Triangolo extends Forma {

            double altezza, base;


            public Triangolo(double altezza, double base) {
                this.altezza = altezza;
                this.base = base;


            }
            @Override
            public void calcolaArea(){

                double area= (base * altezza)/2;
                System.out.println("L'area del triangolo è: " + area);

            }
        }
public class Main {

}
    public static void main(String[] args) {


        Rettangolo rettangolo ;
        rettangolo =new Rettangolo(15,10);


        rettangolo.calcolaArea();

        Triangolo triangolo= new Triangolo(30,20);
        triangolo.calcolaArea();

        }
    }
