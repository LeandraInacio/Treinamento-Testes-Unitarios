package pilhadelivros;

public class PilhaMain {

	public static void main(String [] args) {
		PilhaTeste pilhateste = new PilhaTeste();
		boolean resultado;
		
		resultado = pilhateste.testeNaoAdicionaLivroAlemDoLimite();
		System.out.println("Teste de livros al�m do limite = "+ resultado);
		
		resultado = pilhateste.testaRetirarUltimoLivro();
		System.out.println("teste de retirar o �ltimo livro = "+ resultado);
		
		resultado = pilhateste.testeNaoAdicionaLivroForaPadraoNome();
		System.out.println("teste n�o adicionar livro sem estar no padr�o de t�tulo = "+ resultado);
	}
}
