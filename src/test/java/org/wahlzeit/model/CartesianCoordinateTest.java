package org.wahlzeit.model;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class CartesianCoordinateTest {
	/**
	 *testing constructor
	 */
	@Test
	public void testConstructor() {
		
		CartesianCoordinate c= new CartesianCoordinate(12,42,39);

		/* Check coordinates after creation */
		assertEquals(12, c.getX(),0);
		assertEquals(42, c.getY(),0);
		assertEquals(39, c.getZ(),0);

	}
	/**
	 *testing getDistance()
	 */
	@Test
	public void getDistanceBetweenTwoSameCos() {
		CartesianCoordinate c1= new CartesianCoordinate(0,18,7);
		CartesianCoordinate c2= new CartesianCoordinate(0,18,7);
		assertEquals(0,c1.getDistance(c2),0);
	}
	/*
	 *
	 */
	@Test
	public void getDistanceBetweenTwoDifferentCos() {
		CartesianCoordinate c1= new CartesianCoordinate(67,25,45);
		CartesianCoordinate c2= new CartesianCoordinate(3,45,54);
		assertEquals(67.65352910233139,c1.getDistance(c2),0);
	}
	/**
	 *testing isEqual()
	 */
	@Test
	public void testIsEqual() {
		CartesianCoordinate c1= new CartesianCoordinate(0,18,7);
		CartesianCoordinate c2= new CartesianCoordinate(0,18,7);
		assertEquals(true,c1.isEqual(c2));
	}
	@Test
	public void testIsEqualwithTwoDifferentCoordinates() {
		CartesianCoordinate c1= new CartesianCoordinate(0,18,7);
		CartesianCoordinate c2= new CartesianCoordinate(90,30,7);
		assertEquals(false,c1.isEqual(c2));
	}

}
