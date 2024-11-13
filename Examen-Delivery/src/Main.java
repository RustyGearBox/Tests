import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DeliveryGuy> deliveryGuyList = new ArrayList<>();
        deliveryGuyList.add(new DeliveryGuy("Yunus", Vehicle.MOTORBIKE));
        deliveryGuyList.add(new DeliveryGuy("Mario", Vehicle.BICICLE));
        deliveryGuyList.add(new DeliveryGuy("Carles", Vehicle.MOTORBIKE));

        DeliverySystem system = new DeliverySystem(deliveryGuyList);

        Client client1 = new Client("Ana", "Av. Diagonal");

        List<Product> products1 = new ArrayList<>();
        products1.add(new Burrito());
        products1.add(new Pizza());

        try {
            Command command1 = system.createCommand(client1, products1);
            System.out.println("Command created with id: " + command1.getId() + ", Total: " + command1.totalPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        system.listCommandNotYetDelivered();

        system.markCommandDelivered(1);

        system.listCommandDelivered();


    }
}