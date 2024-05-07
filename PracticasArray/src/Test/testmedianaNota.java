package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class testmedianaNota {
	class TestMedianaNotas {

		static int [] Impares;
		static int[] Pares;
		static int[] Menores;
		static int[] Mayores;
		
		
		@BeforeAll
		static void setup() {
			Pares = new int []{9,8,7,6,5,};
			Impares = new int [] {2,4,6,8,9,5,4,};
			Menores = new int[] {-15};
			Mayores = new int[] {80};
		}
		
		@Test
		void testPar() {
			float resultadoEsperado = 5.5f;
			float resultadoObtenido = MisArrays.medianaNotas(Pares);
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
		@Test
		void testImpar() {
			float resultadoEsperado = 6f;
			float resultadoObtenido = MisArrays.medianaNotas(Impares);
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
		
		@Test
		void testNumeroMenor(){
			Exception  excepcion = assertThrows(IllegalArgumentException.class,
					() -> MisArrays.medianaNotas(Menores));
			
			String esperado = "error";
			String obtenido = excepcion.getMessage();
			assertEquals(esperado,obtenido);
		}
		
		@Test
		void testNumeroMayor(){
			Exception  excepcion = assertThrows(IllegalArgumentException.class,
					() -> MisArrays.medianaNotas(Mayores));
			
			String esperado = "error";
			String obtenido = excepcion.getMessage();
			assertEquals(esperado,obtenido);
		}

	}}
