package pilhadelivros.dao;

import pilhadelivros.Pilha;

public class FakePilhaDAO implements IPilhaDAO {

	@Override
	public void save(Pilha p) {
		System.out.println("Teste de salvar no banco fake para mokito");
		
	}
}
