/**
 * 
 * @author ik012982i9
 * @param creamos
 *            la clase matematica para hahcer unos calculos
 */
public class Matematica {

	/**
	 * creamos las variable para realizar luego las gestiones
	 * @param a creamos la variable a
	 * @param b creamos la variable b
	 * @param c creamos la variable c
	 * @param resultado[] creamos el array resultado
	 */
	private int[] resultado;
	int a;
	int b;
	int c;

	
	public int[] getResultado() {
		return resultado;
	}

	public void setResultado(int[] resultado) {
		this.resultado = resultado;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public Matematica(int a, int b, int c, int[]resultado){
		this.a = a;
		this.b = b;
		this.c = c;
		this.resultado = resultado;
	}

	/**
	 * los parametros que se usan son las variables declaradas al principio de la clase
	 * @param a sumamos la variable a
	 * @param b suamamos la variable b
	 * @param c guaramos el resultado de la suma
	 * @return devuelve la suma de a y b que es la variable c, y la guardamos en
	 *         el array resultado
	 */
	public int calculo() {

		c = a + b;

		return resultado[c];

	}

	/**
	 *  los parametros que se usan son las variables declaradas al principio de la clase
	 * @param a comparamos la variable
	 * @param b comparamos la variable
	 * 
	 * @return informa si el valos a es mayor que b
	 */
	public boolean medir() {

		if (a > b) {
			return true;
		} else {
			return false;
		}

	}
	/**
	 * 
	 * creamos el metodo para devolver el resultado
	 * @return devolvemos el resultado de las sumas
	 */
	private int resultado(){
		
		
		return resultado[calculo()];
		
	}

}
