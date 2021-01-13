import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Data {

    private Connection connection;

    private Delete_Data() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Delete() {
        Statement st = null;
        try {
            st = connection.createStatement();
            st.executeUpdate("DELETE FROM salespeople WHERE s_name='raju'");
            System.out.println("Deleted Successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Delete_Data obj = new Delete_Data();
        obj.Delete();
    }
}

