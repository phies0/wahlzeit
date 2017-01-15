package org.wahlzeit.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.wahlzeit.services.DataObject;

public class SweetType extends DataObject {
	/*
	 * Attributes
	 */
	private final String brand;
	private final String name;
	
	private SweetType suptype=null;
	protected Set<SweetType> subs=new HashSet<SweetType>();
	/*
	 * Constructor
	 */
	public SweetType(String brand, String name){
		this.brand=brand;
		this.name=name;
	}
	/*
	 * Getter
	 */
	public SweetType getSuper(){
		return this.suptype;
	}
	public String getBrand(){
		return this.brand;
	}
	public String getName(){
		return this.name;
	}
	/*
	 * Setter
	 */
	public void setSupType(SweetType suptype){
		this.suptype=suptype;
	}
	/*
	 * Methods
	 */
	public boolean isSubtype(SweetType other){
		if(this.equals(other)){
			return true;
		}
		if(this.suptype!=null){
			return this.suptype.isSubtype(other);
		}
		return false;
	}
	public Iterator<SweetType> getSubTypeIterator(){
		return this.subs.iterator();
	}
	/*
	 *Eclipse Methods
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((suptype == null) ? 0 : suptype.hashCode());
		result = prime * result + ((subs == null) ? 0 : subs.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SweetType other = (SweetType) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (suptype == null) {
			if (other.suptype != null)
				return false;
		} else if (!suptype.equals(other.suptype))
			return false;
		if (subs == null) {
			if (other.subs != null)
				return false;
		} else if (!subs.equals(other.subs))
			return false;
		return true;
	}
	

}
