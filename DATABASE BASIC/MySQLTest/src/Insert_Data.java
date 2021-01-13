import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Data {
    private Connection connection;

    public Insert_Data() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void InsertData(String name, String city, Double com) {
        String sql = null;
        PreparedStatement preparedStatement = null;

        try {
            sql = "INSERT INTO `salespeople`(`s_name`, `s_city`, `comm`) VALUES(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, city);
            preparedStatement.setDouble(3, com);
            preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Insert_Data obj = new Insert_Data();
        obj.InsertData("ritu", "sherpur", 3.77);
    }
}
