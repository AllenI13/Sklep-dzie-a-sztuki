public class Method extends PremiumCustomer {
    public Method(Customer customer) {
        super(customer.getName(), customer.getSurname(), customer.getId(), customer.isIndividual());
    }

    public void createBill(Product product, Customer customer) {

        if (!(customer instanceof PremiumCustomer)) {
            if (customer.isIndividual()) {
                Bill bill = new Bill(customer, product);
                System.out.println(bill.billInfo(product, customer));
            } else {
                Invoice invoice = new Invoice(customer, product);
                System.out.println(invoice.invoiceInfo(product, customer));
            }
        } else {
            if (customer.isIndividual()) {
                Bill bill = new Bill(customer, product);
                bill.setPrice(product.getPrice() * 0.9);
                System.out.println(bill.billInfo(product, customer));
            } else {
                Invoice invoice = new Invoice(customer, product);
                invoice.setPrice(product.getPrice() * 0.9);
                System.out.println(invoice.invoiceInfo(product, customer));
            }
        }
    }
}
