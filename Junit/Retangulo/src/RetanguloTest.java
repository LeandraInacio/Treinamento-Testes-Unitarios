
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class RetanguloTest {

	private int base; 
	private int altura;
	private int area;
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
			{10,20,200},
			{10,30,300}

		});
	}
	
	public RetanguloTest(int base, int altura, int area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
		
	}
	
	@Test
	void testCalcularArea() {
		Retangulo retangulo = new Retangulo(base, altura);
		int resultado = retangulo.calcularArea();
		assertEquals(area, resultado);
	}

	@Ignore
	void testCalcularPerimetro() {
		
	}

}
