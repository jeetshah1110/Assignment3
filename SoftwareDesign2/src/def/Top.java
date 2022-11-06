package def;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.util.Observer;

//trial change
public interface Top extends Observer{
	  static final int MAX_SCORE = 20;
	  static final int PREF_W = 800;
	  static final int PREF_H = 650;
	  static final int BORDER_GAP = 30;
	  static final Color GRAPH_COLOR = Color.green;
	  static final Color GRAPH_POINT_COLOR = new Color(150, 50, 50, 180);
	  static final Stroke GRAPH_STROKE = new BasicStroke(3f);
	  static final int GRAPH_POINT_WIDTH = 12;
	  static final int Y_HATCH_CNT = 10;
 int marg = 60;
	Source src= Source.getInstance();
	public void plot();
}
