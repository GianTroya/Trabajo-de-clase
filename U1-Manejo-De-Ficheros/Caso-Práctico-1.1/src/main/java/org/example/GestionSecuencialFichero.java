import java.io.File;
import java.io.IOException;

public class GestionSecuencialFichero {

    public static void main(String[] args) {
        final int MAX_FICHEROS_POR_CARPETA = 5;
        String baseNombreCarpeta = "unidad1_ejemplos_";
        String baseNombreFichero = "mi_fichero_prueba";

        int indiceCarpeta = 1;
        File directorioEjemplo;

        // Encontrar o crear la carpeta que no esté llena
        while (true) {
            directorioEjemplo = new File(baseNombreCarpeta + indiceCarpeta);
            if (!directorioEjemplo.exists()) {
                directorioEjemplo.mkdirs();
                break;
            } else {
                // Verificar si hay menos de 5 archivos
                String[] archivos = directorioEjemplo.list((dir, name) -> name.endsWith(".txt"));
                if (archivos != null && archivos.length < MAX_FICHEROS_POR_CARPETA) {
                    break;
                }
                indiceCarpeta++;
            }
        }

        // Contar cuántos archivos hay ya en la carpeta actual
        String[] archivosActuales = directorioEjemplo.list((dir, name) -> name.endsWith(".txt"));
        int numeroFichero = (archivosActuales != null) ? archivosActuales.length + 1 : 1;

        // Crear nombre del fichero enumerado
        String nombreFichero = baseNombreFichero + "(" + numeroFichero + ").txt";
        File fichero = new File(directorioEjemplo, nombreFichero);

        System.out.println("Creando en: " + fichero.getAbsolutePath());

        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("El fichero ya existe: " + fichero.getName());
            }

            // Mostrar propiedades
            if (fichero.exists()) {
                System.out.println("Propiedades de '" + fichero.getName() + "':");
                System.out.println(" - Es un fichero: " + fichero.isFile());
                System.out.println(" - Se puede leer: " + fichero.canRead());
                System.out.println(" - Se puede escribir: " + fichero.canWrite());
                System.out.println(" - Tamaño (bytes): " + fichero.length());
            }

        } catch (IOException e) {
            System.err.println("Error de E/S al operar con el fichero: " + e.getMessage());
            System.err.println("Verifica los permisos en: " + directorioEjemplo.getAbsolutePath());
        }
    }
}
