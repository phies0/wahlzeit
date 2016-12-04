/*
 * SphericCoordinate.java
 *
 *18.11.16
 */
package org.wahlzeit.model;

public class SphericCoordinate extends AbstractCoordinate{
	/*
	 * Attributes
	 */
	private double latitude;
	private double longitude;
	private double radius;
	public	static final int EARTH_RAD_IN_KM=6371;
	/*
	 * Constructor
	 */
	public SphericCoordinate(double latitude, double longitude, double radius){
		this.latitude=latitude;
		this.longitude=longitude;
		this.radius=radius;
		assertClassInvariants();
	}
	/*
	 * Getter
	 */
	public double getLatitude(){
		assertClassInvariants();
		return this.latitude;
	}
	public double getLongitude(){
		assertClassInvariants();
		return this.longitude;
	}
	public double getRadius(){
		assertClassInvariants();
		return this.radius;
	}
	/*
	 * Methods
	 */
	public CartesianCoordinate getCartesian(){
		//https://de.wikipedia.org/wiki/Kugelkoordinaten
		assertClassInvariants();
		double x=getRadius()*Math.sin(Math.toRadians(getLatitude()))*Math.cos(Math.toRadians(getLongitude()));
		double y=getRadius()*Math.sin(Math.toRadians(getLatitude()))*Math.sin(Math.toRadians(getLongitude()));
		double z=getRadius()*Math.sin(Math.toRadians(getLatitude()));
		CartesianCoordinate c=new CartesianCoordinate(x,y,z);
		
		/*Postconditions*/
		assert c.getX()>=0:"Post: The Coordinate has an invalid x value";
		assert c.getY()>=0:"Post: The Coordinate has an invalid y value";
		assert c.getZ()>=0:"Post: The Coordinate has an invalid z value";
		
		assertClassInvariants();
		return c;
	}
	public String printSpheric(){
		assertClassInvariants();
		return "Latitude= " + this.latitude + ", Longitude= " + this.longitude+ ", Radius= " + this.radius;
	}
	@Override
	protected void assertClassInvariants(){
		assert longitude>=-180:"Invalid longitude!";
		assert longitude<=180:"Invalid longitude!";
		assert latitude>=-90:"Invalid latitude!";
		assert latitude<=90:"Invalid latitude!";
		assert radius>=0:"Invalid radius!";
	}	
}
