package org.wahlzeit.model;
/*
 * 
 */
public abstract class AbstractCoordinate implements Coordinate {
	/*
	 * 
	 */
	public abstract CartesianCoordinate getCartesian();
	/*
	 * 
	 */
	@Override
	public double getDistance(Coordinate other) {
		assertClassInvariants();
		
		/*Precondition*/
		assert other!=null:"Pre: The given Coordinate is null";
		
		CartesianCoordinate c1=this.getCartesian();
		CartesianCoordinate c2=((AbstractCoordinate) other).getCartesian();
		
		/*Postconditions*/
		assert c2.getX()>=0:"Post: The Coordinate has an invalid x value";
		assert c2.getY()>=0:"Post: The Coordinate has an invalid y value";
		assert c2.getZ()>=0:"Post: The Coordinate has an invalid z value";
		assertClassInvariants();
		
		double dx=c1.getX()-c2.getX();
		double dy=c1.getY()-c2.getY();
		double dz=c1.getZ()-c2.getZ();
		
		return (Math.sqrt((dx*dx)+(dy*dy)+(dz*dz)));
	}
	/*
	 * 
	 */
	@Override
	public boolean isEqual(Coordinate other) {
		assertClassInvariants();
		
		/*Precondition*/
		assert other!=null:"The given Coordinate is null";
		
		CartesianCoordinate c1=this.getCartesian();
		CartesianCoordinate c2=((AbstractCoordinate) other).getCartesian();
		
		/*Postconditions*/
		assert c2.getX()>=0:"Post: The Coordinate has an invalid x value";
		assert c2.getY()>=0:"Post: The Coordinate has an invalid y value";
		assert c2.getZ()>=0:"Post: The Coordinate has an invalid z value";
		
		if(c1.getX()==c2.getX()){
			if(c1.getY()==c2.getY()){
				if(c1.getZ()==c2.getZ()){
					assertClassInvariants();
					return true;
				}
			}
		}
		assertClassInvariants();
		return false;
	}
	/*
	 * 
	 */
	protected void assertClassInvariants(){
		assert this!=null:"The given Coordinate is null";
		CartesianCoordinate c1=this.getCartesian();
		assert c1.getX()>=0:"Post: The Coordinate has an invalid x value";
		assert c1.getY()>=0:"Post: The Coordinate has an invalid y value";
		assert c1.getZ()>=0:"Post: The Coordinate has an invalid z value";		
	}

}
