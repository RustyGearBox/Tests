public abstract class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    public abstract String getGift();

}

class Burger extends Product {

    public Burger() {
        super("Burger", 10);
    }

    @Override
    public String getGift() {
        return "cap";
    }

}

class Burrito extends Product {

    public Burrito() {
        super("Burger", 10);
    }

    @Override
    public String getGift() {
        return "pin";
    }

}

class Pizza extends Product {

    public Pizza() {
        super("Burger", 12);
    }

    @Override
    public String getGift() {
        return null;
    }

}

class Kebap extends Product {

    public Kebap() {
        super("Burger", 12);
    }

    @Override
    public String getGift() {
        return null;
    }

}