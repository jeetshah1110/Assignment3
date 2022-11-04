package def;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.swing.JPanel;

public class SimplePlot extends JPanel implements Top{

	int []cord=src.getData();
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		repaint();
	}
	
    protected void paintComponent(Graphics grf){  
    	System.out.println("Simple component paint component");
        //create instance of the Graphics to use its methods  
        //super.paintComponent(grf);  
        Graphics2D graph = (Graphics2D)grf;  
          
        //Sets the value of a single preference for the rendering algorithms.  
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
          
        // get width and height  
        int width = getWidth();  
        int height = getHeight();  
          
        // draw graph  
        //graph.draw(new Line2D.Double(marg, marg, marg, height-marg));  
        //graph.draw(new Line2D.Double(marg, height-marg, width-marg, height-marg));  
          
        //find value of x and scale to plot points  
        double x = (double)(width-2*marg)/(cord.length-1);  
        double scale = (double)(height-2*marg)/getMax();  
          
        //set color for points  
        graph.setPaint(Color.RED);  
        
        List<Point> graphPoints = new ArrayList<Point>();

        double xScale = ((double) getWidth() - 2 * BORDER_GAP) / (cord.length - 1);
        double yScale = ((double) getHeight() - 2 * BORDER_GAP) / (MAX_SCORE - 1);
        
        for(int i=0;i<cord.length;i++)
        {
        	int x1 = (int)(i * xScale + BORDER_GAP);
        	int y1 = (int) ((MAX_SCORE - cord[i]) * yScale + BORDER_GAP);
        	graphPoints.add(new Point(x1, y1));
        }
        graph.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, BORDER_GAP, BORDER_GAP);
        graph.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, getWidth() - BORDER_GAP, getHeight() - BORDER_GAP);
        
        
        // create hatch marks for y axis. 
        for (int i = 0; i < Y_HATCH_CNT; i++) {
           int x0 = BORDER_GAP;
           int x1 = GRAPH_POINT_WIDTH + BORDER_GAP;
           int y0 = getHeight() - (((i + 1) * (getHeight() - BORDER_GAP * 2)) / Y_HATCH_CNT + BORDER_GAP);
           int y1 = y0;
           graph.drawLine(x0, y0, x1, y1);
        }

        // and for x axis
        for (int i = 0; i < cord.length - 1; i++) {
           int x0 = (i + 1) * (getWidth() - BORDER_GAP * 2) / (cord.length - 1) + BORDER_GAP;
           int x1 = x0;
           int y0 = getHeight() - BORDER_GAP;
           int y1 = y0 - GRAPH_POINT_WIDTH;
           graph.drawLine(x0, y0, x1, y1);
        }
                
        graph.setColor(GRAPH_COLOR);
        graph.setStroke(GRAPH_STROKE);
        // set points to the graph  
        for(int i=0; i<cord.length-1; i++){  
            int x1 = (int)(marg+i*x);  
            int y1 = (int)(height-marg-scale*cord[i]);  
            int x2 = (int)(marg+(i+1)*x);
            int y2 = (int)(height-marg-scale*cord[i+1]);
            graph.setColor(GRAPH_POINT_COLOR);

//            // only for second kind of graph
//            
//            graph.fill(new Ellipse2D.Double(x1-2, y1-2, 8, 8));
//            graph.setColor(GRAPH_COLOR);

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
	@Override
	public void plot() {
		//logic to plot simple plot
//		removeAll();
//		updateUI();
		repaint();
	}
}
