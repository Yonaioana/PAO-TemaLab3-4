import java.util.ArrayList;
import java.util.List;
package ex3;
class Magazin {

    private String name;
    public static List<Produs> Product;

    public static void main(String[] args) {

        Magazin shop = new Magazin("OnlineMagazin", new Produs("Blugi", 43, 12), new Produs("Bluza", 9.4, 10), new Produs());

        Serviciu.Add(new Produs("Tricou", 23, 30));

    }

    public Magazin(String nume, Produs p1, Produs p2) {
        name = nume;
        Product = new ArrayList<>();
        Product.add(p1);
        Product.add(p2);
    }

    public Magazin() {
        this("Anonim", new Produs(), new Produs());
    }


    public String toString() {
        String denumire= nume + "\n";
        for (Produs prod : Product) {
            shop = shop + prod.toString() + "\n";
        }
        return shop;
    }

    public double getTotalMagazin() {
        double sum = 0;
        for (Produs prod : Product) {
            sum = sum + prod.getTotalMagazin();
        }
        return sum;
    }
}