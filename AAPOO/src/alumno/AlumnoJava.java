package alumno;

public class AlumnoJava extends Alumno{
	// Atributo de AlumnoJava
	private String apodo;
	// Constructor
	public AlumnoJava(String nombre, int edad, String apodo) {
		super(nombre, edad);
		this.apodo=apodo;
	}
	// Getters y Setters
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	// Generar toString Source,toIneriht,toString
	@Override
	public String toString() {
		return "AlumnoJava [apodo=" + apodo + ", toString()=" + super.toString() + "]";
	}
	
	
}
