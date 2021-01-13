import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectonWithConstructor {

    public static final String DB_NAME = "test_connection.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:G:\\Java Programming Code\\DATABASE BASIC\\TestSQLiteDB\\" + DB_NAME;
    public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try {

            //database connecton
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            //Drop table
            statement.execute("DROP TABLE IF EXISTS " + TABLE_NAME);
/*
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" + " (name TEXT,phone INTEGER,email TEXT)");
 */

            //create table with columns element and data type
/*
 statement.execute("CREATE TABLE IF NOT EXISTS"+TABLE_NAME+"(" + COLUMN_NAME + "TEXT, "
                    + COLUMN_PHONE + "INTEGER, "
                    + COLUMN_EMAIL + "TEXT"
                    + ")"
            );
            //inserting the value in the table columns
            statement.execute("INSERT INTO" + TABLE_NAME +
                    "("
                    + COLUMN_NAME + ", "
                    + COLUMN_PHONE + ", "
                    + COLUMN_EMAIL +
                    ")"
                    + "VALUES ('Raju',123456,'raju@gmail.com')");
            statement.execute("INSERT INTO" + TABLE_NAME +
                    "("
                    + COLUMN_NAME + ", "
                    + COLUMN_PHONE + ", "
                    + COLUMN_EMAIL +
                    ")"
                    + "VALUES ('Ritu',456656,'ritu@gmail.com')");
            statement.execute("INSERT INTO" + TABLE_NAME +
                    "("
                    + COLUMN_NAME + ", "
                    + COLUMN_PHONE + ", "
                    + COLUMN_EMAIL +
                    ")"
                    + "VALUES ('Toha',2222333,'toha@gmail.com')");

            //update the table elements
            statement.execute("UPDATE" + TABLE_NAME + "SET" +
                    COLUMN_PHONE + "111111" + "WHERE" + COLUMN_NAME + "='Raju'");

            //deleting one colum
            statement.execute("DELETE FROM" + TABLE_NAME +
                    "WHERE" + COLUMN_NAME + "='Ritu'");

            //getting the result from table
            ResultSet resultSet = statement.executeQuery("SELECT * FROM" + TABLE_NAME);

            //printing the values
            while (resultSet.next()) {
                System.out.println(resultSet.getString(COLUMN_NAME) + " " +
                        resultSet.getInt(COLUMN_PHONE) + " " +
                        resultSet.getString(COLUMN_EMAIL));
            }

            resultSet.close();
            statement.close();
            conn.close();
*/
        } catch (Exception e) {
            System.out.println("Something went error" + e.getMessage());
            e.printStackTrace();
        }
    }
}

