package ex3;

public class Serviciu {

    public static void Add(Produs p1) {
        Magazin.produse.add(p1);
        System.out.println("Add: " + p1.toString());
    }
}
