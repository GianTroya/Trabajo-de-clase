package figura;

import java.util.Iterator;

public class AdminFigs {
	public static void dimePosicion(Figura f) {
		System.out.println("Soy una figura:");
		System.out.println("Posición x: " + f.x);
		System.out.println("Posición y: " + f.y);
	}
	public static void dimeArea(Figura f) {
		System.out.println("area = " + f.area());
	}
	public static void moverUnPoco(Figura fig) {
		fig.mover(fig.x+1, fig.y+1);
	}
	public static void main(String[] args) {
		Circulo miCirculo = new Circulo(1,3,5);
		Circulo miCirculo2 = new Circulo(145,3,5);
		if(miCirculo.equals(miCirculo2)) System.out.println("Sonny Wallace");
		else System.out.println("Son otras cosas");
		Triangulo miTriangulo = new Triangulo(3, 4, 5, 2);
		Cuadrado miCuadrado = new Cuadrado(2, 7, 6);
		System.out.println("Círculo");
		dimePosicion(miCirculo);
		System.out.println("Cuadrado");
		dimePosicion(miCuadrado);
		System.out.println("Circulo");
		dimeArea(miCirculo);
		System.out.println("Triángulo");
		dimeArea(miTriangulo);
		
		Figura[] arrFig = {miTriangulo, miCuadrado, miCirculo,new Circulo(4,5,7),new Cuadrado(4,2,5)};
		for (int i = 0; i < arrFig.length; i++) {
			dimePosicion(arrFig[i]);
			moverUnPoco(arrFig[i]);
			dimePosicion(arrFig[1]);
		}
		
	}

}
