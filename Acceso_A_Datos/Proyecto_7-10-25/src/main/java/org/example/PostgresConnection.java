import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
    public static void main(String[] args) {
        //Creamos los atributos necesarios para conectarnos a la base
        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "postgres";

        //Con un try-with-resources nos aseguramos de que cierre los recursos que ya no se usan después del try
        try (Connection conn = DriverManager.getConnection(url, user, password)) { //Con esta función nos conectamos a la base de datos
            if (conn != null) {
                System.out.println("✅ Conexión exitosa a PostgreSQL!");
            } else {
                System.out.println("❌ Falló la conexión.");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}
