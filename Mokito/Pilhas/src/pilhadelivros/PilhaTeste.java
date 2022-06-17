package pilhadelivros;

import pilhadelivros.dao.FakePilhaDAO;

public class PilhaTeste {
	FakePilhaDAO pilhadao;
	Pilha pilha = new Pilha(pilhadao);
	
	public boolean testaRetirarUltimoLivro() {
		Pilha pilha1 = new Pilha(pilhadao);
		Livro livro7 = new Livro("A cabana");
		pilha1.push(livro7);
		
		Livro livro8 = new Livro("O Naufrago");
		pilha1.push(livro8);
		
		Livro livro9 = new Livro("A emboscada");
		pilha1.push(livro9);
		
		String resultadoEsperado = "A emboscada";
		
		return pilha1.pop().getTitulo().equals(resultadoEsperado);
	}
	
	public boolean testeNaoAdicionaLivroAlemDoLimite() {
		Livro livro1 = new Livro("A Terra");
		Livro livro2 = new Livro("A Lua");
		Livro livro3 = new Livro("A cadeira");
		Livro livro4 = new Livro("O sol");
		Livro livro5 = new Livro("A entidade");
		Livro livro6 = new Livro("O curupira");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);
		
		String resultadoEsperado2 = "A entidade";
		return pilha.pop().getTitulo().equals(resultadoEsperado2);	
	}
	
	public boolean testeNaoAdicionaLivroForaPadraoNome() {
		Pilha pilha2 = new Pilha(pilhadao);
		Livro livro1 = new Livro("A Terra");
		Livro livro2 = new Livro("Lua");
		pilha2.push(livro1);
		pilha2.push(livro2);
		
		String resultadoEsperado3 = "A Terra";
				
		return pilha2.pop().getTitulo().equals(resultadoEsperado3);
	}
}
