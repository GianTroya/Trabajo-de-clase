package figura;

public class Triangulo extends Figura{
	public int altura;
	public int base;
	
	public Triangulo(int x, int y, int altura, int base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}
	public double area() {
		return this.altura*this.base/2;
	}

}
