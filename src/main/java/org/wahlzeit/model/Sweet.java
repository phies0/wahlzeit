package org.wahlzeit.model;

import org.wahlzeit.services.DataObject;

public class Sweet extends DataObject{
	/*
	 *Attributes
	 */
	private final SweetType type;
	private final String name;
	private final String brand;
	/*
	 *Constructor
	 */
	public Sweet(SweetType type,String name, String brand){
		this.type=type;
		this.name=name;
		this.brand=brand;
	}
	/*
	 *Getter
	 */
	public SweetType getType(){
		return this.type;
	}
	public String getName(){
		return this.name;
	}
	public String getBrand(){
		return this.brand;
	}
}
