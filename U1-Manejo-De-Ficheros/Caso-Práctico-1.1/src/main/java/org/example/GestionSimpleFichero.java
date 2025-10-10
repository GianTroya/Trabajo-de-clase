import java.io.File;
import java.io.IOException;

public class GestionSimpleFichero {

    public static void main(String[] args) {
        // Usamos una subcarpeta para mantener organizados los ejemplos
        File directorioEjemplo = new File("unidad1_ejemplos");
        if (!directorioEjemplo.exists()) {
            directorioEjemplo.mkdirs(); // Crear directorio si no existe
        }

        // Referencia al fichero dentro de la subcarpeta
        File fichero = new File(directorioEjemplo, "mi_fichero_prueba.txt");
        System.out.println("Operando con: " + fichero.getAbsolutePath());

        try {
            // Crear fichero si no existe
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("El fichero ya existe: " + fichero.getName());
            }

            // Mostrar propiedades
            if (fichero.exists()) {
                System.out.println("Propiedades de '" + fichero.getName() + "':");
                System.out.println(" - Es un fichero: " + fichero.isFile());
                System.out.println(" - Es un directorio: " + fichero.isDirectory());
                System.out.println(" - Se puede leer: " + fichero.canRead());
                System.out.println(" - Se puede escribir: " + fichero.canWrite());
                System.out.println(" - Tamaño (bytes): " + fichero.length());
            }

        } catch (IOException e) {
            System.err.println("Error de E/S al operar con el fichero: " + e.getMessage());
            System.err.println("Verifica los permisos en: " + directorioEjemplo.getAbsolutePath());
        }

        // Opcional: limpieza (descomentar si quieres eliminar el fichero y directorio)
        /*
        if (fichero.exists()) {
            fichero.delete();
        }
        if (directorioEjemplo.exists()) {
            directorioEjemplo.delete();
        }
        */
    }
}
