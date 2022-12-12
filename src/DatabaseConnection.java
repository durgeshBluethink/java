import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
   // public static final  String DRIVER_PATH = "com.mysql.jdbc.Driver";
    public static final  String DATABASE_URL = "jdbc:mysql://localhost:3306/CRUD";
    public static final  String USERNAME = "root";
    public static final  String PASSWORD = "root";

    public DatabaseConnection() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

//    public Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
//    }
}
