public class Product {
    private String type;
    private String info;
    private double price;
    private double bonusPrice;
    private Customer customer;

    public Product(String type, String info, double price) {
        this.type = type;
        this.info = info;
        this.price = price;
        this.bonusPrice = bonusPrice;
        this.customer = customer;
    }

    public String getType() {
        return type;
    }


    public String getInfo() {
        return info;
    }


    public double getPrice() {
        return price;
    }


    public double getBonusPrice() {
        return bonusPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", info='" + info + '\'';
    }
}
