import static org.junit.Assert.*;

import org.junit.Test;

public class Circulo_HCMTest {
	private double res;
	
	@Test
	public void testArea() {
		Circulo_HCM circulo = new Circulo_HCM(7,"circulo");
		res = circulo.area();
		assertEquals(153.93,res,0.01);
	}
	
	@Test
	public void testArea1() {
		Circulo_HCM circulo = new Circulo_HCM(0,"circulo");
		res = circulo.area();
		assertEquals(0,res,0);
	}
	
	@Test
	public void testArea2() {
		Circulo_HCM circulo = new Circulo_HCM(-3,"circulo");
		res = circulo.area();
		assertEquals(28.27,res,0.01);
	}

	@Test
	public void testPerimetro() {
		Circulo_HCM circulo = new Circulo_HCM(7,"circulo");
		res = circulo.perimetro();
		assertEquals(43.98,res,0.01);
	}
	
	@Test
	public void testPerimetro1() {
		Circulo_HCM circulo = new Circulo_HCM(0,"circulo");
		res = circulo.perimetro();
		assertEquals(0,res,0);
	}
	
	@Test
	public void testPerimetro2() {
		Circulo_HCM circulo = new Circulo_HCM(-3,"circulo");
		res = circulo.perimetro();
		assertEquals(18.84,res,0.01);
	}

}
