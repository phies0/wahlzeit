package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Subclass;

@Subclass
public class SweetPhotoManager extends PhotoManager{
	/**
	 *
	 */
	public final static SweetPhotoManager instance = new SweetPhotoManager();
	/**
	 *
	 */
	public SweetPhotoManager(){
		super();
	}
	/**
	 *
	 */
}
