package def;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.Observable;

public class MarkedPlot extends Decorator{

	int []cord=src.getData(); 
	@Override
	public void plot() {
		repaint();
		super.plot();
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		System.out.println("Jeet");
		super.update(o, arg);
		repaint();
	}	
	protected void paintComponent(Graphics grf){
		
		System.out.println("MarkedPlot called");
        Graphics2D graph = (Graphics2D)grf;  
        int width = getWidth();  
        int height = getHeight();
        double x = (double)(width-2*marg)/(cord.length-1);  
        double scale = (double)(height-2*marg)/getMax();  

        //Sets the value of a single preference for the rendering algorithms.  
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for(int i=0; i<cord.length-1; i++){  
            int x1 = (int)(marg+i*x);  
            int y1 = (int)(height-marg-scale*cord[i]);  
            graph.setColor(GRAPH_POINT_COLOR);

            graph.fill(new Ellipse2D.Double(x1-2, y1-2, 8, 8));
        } 
	}
	
    private int getMax(){  
        int max = -Integer.MAX_VALUE;  
        for(int i=0; i<cord.length; i++){  
            if(cord[i]>max)  
                max = cord[i]; 
        }  
        return max;  
    } 
    
	public void drawMarks() {
		repaint();
	}
}
