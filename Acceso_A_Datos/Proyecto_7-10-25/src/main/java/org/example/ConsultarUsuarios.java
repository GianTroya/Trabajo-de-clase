import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarUsuarios {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "postgres";

        String sql = "SELECT * FROM usuarios";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) { // Crea un objeto que contiene los resultados de una consulta. Como los cursores en bbdd

            while (rs.next()) { // avanza la siguiente fila como el FETCH NEXT hasta que no existan filas
                String nombreUsuario = rs.getString("usuario"); // obtiene el valor de la primera columna como un SELECT
                String contraseña = rs.getString("contraseña"); // obtiene el valor de la siguente columna
                System.out.println("👤 Usuario: " + nombreUsuario + " | 🔐 Contraseña: " + contraseña);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al consultar usuarios: " + e.getMessage());
        }
    }
}
