public class Bill extends Product {
    public Bill(Customer customer, Product product) {
        super(product.getType(), product.getInfo(), product.getPrice());

    }
    public String billInfo(Product product, Customer customer) {
        return product.toString() + " price: " + getPrice() + "}";
    }
}

