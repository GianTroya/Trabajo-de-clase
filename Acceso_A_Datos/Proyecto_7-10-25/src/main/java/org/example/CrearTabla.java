import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "postgres";

        //Aquí creamos un nuevo atributo que es el texto de la sentencia para la creación de la tabla
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "usuario VARCHAR(50) PRIMARY KEY, " +
                "contraseña VARCHAR(50) NOT NULL" +
                ")";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) { // crea un objeto para ejecutar SQL

            stmt.executeUpdate(sql); // ejecuca la sentencia para crear la tabla
            System.out.println("✅ Tabla 'usuarios' creada correctamente.");

        } catch (SQLException e) {
            System.out.println("❌ Error al crear la tabla: " + e.getMessage());
        }
    }
}