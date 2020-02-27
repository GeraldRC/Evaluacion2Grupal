package modelo;

import java.util.ArrayList;

public class Tablero {
	
	private static ArrayList<Carro> listaCarros = new ArrayList<>(); 
	private static ArrayList<Huevo> listaHuevos = new ArrayList<>();
	
	

	
	public static ArrayList<Carro> getListaCarros() {
		return listaCarros;
	}

	public static void setListaCarros(ArrayList<Carro> listaCarros) {
		Tablero.listaCarros = listaCarros;
	}

	public static ArrayList<Huevo> getListaHuevos() {
		return listaHuevos;
	}

	public static void setListaHuevos(ArrayList<Huevo> listaHuevos) {
		Tablero.listaHuevos = listaHuevos;
	}

	
	public static void crearCarro() {
		Kromi kromi1 = new Kromi(6,"12/08/2019",0,0,1992,"Volvo");
		listaCarros.add(kromi1);
		Kromi kromi2 = new Kromi();
		listaCarros.add(kromi2);
		Kromi kromi3 = new Kromi();
		listaCarros.add(kromi3);
		
		Caguano caguano1 = new Caguano();
		listaCarros.add(caguano1);
		Caguano caguano2 = new Caguano();
		listaCarros.add(caguano2);
		Caguano caguano3 = new Caguano();
		listaCarros.add(caguano3);
		Caguano caguano4 = new Caguano();
		listaCarros.add(caguano4);
		Caguano caguano5 = new Caguano();
		listaCarros.add(caguano5);
		
		Trupalla trupalla1 = new Trupalla();
		listaCarros.add(trupalla1);
		Trupalla trupalla2 = new Trupalla();
		listaCarros.add(trupalla2);
		Trupalla trupalla3 = new Trupalla();
		listaCarros.add(trupalla3);
		Trupalla trupalla4 = new Trupalla();
		listaCarros.add(trupalla4);
		Trupalla trupalla5 = new Trupalla();
		listaCarros.add(trupalla5);
		Trupalla trupalla6 = new Trupalla();
		listaCarros.add(trupalla6);
		Trupalla trupalla7 = new Trupalla();
		listaCarros.add(trupalla7);
		Trupalla trupalla8 = new Trupalla();
		listaCarros.add(trupalla8);
		Trupalla trupalla9 = new Trupalla();
		listaCarros.add(trupalla9);
		Trupalla trupalla10 = new Trupalla();
		listaCarros.add(trupalla10);
	}
	
	public static void lanzarHuevo() {
		
		
		
		
	}
	
	public static void mostrarMatriz() {
		 int numFilas = 15;
	     int numColumnas = 15;
		 String[][] tablero = new String[numFilas][numColumnas];
		
		//Primera seccion
	        System.out.print("  ");
	        for(int i = 0; i < numColumnas; i++)
	                System.out.print(i);
	        System.out.println();
	        
	      //SegundaSeccion
	        
	        
	     
			   
	        	
	        	crearCarro();
	        
				for(int i = 0; i < tablero.length; i++) {
			    int x = (int) (Math.random()*15);
	        	int y = (int) (Math.random()*15);
	        	 Carro c = listaCarros.get(i);
					
	            for (int j = 0; j < tablero[i].length; j++) {
	            	
	                if (j == 0)
	                    System.out.print(i + "|" + tablero[i][j]);
	                else if (j == tablero[i].length - 1)
	                    System.out.print(tablero[i][j] + "|" + i);
	                else
	                    System.out.print(tablero[i][j]);
	            }
	            
	            tablero[x][y] = "K";
	            
	            System.out.println();
	        }
		
	        	
				
				
			
	        	
				
			
	        
	        
	        //Last section of Ocean Map
	        System.out.print("  ");
	        for(int i = 0; i < numColumnas; i++)
	            System.out.print(i);
	        System.out.println();
		
	}
	
	
	public static void calcularPuntaje() {
		
		
		
		
	}
}
