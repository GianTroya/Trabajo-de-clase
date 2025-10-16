package figura;

public class Cuadrado extends Figura{
	private int lado;

	public Cuadrado(int x, int y, int lado) {
		super(x, y);
		this.lado = lado;
	}
	public double area() {
		return Math.pow(lado, 2);
	}
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	

}
