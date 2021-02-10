
/**
 * @author Héctor Cano Maestre
 * @version 1.2
 */
public class Rectangulo_HCM extends FiguraGeometrica_HCM {
	private double l1;
	private double l2;
	
	
	/**
	 * Constructor de la clase. Asigana los valores al rectángulo.
	 * Llama al constructor de FiguraGeometrica_HCM
	 * @param tipoFigura String tipo figura.
	 * @param lG lado grande.
	 * @param lP lado pequeño.
	 */
	public Rectangulo_HCM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Método sobre-escrito que calcula el area del rectángulo.
	 * @return Devuelve el area del rectángulo.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Método sobre-escrito que devuelve el perímetro del rectángulo.
	 * @return Devuelve el perímetro del rectángulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
