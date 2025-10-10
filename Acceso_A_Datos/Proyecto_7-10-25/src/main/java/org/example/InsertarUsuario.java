import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarUsuario {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "postgres";

        String nuevoUsuario = "juan123";
        String nuevaContraseña = "claveSegura";

        String sql = "INSERT INTO usuarios (usuario, contraseña) VALUES ('" + nuevoUsuario + "', '" + nuevaContraseña + "')";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("✅ Usuario insertado correctamente");
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar el usuario" + e.getMessage());
        }
    }
}