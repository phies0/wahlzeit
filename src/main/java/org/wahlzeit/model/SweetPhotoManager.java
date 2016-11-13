package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Subclass;

@Subclass
public class SweetPhotoManager extends PhotoManager{
	/**
	 *
	 */
	protected final static SweetPhotoManager instance = new SweetPhotoManager();
	/**
	 *
	 */
	protected SweetPhotoManager(){
		
	}
	/**
	 *
	 */
}
