import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/test1";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Conexión exitosa a la base de datos");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }
    }
}*/
public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/test1";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
}

