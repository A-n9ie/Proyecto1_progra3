package Domain;

public class Customer extends Person {
    private String email;
    private String phone;
    private double discount;

    public Customer(String id, String name, String email, String phone, double discount) {
        super(id, name);
        this.email = email;
        this.phone = phone;
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "-Customer-" + "\n" +
                "Id: '" + id + "\n" +
                "Name:'" + name + "\n" +
                "Email: '" + email + "\n" +
                "Phone: '" + phone + "\n" +
                "Discount: " + discount + "\n";
    }
}
