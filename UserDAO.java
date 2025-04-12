package databaseconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UserDAO {
    // CREATE (Add new user)
    public static void addUser(String userID, String name, String email, String phoneNum, String userType, String password) {
        String query = "INSERT INTO users (userID, name, email, phoneNum, userType, password) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, userID);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setString(4, phoneNum);
            pstmt.setString(5, userType);
            pstmt.setString(6, password);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to add user: " + e.getMessage());
        }
    }

    // READ (Get user by ID)
    public static User getUserByID(String userID) {
        String query = "SELECT * FROM users WHERE userID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, userID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getString("userID"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phoneNum"),
                        rs.getString("userType"),
                        rs.getString("password")
                );
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to retrieve user: " + e.getMessage());
        }
    }

    // UPDATE (Modify existing user)
    public static void updateUser(String userID, String name, String email, String phoneNum, String userType) {
        String query = "UPDATE users SET name = ?, email = ?, phoneNum = ?, userType = ? WHERE userID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, phoneNum);
            pstmt.setString(4, userType);
            pstmt.setString(5, userID);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to update user: " + e.getMessage());
        }
    }

    // DELETE
    public static void deleteUser(String userID) {
        String query = "DELETE FROM users WHERE userID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, userID);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to delete user: " + e.getMessage());
        }
    }

    // (Optional) Get all users
    public static List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        String query = "SELECT * FROM users ORDER BY userID ASC";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                User user = new User(
                        rs.getString("userID"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phoneNum"),
                        rs.getString("userType"),
                        rs.getString("password")
                );
                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}

