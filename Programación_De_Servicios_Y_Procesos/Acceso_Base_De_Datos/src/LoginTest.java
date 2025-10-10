import java.sql.*;
public class LoginTest {
    public static void main(String[] args) {
        String userInput = "' OR '1'='1'";
        String passwordInput = "' OR '1'='1";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String query = "SELECT * FROM cliente WHERE usuario = '" + userInput + " AND contraseña = '" + passwordInput + "'";
            System.out.println("Consulta: " + query);

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                    System.out.println("Usuario autenticado: " + rs.getString("usuario") +  ", Contraseña: " + rs.getString("contraseña"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
