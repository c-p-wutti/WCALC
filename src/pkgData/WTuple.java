package pkgData;

import java.io.Serializable;

public class WTuple<T> implements Comparable, Serializable{
	private String classifier;
	private T o;

	public WTuple() {
		this("", null);
	}
	
	public WTuple(String classifier, T o) {
		setClassifier(classifier);
		setObject(o);
	}
	
	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}
	
	public String getClassifier() {
		return this.classifier;
	}
	
	public void setObject(T o) {
		this.o = o;
	}
	
	public T getObject() {
		return this.o;
	}

	@Override
	public String toString() {
		return "classifier: " + this.classifier.toString() + " Object: " + o.toString();
	}

	@Override
	public int compareTo(Object arg0) {
		WTuple<Object> t = (WTuple)arg0;
		return this.classifier.compareTo(t.getClassifier());
	}
}
