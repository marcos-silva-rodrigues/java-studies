import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {

    private Connection connection;
    private PreparedStatement statement;

    public MovieDAO() {
        connection = new ConnectionFactory().getConnection();
    }

    public Movie findById(Integer id) throws SQLException{
        String query = "SELECT * FROM movie WHERE id = ?";

        statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        ResultSet res = statement.executeQuery();

        Movie movie = null;

        while(res.next()) {
            movie = new Movie(
                    res.getInt("id"),
                    res.getString("name")
            );
        }

        return movie;
    }

    public List<Movie> findAll() throws SQLException {
        String query = "SELECT * FROM movie;";
        List<Movie> movies = new ArrayList<Movie>();

        statement = connection.prepareStatement(query);

        ResultSet res = statement.executeQuery();

        while(res.next()) {
            Movie movieFromDb = new Movie(
                    res.getInt("id"),
                    res.getString("name")
            );

            movies.add(movieFromDb);
        }

        return movies;
    }

    public void insert(Movie movie) throws SQLException{
        String query = "INSERT INTO movie (name) VALUES(?);";

        statement = connection.prepareStatement(query);
        statement.setString(1, movie.getName());
        statement.execute();
    }

    public void update(Movie movieOld, Movie movieNew) throws  SQLException {
        String query = "UPDATE movie SET name = ? WHERE id = ?;";
        statement = connection.prepareStatement(query);
        statement.setString(1, movieNew.getName());
        statement.setInt(2, movieOld.getId());
        statement.execute();
    }

    public void remove(Movie movie) throws SQLException {
        String query = "DELETE FROM movie WHERE id = ?;";
        statement = connection.prepareStatement(query);
        statement.setInt(1, movie.getId());
        statement.execute();
    }
}
