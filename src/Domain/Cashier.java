package Domain;

public class Cashier extends Person{
    public Cashier(String id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "-Cashier-" + "\n" +
                "id: '" + id + "\n" +
                "Name: '" + name + "\n";
    }
}
