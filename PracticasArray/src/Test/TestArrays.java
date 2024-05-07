package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestArrays {

	class TestMediaNotas {
		static int [] bien;
		static int[] negativo;
		static int[] mayores;
		
		
		@BeforeAll
		static void setup() {
			bien = new int []{6,7,8,9};
			negativo = new int[] {-15};
			mayores = new int[] {80};
		}
		
		@Test
		void medianaMayor() {
			float resultadoEsperado = 5.5f;
			float resultadoObtenido = MisArrays.mediaNotas(bien);
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
		
		@Test
		void NumeroMenor(){
			Exception  excepcion = assertThrows(IllegalArgumentException.class,
					() -> MisArrays.mediaNotas(negativo));
			
			String esperado = "error";
			String obtenido = excepcion.getMessage();
			assertEquals(esperado,obtenido);
		}
		
		@Test
		void NumeroMayor(){
			Exception  excepcion = assertThrows(IllegalArgumentException.class,
					() -> MisArrays.mediaNotas(mayores));
			String esperado = "error";
			String obtenido = excepcion.getMessage();
			assertEquals(esperado,obtenido);
		}

	}}