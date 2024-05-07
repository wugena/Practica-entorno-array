package Util;

public abstract class MisArrays {
			
	
		 public static float mediaNotas(int[] notas) {
		        try {
		            int suma = 0;
		            for (int nota : notas) {
		                suma += nota;
		            }
		            return  suma / notas.length;
		        } catch (IllegalArgumentException  e) {
		            System.out.println("Error al calcular la media: " + e.getMessage());
		            return 0; 
		        }
		    }

	}
	
	
	
	
	
