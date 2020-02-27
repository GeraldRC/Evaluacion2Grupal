package modelo;

public class Kromi extends Carro{
	
	private int añoDeFabricacion;
	private String marca;
	
	public Kromi() {
		super();
	}

	public Kromi(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna, int añoDeFabricacion,
			String marca) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubiFila, ubiColumna);
		this.añoDeFabricacion = añoDeFabricacion;
		this.marca = marca;
	}

	public int getAñoDeFabricacion() {
		return añoDeFabricacion;
	}

	public void setAñoDeFabricacion(int añoDeFabricacion) {
		this.añoDeFabricacion = añoDeFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [añoDeFabricacion=" + añoDeFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	

}
