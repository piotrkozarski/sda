package ZadaniaObiektowe;

import Zad2.Punkt;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        punkt.setCoordinateX(5);
        punkt.setCoordinateY(7);
        punkt.setGetCoordinateY(6);
        punkt.setAnyNumber(4);
        for (int i : punkt.XxandYy()) {
            System.out.println();
        }

        System.out.println("x wynosi: " + punkt.getCoordinateX());
        punkt.incrementCoordinateX();

        System.out.println(punkt.getCoordinateX());
        System.out.println(punkt.getCoordinateX()+punkt.getAnyNumber());
        System.out.println(punkt.getGetCoordinateY()+punkt.getAnyNumber());

        System.out.println("----");
        System.out.println(punkt.XxandYy());
        System.out.println("---");
        punkt.printTableOfXandY(punkt.XxandYy());

        punkt.printXandY();
    }
}
