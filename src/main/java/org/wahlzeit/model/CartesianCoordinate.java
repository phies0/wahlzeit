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
		assertClassInvariants();
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
	public String printCartesian(){
		return "x= " + this.x + ", y= " + this.y+ ", z= " + this.z;
	}
	@Override
	public CartesianCoordinate getCartesian() {
		return this;
	}
}
