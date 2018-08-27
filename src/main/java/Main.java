import database.DBCPDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        //Note Java 8's 'try-catch' automatically closes the connection and statement via an internal 'finally' block
        try (Connection conn = DBCPDatabase.getDataSource().getConnection();
             PreparedStatement statement = conn.prepareStatement("UPDATE TestTable SET Username = 'new_username'")) {

            statement.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
