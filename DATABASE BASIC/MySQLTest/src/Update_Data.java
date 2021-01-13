import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Update_Data {
    private Connection connection;

    /*
        private Update_Data() {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "");
                System.out.println("Connection Successful");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void Update(int id) {
            Statement st = null;
            try {
                st = connection.createStatement();
                // st.executeUpdate("UPDATE salespeople SET s_name='raju',s_city='Mymensingh',comm='0.2' WHERE id="+id);
                st.executeUpdate("UPDATE salespeople SET s_name='green' WHERE id=" + id);
                System.out.println("Updated successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    */
    private Update_Data() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Update(int id, String name, String city, Double com) {
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement("UPDATE salespeople SET s_name=?,s_city=?,comm=? WHERE id=?");
            pst.setString(1, name);
            pst.setString(2, city);
            pst.setDouble(3, com);
            pst.setInt(4, id);
            pst.executeUpdate();
            System.out.println("Updated Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Update_Data obj = new Update_Data();
        obj.Update(3,"Banana","London_SEX",2.13);
    }
}