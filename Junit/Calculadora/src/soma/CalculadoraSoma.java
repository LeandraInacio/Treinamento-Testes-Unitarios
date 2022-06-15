package soma;

public class CalculadoraSoma {

	public int somar(int a, int b) {
		int x = 10;
		while(x>0) {
			try {
				Thread.sleep(2);
				x--;
			} catch (InterruptedException e) {
				return 0;
			}
		}
		return a+b;
	}
}
