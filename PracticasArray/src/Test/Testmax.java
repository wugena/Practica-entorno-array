package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class Testmax {

	class TestMedianaNotas {
			
		static int [] correcto;
		static int[] negativo;
		static int[] mayor;
		
		
		
		@BeforeAll
		static void setup() {
			correcto = new int []{10,9,8,7};
			negativo = new int [] {-8};
			mayor = new int[] {15};
			
		}
		
		@Test
		void testPar() {
			float resultadoEsperado = 10;
			float resultadoObtenido = MisArrays.medianaNotas(correcto);
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
		
		@Test
		void mernor10(){
			Exception  excepcion = assertThrows(IllegalArgumentException.class,
					() -> MisArrays.medianaNotas(negativo));
			
			String esperado = "error";
			String obtenido = excepcion.getMessage();
			assertEquals(esperado,obtenido);
		}
		
		@Test
		void Mayor10(){
			Exception  excepcion = assertThrows(IllegalArgumentException.class,
					() -> MisArrays.medianaNotas(mayor));
			
			String esperado = "error";
			String obtenido = excepcion.getMessage();
			assertEquals(esperado,obtenido);
		}

	}

}
