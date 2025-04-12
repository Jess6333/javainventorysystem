package databaseconnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class HospitalDAO {
    public static List<Hospital> getAllHospitals() {
        List<Hospital> hospitals = new ArrayList<>();
        String query = "SELECT * FROM hospital";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Hospital hospital = new Hospital(
                    rs.getString("hospitalCode"),
                    rs.getString("hospitalName"),
                    rs.getString("email"),
                    rs.getString("address"),
                    rs.getString("contactPerson"),
                    rs.getInt("phoneNum")
                );
                hospitals.add(hospital);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching hospitals: " + e.getMessage());
        }

        return hospitals;
    }
}
