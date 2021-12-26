import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

    public static MovieDAO movieDAO = new MovieDAO();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        System.out.println("-------------- MENU --------------");
        System.out.println("1 - List movies");
        System.out.println("2 - Create new movie");
        System.out.println("3 - Update a movie");
        System.out.println("4 - Delete a movie");
        System.out.println("5 - Close Application");
        System.out.println("-------------- MENU --------------");

        try{
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    selectAll();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void selectAll() throws SQLException {
        List<Movie> data = movieDAO.findAll();

        for(Movie movie: data) {
            System.out.println("Id: " + movie.getId());
            System.out.println("Name: " + movie.getName());
        }
    }

    public static void insert() throws SQLException {
        System.out.println("Enter name: ");
        String name = scanner.next();
        movieDAO.insert(new Movie(name));
    }

    public static void update() throws SQLException {
        System.out.println("Enter Movie id:");
        Integer id = scanner.nextInt();

        Movie movieExists = movieDAO.findById(id);

        if(movieExists != null) {
            System.out.println("Enter new movie name:");
            String newName = scanner.next();
            Movie MovieUpdated = new Movie(newName);
            movieDAO.update(movieExists, MovieUpdated);
        } else {
            System.out.println("Does not exists");
        }
    }

    public static void delete() throws SQLException {
        System.out.println("Enter Movie id:");
        Integer movieId = scanner.nextInt();

        Movie movieDelete = movieDAO.findById(movieId);

        if (movieDelete != null) {
            movieDAO.remove(movieDelete);
        } else {
            System.out.println("Does not exists");
        }
    }

}
