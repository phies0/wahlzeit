package org.wahlzeit.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
/**
*
*/
public class SweetPhotoManagerTest {
	/**
	 *
	 */
	@Test
	public void testConstructor(){
		SweetPhotoManager man=new SweetPhotoManager();
		assertEquals(man.getInstance(),"null");
	}
	/**
	 *
	 */
}
