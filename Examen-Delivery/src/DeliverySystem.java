import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeliverySystem {

    private List<DeliveryGuy> deliveryGuys;
    private List<Command> commands;

    public DeliverySystem(List<DeliveryGuy> deliveryGuys, List<Command> commands) {
        this.deliveryGuys = deliveryGuys;
        this.commands = new ArrayList<>();
    }

    public Command createCommand(Client client, List<Product> products) throws Exception {
        DeliveryGuy deliveryGuy = obtainAvaliableDeliver();
        if (deliveryGuy == null) {
            throw new Exception("There are not delivers available");
        }
        Command newCommand = new Command(client, products, deliveryGuy);
        deliveryGuy.setAvailability(false);
        commands.add(newCommand);
        return newCommand;
    }

    public DeliveryGuy obtainAvaliableDeliver() {
        List<DeliveryGuy> avaliables = new ArrayList<>();
        for (DeliveryGuy deliveryGuys : deliveryGuys) {
            if (deliveryGuys.isAvailability()){
                avaliables.add(deliveryGuys);
            }
        }
        if (avaliables.isEmpty()) return null;
        return avaliables.get(new Random().nextInt(avaliables.size()));
    }

    public void markCommandDelivered(int id) {
        for (Command command : commands) {
            if (command.getId() == id && !command.isDelivered()) {
                command.markAsDelivered();
                System.out.println("The command " + id + " has been marked as delivered");
                return;
            }

        }
        System.out.println("The command couldn't be found");
    }

    public void listCommandNotYetDelivered() {
        System.out.println("Commands not delivered yet:");
        for (Command command : commands) {
            if (!command.isDelivered()) {
                System.out.println("ID: " + command.getId() + ", Client: " + command.getClient() + ", Total: " + command.totalPrice());
            }
        }
    }

    public void listCommandDelivered() {
        System.out.println("Command delivered:");
        for (Command command : commands) {
            if (command.isDelivered()) {
                System.out.println("ID: " + command.getId() + ", Client: " + command.getClient() + ", Total: " + command.totalPrice());
            }
        }
    }

}