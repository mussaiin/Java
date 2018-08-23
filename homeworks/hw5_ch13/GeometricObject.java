public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	GeometricObject() { dateCreated = new java.util.Date();	}
	GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() { return color; }
	public void setColor(String color) { this.color = color;	}
	public boolean isFilled() {	return filled; }
	public void setFilled(boolean filled) {	this.filled = filled; }
	public java.util.Date getDateCreated() { return dateCreated; }

	@Override
	public String toString() {
		return "Created: " + dateCreated + "\n Color: " + color +	" and filled: " + filled;
	}
	@Override
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
    if(o1.compareTo(o2)==1){return o2;}
    else{return o1;}
	}

	public abstract double getArea();
	public abstract double getPerimeter();

}
