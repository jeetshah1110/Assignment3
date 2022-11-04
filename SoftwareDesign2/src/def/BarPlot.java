package def;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.Observable;

public class BarPlot extends Decorator{
	int []cord=src.getData(); 
	@Override
	public void plot() {
		repaint();
		super.plot();
	}
	
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		repaint();
		super.update(o,arg);
	}
	protected void paintComponent(Graphics grf){
		
        Graphics2D graph = (Graphics2D)grf;  
        int width = getWidth();  
        int height = getHeight();
        double x = (double)(width-2*marg)/(cord.length-1);  
        double scale = (double)(height-2*marg)/getMax();  

        //Sets the value of a single preference for the rendering algorithms.  
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for(int i=0; i<cord.length; i++){  
            int x1 = (int)(marg+i*x);  
            int y1 = (int)(height-marg-scale*cord[i]);  
            int x2 = x1;
            int y2 = getHeight() - BORDER_GAP;
            graph.setColor(GRAPH_COLOR);
            graph.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
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
    
	public void drawBars() {
		System.out.println("YY");
		repaint();
	}

}
