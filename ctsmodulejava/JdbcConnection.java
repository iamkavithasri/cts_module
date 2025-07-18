import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next())
            System.out.println(rs.getInt("id")+": "+rs.getString("name"));
        conn.close();
    }
}
