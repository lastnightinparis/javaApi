import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.ConnectionFactory;

/**
 * @author Kir
 * Created on 03.01.2021
 */

public class JmsProvider {
    public static ConnectionFactory getConnectionFactory () {
         /*The VM transport allows clients to connect to each other inside
                 the VM without the overhead of the network communication. */

        return new ActiveMQConnectionFactory("vm://localhost");
    }
}
