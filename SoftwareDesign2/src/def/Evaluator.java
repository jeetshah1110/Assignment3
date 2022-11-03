package def;
import java.io.*;

public class Evaluator {
	private static Evaluator instance;
	private Evaluator() {
	}
	public int Evaluate(int arr[]) {
		int avg=0;
		for(int i:arr) {
			avg=avg+i;
			
		}
		return avg/arr.length;
	}
	public static Evaluator getInstance() {
		if(instance==null) {
			instance=new Evaluator();
		}
		return instance;
	}
}
 