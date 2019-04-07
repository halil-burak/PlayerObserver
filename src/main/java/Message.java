import java.util.Observable;

public class Message extends Observable {

    private int counter;
    private String message;
    private Player sender;
    private Player receiver;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Player getSender() {
        return sender;
    }

    public void setSender(Player sender) {
        this.sender = sender;
    }

    public Player getReceiver() {
        return receiver;
    }

    public void setReceiver(Player receiver) {
        this.receiver = receiver;
    }

    public void init(Player sender, Player receiver) {
        this.sender = sender;
        this.receiver = receiver;

        while (this.counter != 10) {
            send(sender);
            System.out.println("Sent Message: " + this.getMessage());
            receive(receiver);
            System.out.println("Responding Message: " + this.getMessage());
        }
    }

    public void send(Player player) {
        this.setReceiver(player);
    }

    public void receive(Player player) {
        this.setSender(player);
        this.counter++;
        this.setMessage(this.getMessage() + String.valueOf(counter));
    }
}
