package soma;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CalculadoraSomaTest {

	@Test
	@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
	void testSomarNegativo() {
		CalculadoraSoma soma = new CalculadoraSoma();
		int resultado = soma.somar(-10, -5);
		
		assertEquals(-15, resultado);
	}
	
	@Test
	@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
	void testSomar() {
		CalculadoraSoma soma = new CalculadoraSoma();
		int resultEsperado = 10;
		int resultado = soma.somar(5, 5);
		
		assertTrue(resultado == resultEsperado);
	}
}
