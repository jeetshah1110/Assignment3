//package def;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Start{
//
//	public static void main(String args[]) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				
//			}
//		});
//		Source.getInstance().generateData();
//		
//        JFrame frame = new JFrame(); 
//        //frame.getContentPane().setLayout(null);
//        // set size, layout and location for frame.  
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//        frame.setSize(300,800);
//        frame.setVisible(true);  
//
//        SimplePlot dot = new SimplePlot();
//        dot.setBounds(0,0,300,250);
//        //frame.add(dot);
//        
////        SimplePlot dot2 = new SimplePlot();
////        dot2.setBounds(0,250,300,250);
//        MarkedPlot markedPlot = new MarkedPlot();
//        //markedPlot.addPlot(dot2);
//        markedPlot.setBounds(0,250,300,250);
//        frame.add(markedPlot);
//        markedPlot.plot();
//        
////        SimplePlot dot3 = new SimplePlot();
////        dot3.setBounds(0,500,300,250);
//        MarkedPlot markedPlot2 = new MarkedPlot();
//        //markedPlot2.addPlot(dot3);
//        markedPlot2.setBounds(0,500,300,250);
//        BarPlot barPlot = new BarPlot();
//        barPlot.addPlot(markedPlot2);
//        barPlot.setBounds(0,500,300,250);
//        frame.add(barPlot);
//        barPlot.plot();
//        
//        Source.getInstance().addObserver(dot);
//        Source.getInstance().addObserver(markedPlot);
//        Source.getInstance().addObserver(barPlot);
//        
////        try {
////			Thread.sleep(1000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////        
//        System.out.println("ENDDD");
//	}
//}


//varad code
package def;

import java.awt.BorderLayout;
import java.awt.Color;
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
        frame.setSize(300,1000);
        frame.setVisible(true);  


        
//        SimplePlot dot2 = new SimplePlot();
//        dot2.setBounds(0,200,300,250);        
        SimplePlot dot = new SimplePlot();
        dot.setBounds(0,0,300,150);
        frame.add(dot);
        
//        SimplePlot dot2 = new SimplePlot();
//        dot2.setBounds(0,151,300,150);
//        frame.add(dot2);
        SimplePlot dot3 = new SimplePlot();
        dot3.setBounds(0,151,300,250);
        MarkedPlot markedPlot2 = new MarkedPlot();
        markedPlot2.addPlot(dot3);
        markedPlot2.setBounds(0,151,300,250);
        frame.add(markedPlot2);
        markedPlot2.plot();
//        BarPlot barPlot = new BarPlot();
//       // barPlot.addPlot(markedPlot);
//        barPlot.setBounds(0,300,300,150);
//       frame.add(barPlot);
//       barPlot.plot();
        
//       JPanel panel = new JPanel();
//        JButton OKButton = new JButton("Run");
//        OKButton.addActionListener(new ActionListener() {
//           public void actionPerformed(ActionEvent e) {
//            	Source.getInstance().generateData();
//            }
//        });
//        OKButton.setBounds(10, 11, 110, 23);
 //       panel.add(OKButton,BorderLayout.CENTER);
//        frame.getContentPane().add(panel);
        Source.getInstance().addObserver(dot);
        Source.getInstance().addObserver(markedPlot2);
        JPanel bp = new JPanel();
        bp.setBounds(0, 450, 100, 100);
        JButton button = new JButton();
        button.setBounds(0, 0, 24,24);
        button.setBackground(Color.blue);
        button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	Source.getInstance().generateData();
        }
        });
        bp.add(button, BorderLayout.CENTER);
        
        frame.add(bp);
        

//      Source.getInstance().addObserver(barPlot);
          
        //Source.getInstance().generateData();
        System.out.println("ENDDD");
	}
	public void MyAction() {
		
	}
}


