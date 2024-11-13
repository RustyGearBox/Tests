import java.util.List;

public class Command {

    private static int counterID = 1;
    private int id;
    private Client client;
    private List<Product> products;
    private DeliveryGuy deliveryGuy;
    private boolean delivered;

    public Command(Client client, List<Product> products, DeliveryGuy deliveryGuy) {
        if (client == null || products == null || products.isEmpty()) {
            throw new IllegalArgumentException("There has to be at least one client and product");
        }
        this.id = counterID++;
        this.client = client;
        this.products = products;
        this.deliveryGuy = deliveryGuy;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public DeliveryGuy getDeliveryGuy() {
        return deliveryGuy;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void markAsDelivered() {
        this.delivered = true;
        this.deliveryGuy.setAvailability(true);
    }

    public double totalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        switch (deliveryGuy.getVehicle()) {
            case BICICLE:
                total *= 1.01;
                break;
            case MOTORBIKE:
                total *= 1.02;
                break;
            default:
                break;
        }
        return total;
    }

}