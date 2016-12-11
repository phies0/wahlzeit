package org.wahlzeit.model;

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
