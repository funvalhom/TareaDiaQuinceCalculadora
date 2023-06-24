package diaQuinceCalculator;

import java.util.Scanner;

public class Precios {

	public static void main(String[] args) {
		
		Iva calcularIva = new Iva();
		
		Scanner dato = new Scanner(System.in);
		System.out.print("Por favor ingrese el precio: ");
		calcularIva.setPrecio(dato.nextDouble());
		
		double precioConIva = calcularIva.precioIva();
		System.out.println("El precio con IVA es: " + precioConIva);
		

	}

}
