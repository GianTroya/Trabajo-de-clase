package figura;

import java.util.Objects;

public class Circulo extends Figura{
	public int radio;

	public Circulo(int x, int y, int radio) {
		super(x, y);
		this.radio = radio;
	}
	public double area() {
		return Math.pow(radio, 2)*Math.PI;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return radio == other.radio;
	}
	
	

}
