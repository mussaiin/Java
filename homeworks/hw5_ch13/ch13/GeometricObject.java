public abstract class GeometricObject extends Object implements Comparable<GeometricObject>{
	private String color ="white";
	private boolean filled;

	public 	GeometricObject(){}

	public GeometricObject(String c,boolean f){color = c;filled = f;}

	public String getColor(){return color;}

	public void setColor(String c){color =c;}

	public boolean isFilled(){return filled;}

	public void setFilled(boolean f){ filled =f;}

	public abstract double getArea();

	public int compareTo(GeometricObject other){
		if (this.getArea()<other.getArea())
			return 1;
		else if (this.getArea()>other.getArea())
			return -1;
		else
			return 0;
	}

	public static GeometricObject max (GeometricObject o1,GeometricObject o2){
		return (o1.compareTo(o2)==1)?o1:o2;
	}

}
