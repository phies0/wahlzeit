/*
 * Location.java
 *
 * Version 1.0
 *
 * 28.10.16
 *
 */
package org.wahlzeit.model;

public class Location{
	
	/**
	 *
	 */

	public Coordinate coordinate;
	
	/**
	 * @methodtype constructor
	 */
	
	public Location(Coordinate coordinate){
		this.coordinate=coordinate;
	}

	/**
	 * @methodtype get
	 */
	public Coordinate getCoordinate(){
		return this.coordinate;
	}

}