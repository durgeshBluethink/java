import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseServices {

    DatabaseConnection dbConnection = new DatabaseConnection();

    public void insertEmployee(Employee employee){
        try(Connection connection = dbConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.insertEmployee());){
            preparedStatement.setInt(1,employee.getEmpNo());
            preparedStatement.setString(2,employee.getEName());
            preparedStatement.setLong(3,employee.getSalary());

            int rows=preparedStatement.executeUpdate();

            if(rows>0){
                System.out.println("Record Inserted Successfully...");
            }else{
                System.out.println("Failed, Retry...");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
