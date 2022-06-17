package mokito;

import static org.mockito.Mockito.*;

public class ExemploMokito {

	public static void main(String[] args) {
		Pessoa alguem = mock(Pessoa.class);
		when(alguem.getIdade()).thenReturn(25);
		
		alguem.falar();
	}
}
