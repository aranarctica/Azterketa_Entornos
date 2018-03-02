import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author ik012982i9 creamos la clase para realizar los testeos
 */
public class MatematicaTest {

	Matematica matematica = new Matematica(4, 5, 9, calculo());

	/**
	 * creamos el testeo para testear el metodo de la suma
	 * @return 
	 */
	@Test
	public  int[] calculo() {
		int a = 4;
		int b = 5;
		int c = 7;
		int resultado = c;

		assertNull(a + b, c);
		return null;
		
	
	}

	
	private void assertNull(int i, int c) {
		
	}


	/**
	 * creamos el testeo para testear el metodo de la mayor menor
	 */
	@Test
	public void medir() {
		int a = 5;
		int b = 7;
		int c;

		equals(a > b);

	}

}
