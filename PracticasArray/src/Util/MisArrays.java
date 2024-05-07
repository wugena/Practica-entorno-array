package Util;

import java.util.Arrays;

public abstract class MisArrays {
			
	
		 public static float mediaNotas(int[] notas) {
			 if (notas == null || notas.length == 0) {
		            throw new IllegalArgumentException("error");//correctiones de error de un try catch a throw new 
		        }
		            int suma = 0;
		            for (int nota : notas) {
		                suma += nota;
		                
		            }
		            return  suma / notas.length;
		        }
		       
 
		 
		 public static float medianaNotas (int[] notas) {
			 if (notas == null || notas.length == 0) {
		            throw new IllegalArgumentException("error");//correctiones de error de un try catch a throw new 
		        }
				 Arrays.sort(notas);
		            int numero = notas.length;
		            if (numero % 2 == 0) {
		                return  (notas[numero / 2 - 1] + notas[numero/2]) / 2;
		            } else {
		                return notas[numero / 2];
		            }
		        

			 
			 
		 }
		 public static int maximaNota(int[] notas) {
		        if (notas == null || notas.length == 0) {
		            throw new IllegalArgumentException("error");
		        }

		        int maximo = notas[0];
		        for (int nota : notas) {
		            if (nota > maximo) {
		            	maximo = nota;
		            }
		        }
		        return maximo;
		    }

	}
	
	
	
	
	
