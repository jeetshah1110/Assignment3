package def;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start{

	public static void main(String args[]) {
		Source.getInstance().generateData();
		
        JFrame frame = new JFrame(); 
        //frame.getContentPane().setLayout(null);
        // set size, layout and location for frame.  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300,750);
        frame.setVisible(true);  

        SimplePlot dot = new SimplePlot();
        dot.setBounds(0,0,300,250);
        frame.add(dot);
        
//        SimplePlot dot2 = new SimplePlot();
//        dot2.setBounds(0,200,300,250);
        MarkedPlot markedPlot = new MarkedPlot();
//        markedPlot.addPlot(dot2);
        markedPlot.setBounds(0,200,300,250);
        frame.add(markedPlot);
        markedPlot.plot();
        
//        SimplePlot dot3 = new SimplePlot();
//        dot3.setBounds(0,400,300,250);
//        MarkedPlot markedPlot2 = new MarkedPlot();
//        markedPlot2.addPlot(dot3);
//        markedPlot2.setBounds(0,400,300,250);
//        BarPlot barPlot = new BarPlot();
//        barPlot.addPlot(markedPlot2);
//        barPlot.setBounds(0,400,300,250);
//        frame.add(barPlot);
//        barPlot.plot();
        
        JPanel panel = new JPanel();
        JButton OKButton = new JButton("Run");
        OKButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Source.getInstance().generateData();
            }
        });
        OKButton.setBounds(10, 11, 110, 23);
        panel.add(OKButton,BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        
        
        Source.getInstance().addObserver(dot);
        Source.getInstance().addObserver(markedPlot);
//      Source.getInstance().addObserver(barPlot);
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //Source.getInstance().generateData();
        System.out.println("ENDDD");
	}
	public void MyAction() {
		
	}
}
