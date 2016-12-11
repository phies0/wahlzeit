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
		assertNotNull(coordinate);
		this.coordinate=coordinate;
	}

	private void assertNotNull(Coordinate other) {
		if(other==null){
			throw new NullPointerException("Give Coordinate should not be null!");
		}
		
	}

	/**
	 * @methodtype get
	 */
	public Coordinate getCoordinate(){
		return this.coordinate;
	}

}