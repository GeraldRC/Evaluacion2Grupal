package modelo;

public class Kromi extends Carro{
	
	private int aņoDeFabricacion;
	private String marca;
	
	public Kromi() {
		super();
	}

	public Kromi(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna, int aņoDeFabricacion,
			String marca) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubiFila, ubiColumna);
		this.aņoDeFabricacion = aņoDeFabricacion;
		this.marca = marca;
	}

	public int getAņoDeFabricacion() {
		return aņoDeFabricacion;
	}

	public void setAņoDeFabricacion(int aņoDeFabricacion) {
		this.aņoDeFabricacion = aņoDeFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [aņoDeFabricacion=" + aņoDeFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	

}
