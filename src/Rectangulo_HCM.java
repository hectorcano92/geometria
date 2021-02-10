
/**
 * @author H�ctor Cano Maestre
 * @version 1.2
 */
public class Rectangulo_HCM extends FiguraGeometrica_HCM {
	private double l1;
	private double l2;
	
	
	/**
	 * Constructor de la clase. Asigana los valores al rect�ngulo.
	 * Llama al constructor de FiguraGeometrica_HCM
	 * @param tipoFigura String tipo figura.
	 * @param lG lado grande.
	 * @param lP lado peque�o.
	 */
	public Rectangulo_HCM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * M�todo sobre-escrito que calcula el area del rect�ngulo.
	 * @return Devuelve el area del rect�ngulo.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * M�todo sobre-escrito que devuelve el per�metro del rect�ngulo.
	 * @return Devuelve el per�metro del rect�ngulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
