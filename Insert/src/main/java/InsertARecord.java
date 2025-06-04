import Util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertARecord {
    public boolean problem1() {
        try {
            Connection connection = ConnectionUtil.getConnection();
            String sql = "INSERT INTO song (Title, Artist) VALUES (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "Bohemian Rhapsody");
            ps.setString(2, "Queen");
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
