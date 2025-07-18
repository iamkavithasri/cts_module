import java.sql.*;

public class JdbcInsertUpdate {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
        ps.setInt(1, 3);
        ps.setString(2, "Charlie");
        ps.executeUpdate();

        ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, "Charles");
        ps.setInt(2, 3);
        ps.executeUpdate();
        conn.close();
    }
}
