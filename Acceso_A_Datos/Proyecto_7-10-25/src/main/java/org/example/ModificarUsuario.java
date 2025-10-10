import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModificarUsuario {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "postgres";

        String usuarioObjetivo = "juan123";
        String nuevaContraseña = "nuevaClaveSegura";

        String sql = "UPDATE usuarios SET contraseña = ? WHERE usuario = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nuevaContraseña);
            pstmt.setString(2, usuarioObjetivo);

            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Contraseña actualizada correctamente.");
            } else {
                System.out.println("⚠️ No se encontró el usuario.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar: " + e.getMessage());
        }
    }
}
