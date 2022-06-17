package vendas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class VendasTeste {

	@Test
	void testCheckout_TemCredito() {
		Cliente cliente = new Cliente("12323", "Leandra");
		ICreditoService credito = mock(ICreditoService.class);
		when(credito.getLimiteCredito(cliente.getCpf())).thenReturn((double) 2500);
		Venda venda = new Venda(cliente,2000,credito);
		
		boolean resultado = venda.checkout();
		assertTrue(resultado);
	}
	
	@Test
	void testCheckout_NaoTemCredito() {
		Cliente cliente = new Cliente("12323", "Leandra");
		ICreditoService credito = mock(ICreditoService.class);
		when(credito.getLimiteCredito(cliente.getCpf())).thenReturn((double) 1000);
		Venda venda = new Venda(cliente,2000,credito);
		
		boolean resultado = venda.checkout();
		assertFalse(resultado);
	}
}
