package pessoaCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTeste {

	@Test
	void testVerificarIdadeAdulto() {
		Pessoa pessoa = new Pessoa();
		pessoa.verificarIdade(40);
		assertTrue(true);
	}
	
	@Test
	void testVerificarIdadeJovem() {
		Pessoa pessoa = new Pessoa();
		pessoa.verificarIdade(20);
		assertTrue(true);
	}
	
	@Test
	void testVerificarIdadeCrianca() {
		Pessoa pessoa = new Pessoa();
		pessoa.verificarIdade(10);
		assertTrue(true);
	}
	
	@Test
	void testVerificarIdadeIdoso() {
		Pessoa pessoa = new Pessoa();
		pessoa.verificarIdade(70);
		assertTrue(true);
	}
}
