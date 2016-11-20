package org.wahlzeit.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SphericCoordinateTest {
	/**
	 *testing constructor
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
	/**
	 *
	 */
	@Test
	public void getDistanceBetweenTwoDifferentCos() {
		SphericCoordinate c1= new SphericCoordinate(67,25,SphericCoordinate.EARTH_RAD_IN_KM);
		SphericCoordinate c2= new SphericCoordinate(3,-45,SphericCoordinate.EARTH_RAD_IN_KM);
		assertEquals(8843.9181835388,c1.getDistance(c2),0);
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
}
