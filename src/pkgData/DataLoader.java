package pkgData;

import java.util.ArrayList;

public class DataLoader {

	public static WVector getWector(ArrayList<String> command) throws Exception{
		WVector v = null;
		int pos = 4;
		int dim;
		
		dim = new Integer(command.get(2));
		ArrayList<Double> d = new ArrayList<>();
		for(int i = 0; i < dim; i++) {
			d.add(new Double(command.get(pos)));
			pos += 2;
		}
		
		v = new WVector(d);
		
		return v;
	}
	
}
