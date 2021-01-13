import java.sql.*;

public class PreparedStatement_and_Statement {
    private Connection connection;

    public PreparedStatement_and_Statement() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void UsingStatement() {

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM `salespeople` WHERE s_name='Green' AND s_city='London'");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("s_name") + " " + resultSet.getString("s_city") + " " + resultSet.getFloat("comm"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void UsingPreparedStatement(String name, String city) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            String sql = "SELECT * FROM `salespeople` WHERE s_name=? AND s_city=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, city);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("s_name") + " " + resultSet.getString("s_city") + " " + resultSet.getFloat("comm"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PreparedStatement_and_Statement obj = new PreparedStatement_and_Statement();
        obj.UsingStatement();
        System.out.println("");
        obj.UsingPreparedStatement("Green","London");
    }
}
