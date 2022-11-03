package def;
import java.util.Random;
public class Source {
	private static Source src;
	private int [] arr;
	private int average;
	private Source() {
		arr=new int[10];
		average=0;
	}
	public void generateData() {
		 Random rand = new Random();
	     int upperbound = 100;
	     for(int i=0;i<10;i++) {
	    	 arr[i]=rand.nextInt(upperbound);
	     }
	     Evaluator e= Evaluator.getInstance();
	     average = e.Evaluate(arr);
	}
	public static Source getInstance() {
		if(src==null) {
			src=new Source();
		}
		return src;
	}
	
	public int[] getData() {
		return arr;
	}
	
	public int getAverage(){
		return average;
	}
}
