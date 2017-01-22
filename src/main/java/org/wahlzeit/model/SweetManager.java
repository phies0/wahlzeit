package org.wahlzeit.model;

import java.util.HashMap;
import java.util.Map;

import org.wahlzeit.services.ObjectManager;

public class SweetManager extends ObjectManager{
	/*
	 * Attributes
	 */
	private final SweetManager instance = new SweetManager();
	private Map<Sweet,Sweet> sweets=new HashMap<Sweet,Sweet>();
	private Map<SweetType,SweetType> sweettypes=new HashMap<SweetType,SweetType>();
	/*
	 * Constructor
	 */
	private SweetManager(){}
	/*
	 * Getter
	 */
	public SweetManager getManager(){
		return this.instance;
	}
	/*
	 * Methods
	 */
	public Sweet createSweet(SweetType type,String name, String brand){
		Sweet sw=new Sweet(type,name,brand);
		//part one of the creation of a new sweet object
		sweets.put(sw, sw);
		return sw;
	}
	public boolean existingSweet(SweetType type, String name, String brand){
		Sweet sw=new Sweet(type,name,brand);
		if(sweets.containsKey(sw)){
			return true;
		}
		return false;
	}
	public boolean existingSweetType(String brand, String name){
		SweetType swt=new SweetType(brand,name);
		if(sweettypes.containsKey(swt)){
			return true;
		}
		return false;
	}	
	
}
