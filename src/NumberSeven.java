import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NumberSeven {

    public static void main(String[] args) {

        Connection connection = null;
        try {


            String driverName = "com.mysql.jdbc.Driver";

            Class.forName(driverName);


            String serverName = "localhost";

            String schema = "mydb";

            String url = "jdbc:mysql://" + serverName + "/" + schema;

            String username = "root";

            String password = "Qwdfbn@@11";

            connection = DriverManager.getConnection(url, username, password);


            System.out.println("Successfully Connected to the database!");


        } catch (ClassNotFoundException e) {

            System.out.println("Could not find the database driver " + e.getMessage());
        } catch (SQLException e) {

            System.out.println("Could not connect to the database " + e.getMessage());
        }

        try {

            Statement statement = connection.createStatement();


            statement.executeUpdate("CREATE TABLE Teacher(FirstName varchar(20)," +
                    "LastName varchar(30)," +
                    "Gender varchar(10)," +
                    "Subject varchar(20))");


            System.out.println("Successfully created Teacher table");

            statement.executeUpdate("CREATE TABLE Pupil(FirstName varchar(20)," +
                    "LastName varchar(30)," +
                    "Gender varchar(10)," +
                    "Class int)");


            System.out.println("Successfully created Pupil table");

        } catch (SQLException e) {

            System.out.println("Could not create the database table " + e.getMessage());
        }

    }
}