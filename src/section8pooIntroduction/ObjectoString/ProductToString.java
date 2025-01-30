package section8pooIntroduction.ObjectoString;

public class ProductToString {

    // Produto é uma entidade do negócio

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // ----------------------- NEW -------------------------

    public String toString() {
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + "units, Total: $" + totalValueInStock();

    }
}
