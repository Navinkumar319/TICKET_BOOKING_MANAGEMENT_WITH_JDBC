import java.sql.*;

public class ConnectionUtil{

    private static final String URL="jdbc:mysql://localhost:3306/moviedb";
    private static final String USER="root";
    private static final String PASS="mysqlpassword123@";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
}