import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_dtbTest {

	@Test
	void test7() {
		Circulo_dtb c= new Circulo_dtb(7, "Circulo");
		assertEquals((7*7*3.1416),c.area(), 0.01);
	}
	@Test
	void test0() {
		Circulo_dtb c= new Circulo_dtb(0, "Circulo");
		assertEquals((0*0*3.1416),c.area(), 0.01);
	}
	@Test
	void test3() {
		Circulo_dtb c= new Circulo_dtb(-3, "Circulo");
		assertEquals((-3*-3*3.1416),c.area(), 0.01);
	}
	
	@Test
	void testp7() {
		Circulo_dtb c= new Circulo_dtb(7, "Circulo");
		assertEquals((7*2*3.1416),c.perimetro(), 0.01);
	}
	@Test
	void testp0() {
		Circulo_dtb c= new Circulo_dtb(0, "Circulo");
		assertEquals((0*2*3.1416),c.perimetro(), 0.01);
	}
	@Test
	void testp3() {
		Circulo_dtb c= new Circulo_dtb(-3, "Circulo");
		assertEquals((-3*2*3.1416),c.perimetro(), 0.01);
	}
	
}
