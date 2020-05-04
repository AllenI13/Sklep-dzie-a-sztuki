public class Invoice extends Product {
    public Invoice(Customer customer, Product product) {
        super(product.getType(), product.getInfo(), product.getPrice());
    }

    public String invoiceInfo(Product product, Customer customer) {
        return product.toString() + "price: " + getPrice() + " " + customer.toString();
    }
}

