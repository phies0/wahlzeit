package org.wahlzeit.model;
/*
 * 
 */
/*@PatternInstance(
	patternName="Template Methode",
	participants={"AbstractCoordinate","CartesianCoordinate","SphericCoordinate"}
)*/
public abstract class AbstractCoordinate implements Coordinate {
	private static final double ALPHA = 0.000000001;
	/*
	 * 
	 */
	public abstract CartesianCoordinate getCartesian();
	/*
	 * 
	 */
	@Override
	public double getDistance(Coordinate other) {
		
		assertNotNull(other);
		
		CartesianCoordinate c1=this.getCartesian();
		CartesianCoordinate c2=((AbstractCoordinate) other).getCartesian();
		
		double dx=c1.getX()-c2.getX();
		double dy=c1.getY()-c2.getY();
		double dz=c1.getZ()-c2.getZ();
		
		double distance= (Math.sqrt((dx*dx)+(dy*dy)+(dz*dz)));
		assertDouble(distance);
		return distance;
	}
	/*
	 * 
	 */
	@Override
	public boolean isEqual(Coordinate other) {
		
		assertNotNull(other);
		
		if(this.getDistance(other)>ALPHA){
			return true;
		} else {
			return false;
		}
	}
	/*
	 * 
	 */
	protected void assertClassInvariants(){
		CartesianCoordinate c1=this.getCartesian();
		assertDouble(c1.getX());
		assertDouble(c1.getY());
		assertDouble(c1.getZ());		
	}
	/*
	 * Assertion Methods/ Error handling
	 */
	public void assertNotNull(Coordinate other){
		if(other==null){
			throw new NullPointerException("The given Coordinate should not be null");
		}
	}
	public void assertDouble(double val){
		if(Double.isInfinite(val)==true){
			throw new IllegalArgumentException("Value should not be infinite");
		}
		if(Double.isNaN(val)==true){
			throw new IllegalArgumentException("Value should not be NaN");
		}
	}

}
