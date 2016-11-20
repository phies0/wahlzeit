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
	/**
	 *
	 */
	@Test
	public void getDistanceBetweenTwoDifferentCos() {
		CartesianCoordinate c1= new CartesianCoordinate(67,25,45);
		CartesianCoordinate c2= new CartesianCoordinate(3,45,54);
		assertEquals(67.65352910233139,c1.getDistance(c2),0);
	}
	/**
	 *testing getSpheric
	 */
	@Test
	public void testChangeIntoSpheric(){
		CartesianCoordinate c= new CartesianCoordinate(12,42,39);
		SphericCoordinate sc=c.getSpheric();
		assertEquals("Latitude= 44.56455991031439, Longitude= 1.560322035062746, Radius= 2.669616484968866",sc.printSpheric());
	}

}
