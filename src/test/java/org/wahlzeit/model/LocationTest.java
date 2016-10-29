package org.wahlzeit.model;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LocationTest {

	/**
	 *
	 */
	@Test
	public void testConstructor() {

		Coordinate coordinate= new Coordinate(0,180);
		Location location= new Location(coordinate);

		// Checks constructor and get-Method
		assertEquals(coordinate.getLatitude(), location.getCoordinate().getLatitude(),0);
		assertEquals(coordinate.getLongitude(), location.getCoordinate().getLongitude(),0);

	}


}
