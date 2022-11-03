package def;

public class Decorator implements Top {
	private Top top;
	@Override
	public void plot() {
		top.plot();
 	}
}
