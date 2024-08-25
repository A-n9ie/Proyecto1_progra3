package Domain;

public class Product {
    private String code;
    private String description;
    private String unit_m; //Unit of measurement
    private double price;
    private int existence;
    private String category;

    public Product(String code, String description, String unit_m, double price, int existence, String category) {
        this.code = code;
        this.description = description;
        this.unit_m = unit_m;
        this.price = price;
        this.existence = existence;
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit_m() {
        return unit_m;
    }

    public void setUnit_m(String unit_m) {
        this.unit_m = unit_m;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExistence() {
        return existence;
    }

    public void setExistence(int existence) {
        this.existence = existence;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void applyDiscount(double _discount){
        double aux = price * _discount;
        price -= aux;
    }

    @Override
    public String toString() {
        return "-Product-" + "\n" +
                "Code: '" + code + "\n" +
                "Description: '" + description + "\n" +
                "Unit_m: '" + unit_m + "\n" +
                "Price: " + price + "\n" +
                "Existence: " + existence + "\n" +
                "Category: " + category + "\n";
    }
}
