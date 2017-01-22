package org.wahlzeit.model;

import org.wahlzeit.services.DataObject;

/*
 * Creation of SweetObject:
1. Delegation (Who gets to create the object? -> the SweetManager): seperate-object
2. Selection (How is the concrete class selected? -> one concrete class): on-the-spot
3. Configuration (How is a class mapping configured? -> one concrete class): in-code
4. Instantiation (How is the concrete class instantiated? -> no need for configuartion, use of the constructor): in-code
5. Initialization (How is the new object initialized? -> Sweet(SweetType type,String name, String brand)) : by-fixed-signature
6. Building (How is the object structure built? -> there's only the Sweet, so no object structure) : none of the given?!
 */

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
