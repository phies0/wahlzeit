package org.wahlzeit.model;

/*@PatternInstance(
		patternName="Abstract Factory",
		participants={"AbstractProduct",
				"ConcreteProduct"
		}
)*/
/*
 * Creation of SweetPhotoObject:
1. Delegation (Who gets to create the object? -> the SweetPhotoFactory): seperate-object
2. Selection (How is the concrete class selected? -> always by using the SweetPhotoFactory): on-the-spot
3. Configuration (How is a class mapping configured? -> SweetPhotoFactory -> SweetPhoto): in-code
4. Instantiation (How is the concrete class instantiated? -> no configuartion, using constructor): in-code
5. Initialization (How is the new object initialized? -> SweetPhoto(PhotoId myId) or SweetPhoto(PhotoId myId,String name, String brand, String type) : by-fixed-signature
6. Building (How is the object structure built? -> you need Sweet and SweetType) : by Building
 */
public class SweetPhoto extends Photo{
	/*
	 *Attributes
	 */
	private String name;
	private String brand;
	private String type;

	protected PhotoId id = null;
	/*
	 *Constructors
	 */
	public SweetPhoto(){
		super();
	}
	public SweetPhoto(PhotoId myId) {
		super(myId);
	}
	public SweetPhoto(PhotoId myId,String name, String brand, String type){
		id=myId;
		this.name=name;
		this.brand=brand;
		this.type=type;
	}
	/*
	 * Getter
	 */
	public String getName(){
		return name;
	}
	public String getBrand(){
		return brand;
	}
	public String getType(){
		return type;
	}
	/*
	 * Setter
	 */
	public void setName(String name){
		assertString(name);
		this.name=name;
	}
	public void setBrand(String brand){
		assertString(brand);
		this.brand=brand;
	}
	public void setType(String type){
		assertString(type);
		this.type=type;
	}
	/*
	 * Assertion Method
	 */
	public void assertString(String s){
		if(s.isEmpty()){
			throw new IllegalArgumentException("The given String should not be empty!");
		}
	}
}
