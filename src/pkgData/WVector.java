package pkgData;

import java.util.ArrayList;

public class WVector {
	ArrayList<Double> comp;
	String name;
	
	public WVector() {
		this("", null);
	}
	
	public WVector(String name, ArrayList<Double> comp) {
		setName(name);
		setComponents(comp);
	}
	
	public ArrayList<Double> getComponents(){
		return this.comp;
	}
	
	public void setComponents(ArrayList<Double> comp) {
		this.comp = comp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
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
		//fix
		WVector v = new WVector("", ret);
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
		//fix
		WVector v = new WVector("", ret);
		return v;
	}
	
	public void invert() {
		ArrayList<Double> d = new ArrayList<Double>();
		for(int i=0; i < this.getComponents().size(); i++)
			d.add(this.getComponents().get(i) * (-1));
		this.setComponents(d);	
	}
	
	@Override
	public String toString() {
		String str="";
		
		for(Double d : this.getComponents())
			str += "comp :" + d + "\n";
	
		return str;
	}
}
