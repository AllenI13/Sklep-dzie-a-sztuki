public class Customer {
    private String name;
    private String surname;
    private int id;
    private boolean individual;

    public Customer(String name, String surname, int id, boolean individual) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.individual = individual;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public boolean isIndividual() {
        return individual;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
