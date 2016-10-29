package org.wahlzeit.model;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class CoordinateTest {

    /* testing constructor */

	/**
	 *
	 */
	@Test
	public void testConstructor() {
		
		Coordinate simpleCo= new Coordinate(0,180);

		/* Check coordinates after creation */
		assertEquals(0, simpleCo.getLatitude(),0);
		assertEquals(180, simpleCo.getLongitude(),0);

	}

	/* testing getDistance() in different ways */

	/**
	 *
	 */
	@Test
	public void getDistanceBetweenTwoSameCos() {
		Coordinate negCo= new Coordinate(0,180);
		Coordinate posCo= new Coordinate(0,180);
		assertEquals(0,negCo.getDistance(posCo),0);
	}

	/**
	 *
	 */
	@Test
	public void getDistanceBetweenPosAndNegButSameAbsCos() {
		Coordinate negCo= new Coordinate(0,-180);
		Coordinate posCo= new Coordinate(0,180);
		assertEquals(11840.10525365471,negCo.getDistance(posCo),0);
	}

	/**
	 *
	 */
	@Test
	public void getDistanceBetweenPosCos() {
		Coordinate negCo= new Coordinate(180,180);
		Coordinate posCo= new Coordinate(90,270);
		assertEquals(16318.952934373327,negCo.getDistance(posCo),0);
	}

	/**
	 *
	 */
	@Test
	public void getDistanceBetweenNegCos() {
		Coordinate negCo= new Coordinate(-180,-180);
		Coordinate posCo= new Coordinate(-90,-270);
		assertEquals(16318.952934373327,negCo.getDistance(posCo),0);
	}

}
