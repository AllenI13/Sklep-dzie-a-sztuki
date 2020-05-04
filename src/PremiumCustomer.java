public class PremiumCustomer extends Customer {

    public PremiumCustomer(String name, String surname, int id, boolean individual) {
        super(name, surname, id, individual);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
