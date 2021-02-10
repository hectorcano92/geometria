
public class Circulo_HCM extends FiguraGeometrica_HCM {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_HCM(double r, String tipoFigura) {
		super(tipoFigura);
		if (r<0) r*=-1;
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
