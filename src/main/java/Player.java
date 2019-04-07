import java.util.Observable;
import java.util.Observer;

public class Player implements Observer {
    private Message message;
    private boolean initiator;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public boolean isInitiator() {
        return initiator;
    }

    public void setInitiator(boolean initiator) {
        this.initiator = initiator;
    }

    public Player(boolean initiator) {
        this.initiator = initiator;
    }

    public void update(Observable o, Object arg) {
        this.message = (Message) arg;
    }
}
