/*
 * CartesianCoordinate.java
 *
 *18.11.16
 */
package org.wahlzeit.model;

import java.util.HashMap;

/*@PatternInstance(
		patternName="Value Object",
		participants={"ValueObject"}
)*/
public class CartesianCoordinate extends AbstractCoordinate{
	//private static final CartesianCoordinate CartesianCoordinate = null;
	/*
	 * Attributes
	 */
	private final double x;
	private final double y;
	private final double z;
	private static HashMap<CartesianCoordinate, CartesianCoordinate> Coordinates=new HashMap<CartesianCoordinate, CartesianCoordinate>();
	/*
	 * Constructor
	 */
	CartesianCoordinate(double x, double y, double z){
		
		this.x=x;
		this.y=y;
		this.z=z;
		assertClassInvariants();
	}
	public static CartesianCoordinate createCartCoord(double x,double y ,double z){
		CartesianCoordinate c=new CartesianCoordinate(x,y,z);
		CartesianCoordinate newc=Coordinates.get(c);
		if(newc!=null){
			return newc;
		}
		synchronized(Coordinates){
			newc=Coordinates.get(c);
			if(newc!=null){
				return newc;
			}
			Coordinates.put(c,c);
		}
		
		return newc;
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
	/*
	 * Eclipse-Methods
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartesianCoordinate other = (CartesianCoordinate) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}
	
}
