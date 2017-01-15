/*
 * SphericCoordinate.java
 *
 *18.11.16
 */
package org.wahlzeit.model;

import java.util.HashMap;

/*@PatternInstance(
		patternName="Value Object",
		participants={"ValueObject"}
)*/
public class SphericCoordinate extends AbstractCoordinate{
	/*
	 * Attributes
	 */
	private final double latitude;
	private final double longitude;
	private final double radius;
	public	static final int EARTH_RAD_IN_KM=6371;
	private static HashMap<SphericCoordinate, SphericCoordinate> Coordinates=new HashMap<SphericCoordinate, SphericCoordinate>();
	/*
	 * Constructors
	 */
	private SphericCoordinate(double latitude, double longitude){
		this.latitude=latitude;
		this.longitude=longitude;
		this.radius=EARTH_RAD_IN_KM;
		assertClassInvariants();		
	}
	
	SphericCoordinate(double latitude, double longitude, double radius){
		this.latitude=latitude;
		this.longitude=longitude;
		this.radius=radius;
		assertClassInvariants();
	}
	
	public static SphericCoordinate createSpherCoord(double latitude,double longitude,double radius){
		SphericCoordinate c=new SphericCoordinate(latitude,longitude,radius);
		SphericCoordinate newc=Coordinates.get(c);
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
		CartesianCoordinate c = null;
		c=c.createCartCoord(x,y,z);
		
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
	/*
	 * Eclipse Methods
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(radius);
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
		SphericCoordinate other = (SphericCoordinate) obj;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
}
