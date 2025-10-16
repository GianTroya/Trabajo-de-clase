package alumno;

import java.util.Scanner;

public class GestionaAlumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del alumno");
		String texto = sc.nextLine();
		System.out.println("Edad");
		int edad = sc.nextInt();
		Alumno al = new Alumno();
		al.setNombre("Grisel");
		al.setEdad(25);
		Alumno al4 = new Alumno(texto, edad);
		Alumno al5 = new Alumno("Jaime", 45, 6);
		al.setNotaMedia(4);
		al4.setNotaMedia(6);
		System.out.println(al);
		System.out.println("*******");
		System.out.println(al4);
		System.out.println("*******");
		System.out.println(al5);
		System.out.println("*******");
		
		AlumnoJava al7 = new AlumnoJava("Hermenegildo",18,"gil");
		System.out.println(al7);
		
	}

}
