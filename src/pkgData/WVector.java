package pkgData;

import java.util.ArrayList;

public class WVector {
	ArrayList<Double> comp;
	
	public WVector() {
		this(null);
	}
	
	public WVector(ArrayList<Double> comp) {
		setComponents(comp);
	}
	
	public ArrayList<Double> getComponents(){
		return this.comp;
	}
	
	public void setComponents(ArrayList<Double> comp) {
		this.comp = comp;
	}
	
	public WVector add(WVector w){
		ArrayList<Double> ret = new ArrayList<Double>();
	
		int dim;
		if(this.getComponents().size() >= w.getComponents().size() ) dim = this.getComponents().size();
		else dim = w.getComponents().size();
		
		for(int i=0; i<dim; i++) {
			if(dim > this.getComponents().size()) ret.add(w.getComponents().get(i));
			if(dim > w.getComponents().size()) ret.add(this.getComponents().get(i));
			ret.add(this.getComponents().get(i) + w.getComponents().get(i));
		}
		
		WVector v = new WVector(ret);
		return v;
	}
	
	public WVector subtract(WVector w){
		ArrayList<Double> ret = new ArrayList<Double>();
	
		int dim;
		if(this.getComponents().size() >= w.getComponents().size() ) dim = this.getComponents().size();
		else dim = w.getComponents().size();
		
		for(int i=0; i<dim; i++) {
			if(dim > this.getComponents().size()) ret.add(w.getComponents().get(i) * (-1));
			if(dim > w.getComponents().size()) ret.add(this.getComponents().get(i));
			ret.add(this.getComponents().get(i) - w.getComponents().get(i));
		}
		
		WVector v = new WVector(ret);
		return v;
	}
	
	public void invert() {
		ArrayList<Double> d = new ArrayList<Double>();
		for(int i=0; i < this.getComponents().size(); i++)
			d.add(this.getComponents().get(i) * (-1));
		this.setComponents(d);	
	}
}
