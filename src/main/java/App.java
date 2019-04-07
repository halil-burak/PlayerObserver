public class App {

    public static void main(String args[]) {
        Message message = new Message();
        Player initiator = new Player(true);
        Player second = new Player(false);

        message.setMessage("Hello");
        message.setCounter(0);
        message.addObserver(initiator);
        message.addObserver(second);

        message.init(initiator, second);
    }
}
