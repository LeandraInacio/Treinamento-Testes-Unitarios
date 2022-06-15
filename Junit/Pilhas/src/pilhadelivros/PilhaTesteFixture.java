package pilhadelivros;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class PilhaTesteFixture {
	Pilha pilha = new Pilha();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("Executou o beforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("executou o afterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		Livro livro1 = new Livro("A Cabana");
		Livro livro2 = new Livro("A terra");
		Livro livro3 = new Livro("A roda");
		Livro livro4 = new Livro("O sol");
		Livro livro5 = new Livro("O globo");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		
		System.out.println("Executado antes cada teste");
	}

	@AfterEach
	void tearDown() throws Exception {
		int tamanho = pilha.count();
		while(tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
		System.out.println("Executado após cada teste");
	}

	@Test
	void testPushAlemdoLimite() {
		
		try {
			pilha.push(new Livro("A Volta ao Mundo"));
			fail();
		} catch (ArrayStoreException e) {
			assertTrue(true);
		}
	}

	@Test
	void testPushForadoPadrao() {
		pilha.pop();
		pilha.push(new Livro("Xman"));
		
		String livroreturn = pilha.pop().getTitulo();
		assertEquals("O sol", livroreturn);
	}
	
	/*@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void testPushAlemdoLimiteException() {
		pilha.push(new Livro("O rei"));
		exceptionRule.expect(ArrayStoreException.class);
	    assertTrue(true);
	}*/

}
