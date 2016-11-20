/*
 * SphericCoordinate.java
 *
 *18.11.16
 */
package org.wahlzeit.model;

public class SphericCoordinate implements Coordinate{
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
	@Override
	public double getDistance(Coordinate coordinate) {
		return getDistance((SphericCoordinate) coordinate);
	}
	public double getDistance(SphericCoordinate sphericcoordinate) {
		/* https://en.wikipedia.org/wiki/Great-circle_distance */
		//double deltalatitude=Math.abs(Math.toRadians(this.latitude)-Math.toRadians(sphericcoordinate.latitude));
		double deltalongitude=Math.abs(Math.toRadians(this.longitude)-Math.toRadians(sphericcoordinate.longitude));
		double deltasigma=Math.acos(Math.sin(Math.toRadians(this.latitude))*Math.sin(Math.toRadians(sphericcoordinate.latitude))+Math.cos(Math.toRadians(this.latitude))*Math.cos(Math.toRadians(sphericcoordinate.latitude))*Math.cos(deltalongitude));
		return EARTH_RAD_IN_KM*deltasigma;
	}
	public CartesianCoordinate getCartesian(){
		//https://de.wikipedia.org/wiki/Kugelkoordinaten
		return new CartesianCoordinate(getRadius()*Math.sin(Math.toRadians(getLatitude()))*Math.cos(Math.toRadians(getLongitude())),radius*Math.sin(Math.toRadians(getLatitude()))*Math.sin(Math.toRadians(getLongitude())),radius*Math.sin(Math.toRadians(getLatitude())));
	}
	public String printSpheric(){
		return "Latitude= " + this.latitude + ", Longitude= " + this.longitude+ ", Radius= " + this.radius;
	}	
}
