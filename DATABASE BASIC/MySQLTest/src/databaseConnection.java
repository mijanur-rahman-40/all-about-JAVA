import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
public class databaseConnection {
    public static void main(String[] args) {

        //Get connection
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "");
            System.out.println("Connection Successful");

            //Create Statement
            Statement st = connection.createStatement();

            //Execute SQLQuery
            //Result Set
            ResultSet rs = st.executeQuery("SELECT * FROM `salespeople`");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("s_name") + " " + rs.getString("s_city") + " " + rs.getFloat("comm"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
//Second Option
public class databaseConnection {
    private Connection connection;

    public databaseConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> getData() {
        List<String> list = new ArrayList<String>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT * FROM `salespeople`");
            while (rs.next()) {
                list.add(rs.getInt("id") + " " + rs.getString("s_name") + " " + rs.getString("s_city") + " " + rs.getFloat("comm"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        databaseConnection obj = new databaseConnection();
        System.out.println(obj.getData());
    }
}