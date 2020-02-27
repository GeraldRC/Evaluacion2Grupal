package modelo;

public class Kromi extends Carro{
	
	private int a�oDeFabricacion;
	private String marca;
	
	public Kromi() {
		super();
	}

	public Kromi(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna, int a�oDeFabricacion,
			String marca) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubiFila, ubiColumna);
		this.a�oDeFabricacion = a�oDeFabricacion;
		this.marca = marca;
	}

	public int getA�oDeFabricacion() {
		return a�oDeFabricacion;
	}

	public void setA�oDeFabricacion(int a�oDeFabricacion) {
		this.a�oDeFabricacion = a�oDeFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [a�oDeFabricacion=" + a�oDeFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	

}
