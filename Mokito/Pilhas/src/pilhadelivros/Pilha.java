package pilhadelivros;

import java.util.ArrayList;

import pilhadelivros.dao.IPilhaDAO;

public class Pilha {
	
	int limite = 5;
	ArrayList<Livro> pilha = new ArrayList<Livro>();
	private IPilhaDAO pilhadao;
	
	public Pilha(IPilhaDAO pilhadao) {
		this.pilhadao = pilhadao;
	}
	
	public void push(Livro livro) {
		if(pilha.size() >= limite) {
			throw new ArrayStoreException();
		}
		
		if(!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")) {
			return;
		}
		
		pilha.add(livro);
		//pilhadao.save(pilha);
	}
	
	public Livro pop() {
		Livro livro = pilha.get(pilha.size()-1);
		pilha.remove(pilha.size()-1);
		//pilhadao.save();
		return livro;
	}
	
	public int count() {
		return pilha.size();
	}
}
