package org.wahlzeit.model;

//import org.wahlzeit.services.LogBuilder;

import com.googlecode.objectify.annotation.Subclass;

@Subclass
public class SweetPhotoFactory extends PhotoFactory{
	/**
	 *
	 */
	private static PhotoFactory instance = null;
	/**
	 *
	 */
	public SweetPhotoFactory(){}
	/**
	 * Public singleton access method.
	 */
	public static synchronized PhotoFactory getInstance() {
		//if (instance == null) {
			//log.config(LogBuilder.createSystemMessage().addAction("setting generic SweetPhotoFactory").toString());
			//setInstance(new SweetPhotoFactory());
		//}

		return instance;
	}
	/**
	 * @methodtype factory
	 */
	public SweetPhoto createPhoto() {
		return new SweetPhoto();
	}

	/**
	 * Creates a new photo with the specified id
	 */
	public SweetPhoto createPhoto(PhotoId id) {
		return new SweetPhoto(id);
	}
	
}
