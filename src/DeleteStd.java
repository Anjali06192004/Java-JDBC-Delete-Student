import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStd {

    static Connection con;
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String mysqlURL = "jdbc:mysql://localhost:3306/advjava";
            String username = "root";
            String password = "root";

            con = DriverManager.getConnection(mysqlURL, username, password);

            PreparedStatement stmt =
                    con.prepareStatement( "DELETE FROM students WHERE Id = 3");
            stmt.executeUpdate();

            System.out.println("Record Deleted...");
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
