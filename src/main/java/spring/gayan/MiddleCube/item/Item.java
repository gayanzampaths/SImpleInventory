package spring.gayan.MiddleCube.item;

import javax.persistence.Entity;
import javax.persistence.Id;

//add reference to JPA
@Entity
public class Item {

	//Item properties
	//add primary key
	@Id
	private String itemId;
	private String itemName;
	private int itemSize;
	private String itemLocation;
	private String description;
	
	//no argument constructor
	public Item() {
		
	}
	
	//constructor for Item object
	public Item(String itemId, String itemName, int itemSize, String itemLocation, String description) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemSize = itemSize;
		this.itemLocation = itemLocation;
		this.description = description;
	}
	
	//getters and setters for Item object
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemSize() {
		return itemSize;
	}
	public void setItemSize(int itemSize) {
		this.itemSize = itemSize;
	}
	public String getItemLocation() {
		return itemLocation;
	}
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
