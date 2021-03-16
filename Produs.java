package ex3;
class Produs {

    private String name;
    private double price;
    private  int quantity;

    public Produs(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    public Produs() {
        this("Anonim", 0.0, 0);
    }


    public String toString() {
        return name + ", " + price + " " + quantity;
    }

    public double getTotalProdus() {
        return this.quantity * this.price;
    }
}