package org.wahlzeit.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SphericCoordinateTest {
	/**
	 *testing constructor and getter
	 */
	@Test
	public void testConstructor() {
		
		SphericCoordinate c= new SphericCoordinate(12,42,SphericCoordinate.EARTH_RAD_IN_KM);

		/* Check coordinates after creation */
		assertEquals(12, c.getLatitude(),0);
		assertEquals(42, c.getLongitude(),0);
		assertEquals(SphericCoordinate.EARTH_RAD_IN_KM, c.getRadius(),0);

	}
	/**
	 *testing getDistance()
	 */
	@Test
	public void getDistanceBetweenTwoSameCos() {
		SphericCoordinate c1= new SphericCoordinate(0,18,SphericCoordinate.EARTH_RAD_IN_KM);
		SphericCoordinate c2= new SphericCoordinate(0,18,SphericCoordinate.EARTH_RAD_IN_KM);
		assertEquals(0,c1.getDistance(c2),0);
	}
	/*
	 *
	 */
	@Test
	public void getDistanceBetweenTwoDifferentCos() {
		SphericCoordinate c1= new SphericCoordinate(67,25,SphericCoordinate.EARTH_RAD_IN_KM);
		SphericCoordinate c2= new SphericCoordinate(3,30,SphericCoordinate.EARTH_RAD_IN_KM);
		assertEquals(7823,c1.getDistance(c2),1);
	}
	/**
	 *testing getCartesian
	 */
	@Test
	public void testChangeIntoCartesian(){
		SphericCoordinate c= new SphericCoordinate(12,42,SphericCoordinate.EARTH_RAD_IN_KM);
		CartesianCoordinate sc=c.getCartesian();
		assertEquals("x= 984.373635581395, y= 886.3340025776562, z= 1324.6053821999446",sc.printCartesian());
	}
	/**
	 *testing isEqual()
	 */
	@Test
	public void testIsEqual() {
		SphericCoordinate c1= new SphericCoordinate(0,18,SphericCoordinate.EARTH_RAD_IN_KM);
		SphericCoordinate c2= new SphericCoordinate(0,18,SphericCoordinate.EARTH_RAD_IN_KM);
		assertEquals(true,c1.isEqual(c2));
	}
	@Test
	public void testIsEqualwithTwoDifferentCoordinates() {
		SphericCoordinate c1= new SphericCoordinate(0,18,SphericCoordinate.EARTH_RAD_IN_KM);
		SphericCoordinate c2= new SphericCoordinate(90,18,SphericCoordinate.EARTH_RAD_IN_KM);
		assertEquals(false,c1.isEqual(c2));
	}	
}
