package pilhadelivros;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LivroTeste {

	@Test
	void testGetTitulo() {
		Livro livro = new Livro("A lua");
		String result = livro.getTitulo();
		
		assertEquals(result, "A lua");
	}

}
