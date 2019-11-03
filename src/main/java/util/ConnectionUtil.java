package util;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
/**
 * @author Jony-Liu
 * @date 2019/11/3 17:48
 */
public class ConnectionUtil {
    public static Connection getConnection() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setVirtualHost("testhost");
        factory.setUsername("admin");
        factory.setPassword("admin");
        Connection connection = factory.newConnection();
        return connection;
    }

}
