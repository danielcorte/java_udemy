package section9ThisEncapsConstrOverchar.Encapsulation;

public class GettersSetters {
// Produto é uma entidade do negócio

    private String name;
    private double price;
    private int quantity;

    public GettersSetters(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public GettersSetters(String name, double price) {
        this.name = name;
        this.price = price;
        /*quantity = 0; Não precisa pois o java ja inicia com 0*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
}
