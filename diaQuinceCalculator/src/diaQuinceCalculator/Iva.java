package diaQuinceCalculator;

public class Iva {
	
	private double precio;
	
	public void setPrecio(double precio) {
		this.precio = precio;
		
	}
	
	public double precioIva() {
		double iva = precio * 1.16;
		double descuento;
		
		if (iva > 50) {
			
			descuento = iva - (iva * 0.10);
		} else {
			descuento = iva - (iva * 0.05);
		}
		return descuento;
		
	}

}
