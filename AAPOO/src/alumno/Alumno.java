package alumno;

public class Alumno {
	// Atributos
	private String nombre;
	private int edad;
	private boolean estudia;
	private int notaMedia;
	// Constructor con nombre y edad
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	// Constructor vacío
	public Alumno() {}
	// Constructor con nombre, edad, notaMedia
	public Alumno(String nombre, int edad, int notaMedia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEstudia() {
		return estudia;
	}

	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}

	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		if(notaMedia>=5) {
			this.estudia=true;
		}else {
			this.estudia=false;
		}
		this.notaMedia = notaMedia;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", estudia=" + estudia + ", notaMedia=" + notaMedia + "]";
	}
	
	
	

}
