package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestArrays {

	@Test
	public void testMediaNotas() {
        int[] notas = {5, 7, 8, 9, 6};
        assertEquals(7, MisArrays.mediaNotas(notas));
    }

}
