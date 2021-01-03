import javax.jms.JMSException;

/**
 * @author Kir
 * Created on 03.01.2021
 */

public class Main {
    public static void main(String[] args) throws JMSException, InterruptedException {
        final Producer sender = new Producer();

        final Consumer receiver = new Consumer();
        receiver.startListener();

        for (int i = 1; i <= 5; i++) {
            String m = "Hello world! " + i;
            sender.sendMessage(m);
            Thread.sleep(300);
        }

        sender.destroy();
        receiver.destroy();
    }
}
