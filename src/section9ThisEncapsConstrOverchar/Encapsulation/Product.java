package section9ThisEncapsConstrOverchar.Encapsulation;

public class Product {
// Produto é uma entidade do negócio

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) { this.price = price; }

    public Integer getQuantity() {
        return quantity;
    }

    /* O setQuantity deve ser utilizado somente quando houver um evento de compra ou venda, dessa forma
     * protegendo a integridade dos produtos */
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

