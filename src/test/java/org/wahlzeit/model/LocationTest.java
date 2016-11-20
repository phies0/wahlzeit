package org.wahlzeit.model;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LocationTest {

	/**
	 *
	 */
	@Test
	public void testConstructor() {

		SphericCoordinate coordinate= new SphericCoordinate(0,13,4);
		Location location= new Location(coordinate);

		// Checks constructor and get-Method
		assertEquals(coordinate, location.getCoordinate());
	}


}
