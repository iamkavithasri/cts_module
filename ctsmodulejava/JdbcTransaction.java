import java.sql.*;

public class JdbcTransaction {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db");
        conn.setAutoCommit(false);
        Statement stmt = conn.createStatement();
        try {
            stmt.executeUpdate("UPDATE accounts SET balance=balance-100 WHERE id=1");
            stmt.executeUpdate("UPDATE accounts SET balance=balance+100 WHERE id=2");
            conn.commit();
            System.out.println("Transfer successful.");
        } catch(Exception e) {
            conn.rollback();
            System.out.println("Transfer failed. Rolled back.");
        } finally {
            conn.close();
        }
    }
}
