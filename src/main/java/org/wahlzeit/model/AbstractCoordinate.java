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
		CartesianCoordinate c1=this.getCartesian();
		CartesianCoordinate c2=((AbstractCoordinate) other).getCartesian();
		return (Math.sqrt((c1.getX()-c2.getX())*(c1.getX()-c2.getX())+(c1.getY()-c2.getY())*(c1.getY()-c2.getY())+(c1.getZ()-c2.getZ())*(c1.getZ()-c2.getZ())));
	}
	/*
	 * 
	 */
	@Override
	public boolean isEqual(Coordinate other) {
		CartesianCoordinate c1=this.getCartesian();
		CartesianCoordinate c2=((AbstractCoordinate) other).getCartesian();
		if(c1.getX()==c2.getX()){
			if(c1.getY()==c2.getY()){
				if(c1.getZ()==c2.getZ()){
					return true;
				}
			}
		}
		return false;
	}

}
