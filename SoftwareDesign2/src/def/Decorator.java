package def;

import java.util.Observable;

import javax.swing.JPanel;

public class Decorator extends JPanel implements Top{
	private Top top;
	@Override
	public void plot() {
		if(top!=null)
		{
			top.plot();
		}
		else
		{
			System.out.println("Super does not exist");
		}
 	}
	void addPlot(Top top)
	{
		this.top = top;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(top!=null)
		{
			top.update(o, arg);
		}
	}
}
