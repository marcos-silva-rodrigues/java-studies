import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SetubDatabase {

    public static void main(String[] args) {

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies?serverTimezone=UTC", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (con == null) {
            System.out.println("Connect failed");
            return;
        }
        try {
            Statement statement = con.createStatement();

            String sql =  "CREATE TABLE IF NOT EXISTS movie (id INTEGER NOT NULL AUTO_INCREMENT, name VARCHAR(255) NOT NULL, PRIMARY KEY (id));";
//            String sql = "DROP TABLE movie;";
            statement.executeUpdate(sql);

            System.out.println("Created table movies");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
