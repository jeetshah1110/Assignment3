package def;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start extends JPanel{

	public static void main(String args[]) {
		Source.getInstance().generateData();
		
        JFrame frame = new JFrame();  
        // set size, layout and location for frame.  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.add(new Dot());  
        frame.setSize(400, 400);  
        frame.setLocation(200, 200);  
        frame.setVisible(true);  
	}
}
