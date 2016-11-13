package org.wahlzeit.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
*
*/
public class SweetPhotoFactoryTest {
	/**
	 *
	 */
	@Test
	public void testInstaces(){
		SweetPhotoFactory fac=new SweetPhotoFactory();
		assertEquals(fac.getInstance(),"null");
	}
	/**
	 *
	 */
}
