/*
 * CartesianCoordinate.java
 *
 *18.11.16
 */
package org.wahlzeit.model;

public class CartesianCoordinate extends AbstractCoordinate{
	//private static final CartesianCoordinate CartesianCoordinate = null;
	/*
	 * Attributes
	 */
	private double x;
	private double y;
	private double z;
	/*
	 * Constructor
	 */
	public CartesianCoordinate(double x, double y, double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	/*
	 * Getter
	 */
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public double getZ(){
		return this.z;
	}
	/*
	 * Methods
	 */
	//@Override
	//public double getDistance(Coordinate coordinate) {
		//return getDistance((CartesianCoordinate) coordinate);
	//}
	//public double getDistance(CartesianCoordinate cartesiancoordinate) {
		//return (Math.sqrt((this.x-cartesiancoordinate.x)*(this.x-cartesiancoordinate.x)+(this.y-cartesiancoordinate.y)*(this.y-cartesiancoordinate.y)+(this.z-cartesiancoordinate.z)*(this.z-cartesiancoordinate.z)));
	//}
	//public SphericCoordinate getSpheric(){
		//https://de.wikipedia.org/wiki/Kugelkoordinaten
		//return new SphericCoordinate(Math.sqrt(this.x*this.x+this.y*this.y+this.z+this.z),1/Math.cos(this.z/Math.sqrt(this.x*this.x+this.y*this.y+this.z+this.z)),1/Math.tan(this.y/this.x));
	//}
	public String printCartesian(){
		return "x= " + this.x + ", y= " + this.y+ ", z= " + this.z;
	}
	@Override
	public CartesianCoordinate getCartesian() {
		return this;
	}	
}
