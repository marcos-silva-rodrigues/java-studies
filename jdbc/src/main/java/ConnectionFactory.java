import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public final String URL = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";
    private final String USER = "root";
    private final String PASSWORD = "root";

    private Connection createConnection() {
        Connection connection= null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public Connection getConnection() {
        return createConnection();
    }

}
