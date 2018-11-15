package pkgData;

import java.util.ArrayList;

public class DataLoader {

	public static WVector getWector(ArrayList<String> command) throws Exception{
		WVector v = null;
		int pos = 5;
		int dim;
		
		String name = command.get(1);
		
		dim = new Integer(command.get(3));
		ArrayList<Double> d = new ArrayList<>();
		for(int i = 0; i < dim; i++) {
			d.add(new Double(command.get(pos)));
			pos += 2;
		}
		
		v = new WVector(name,d);
		
		return v;
	}
	
}
