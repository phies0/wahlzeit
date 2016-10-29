/*
 * Coordinate.java
 *
 * Version 1.0
 *
 * 28.10.16
 *
 */
package org.wahlzeit.model;

public class Coordinate{
	
	/**
	 *
	 */	
	private	double latitude;	//geographic width
	private	double longitude;	//geographic length
	public	static final int EARTH_RAD_IN_KM=6371;
		
	/**
	 * @methodtype constructor
	 */
	
	public Coordinate(double la,double lo){
		this.latitude=la;
		this.longitude=lo;
	}
	
	/**
	 * @methodtype get
	 */
	
	public double getLatitude(){
		return this.latitude;
	}
	
	/**
	 * @methodtype get
	 */
	
	public double getLongitude(){
		return this.longitude;
	}
	
	/**
	 * 
	 */
	
	public double getDistance(Coordinate co){
		/* https://en.wikipedia.org/wiki/Great-circle_distance */
		double deltalatitude=Math.abs(this.latitude-co.latitude);
		double deltalongitude=Math.abs(this.longitude-co.longitude);
		double deltasigma=Math.acos(Math.sin(this.latitude)*Math.sin(co.latitude)+Math.cos(this.latitude)*Math.cos(co.latitude)*Math.cos(deltalongitude));
		return EARTH_RAD_IN_KM*deltasigma;
	}

}
