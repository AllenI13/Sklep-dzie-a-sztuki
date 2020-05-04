public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Igor", "Trochimiuk", 666,false);
        PremiumCustomer premiumCustomer = new PremiumCustomer("Mariusz", "Kowalski", 555,true);
        Product product = new Product("Dzieło sztuki", "Picasso obraz", 50000);
        Method method = new Method(customer);
        method.createBill(product,customer);
        method.createBill(product, premiumCustomer);
    }
}
