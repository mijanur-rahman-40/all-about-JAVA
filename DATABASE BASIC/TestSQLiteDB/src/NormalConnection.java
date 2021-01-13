import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NormalConnection {

    public static void main(String[] args) {

        /* Another method for resource handling
         try (Connection conn = DriverManager.getConnection("jdbc:sqlite:G:\\Java Programming Code\\DATABASE BASIC\\TestSQLiteDB\\testjava.db"); Statement statement = conn.createStatement()) {
         statement.execute("CREATE TABLE contacts (name TEXT,phone INTEGER,email TEXT)");
        */
        // For older version Class.forName("org.sql.jdbc");

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:G:\\Java Programming Code\\DATABASE BASIC\\TestSQLiteDB\\testjava.db");

            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS contacts" + " (name TEXT,phone INTEGER,email TEXT)");

//            statement.execute("INSERT INTO contacts(name,phone,email)" + "VALUES('Raju',354646,'gr5ttg@gmail.com')");
//
//            statement.execute("INSERT INTO contacts(name,phone,email)" + "VALUES('Ritu',354646,'gr5ttg@gmail.com')");
//
//            statement.execute("INSERT INTO contacts(name,phone,email)" + "VALUES('Thoa',354646,'gr5ttg@gmail.com')");

            // statement.execute("UPDATE contacts SET phone=33333333 WHERE name='Raju'");
            //statement.execute("DELETE FROM contacts WHERE name='Raju'");
            /*
            statement.execute("SELECT * FROM contacts");
            ResultSet resultSet = statement.getResultSet();
            */


            //Another method for gettng the rwsult
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contacts");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " + resultSet.getInt("phone") + " " + resultSet.getString("email"));
            }


            resultSet.close();
            statement.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Something went error" + e.getMessage());
        }
    }
}