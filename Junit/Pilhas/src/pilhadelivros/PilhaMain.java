package pilhadelivros;

public class PilhaMain {

	public static void main(String [] args) {
		PilhaTeste pilhateste = new PilhaTeste();
		boolean resultado;
		
		resultado = pilhateste.testeNaoAdicionaLivroAlemDoLimite();
		System.out.println("Teste de livros além do limite = "+ resultado);
		
		resultado = pilhateste.testaRetirarUltimoLivro();
		System.out.println("teste de retirar o último livro = "+ resultado);
		
		resultado = pilhateste.testeNaoAdicionaLivroForaPadraoNome();
		System.out.println("teste não adicionar livro sem estar no padrão de título = "+ resultado);
	}
}
