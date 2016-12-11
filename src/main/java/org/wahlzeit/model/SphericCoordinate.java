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
	 * Constructors
	 */
	public SphericCoordinate(double latitude, double longitude){
		this.latitude=latitude;
		this.longitude=longitude;
		this.radius=EARTH_RAD_IN_KM;
		assertClassInvariants();		
	}
	
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
		return this.latitude;
	}
	public double getLongitude(){
		return this.longitude;
	}
	public double getRadius(){
		return this.radius;
	}
	/*
	 * Methods
	 */
	public CartesianCoordinate getCartesian(){
		
		assertClassInvariants();
		
		//https://de.wikipedia.org/wiki/Kugelkoordinaten
		double x=getRadius()*Math.sin(Math.toRadians(getLatitude()))*Math.cos(Math.toRadians(getLongitude()));
		double y=getRadius()*Math.sin(Math.toRadians(getLatitude()))*Math.sin(Math.toRadians(getLongitude()));
		double z=getRadius()*Math.sin(Math.toRadians(getLatitude()));
		CartesianCoordinate c=new CartesianCoordinate(x,y,z);
		
		assertClassInvariants();
		return c;
	}
	public String printSpheric(){
		assertClassInvariants();
		return "Latitude= " + this.latitude + ", Longitude= " + this.longitude+ ", Radius= " + this.radius;
	}
	/*
	 * Assertion Methods
	 */
	@Override
	protected void assertClassInvariants(){
		assertLongitude(longitude);
		assertLatitude(latitude);
		assertRadius(radius);
	}	
	
	private void assertLongitude(double longitude){
		assertDouble(longitude);
		if(longitude>=-180 || longitude <=180){
			throw new IllegalArgumentException("Longitude should be in between -180 and 180!");
		}
	}
	
	private void assertLatitude(double latitude){
		assertDouble(latitude);
		if(latitude>=-90 || latitude<=90){
			throw new IllegalArgumentException("Latitude should be in between -90 and 90!");
		}
	}
	
	private void assertRadius(double radius){
		assertDouble(radius);
		if(radius>=0){
			throw new IllegalArgumentException("Radius should be positive, noch NaN and finite!");
		}
	}	
}
