package com.infy.jobsExecutor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Collection")
public class CollectionExecutorEntity {
	@Id
	@GeneratedValue
	int collection_ID;
	int channnel_ID;
	int collection_Type_ID;
	int collectionType_Master_ID;
	int createdBy;
	String custom_Script;
	String status;
	String collection_Name;
	int recurring_ID;
	int SLA_ID;
	String file_Name_Pattern;
	String file_Extensions;
	boolean post_Collection;
	String ship_Data_Location;

	public int getCollection_ID() {
		return collection_ID;
	}

	public void setCollection_ID(int collection_ID) {
		this.collection_ID = collection_ID;
	}

	public int getChannnel_ID() {
		return channnel_ID;
	}

	public void setChannnel_ID(int channnel_ID) {
		this.channnel_ID = channnel_ID;
	}

	public int getCollection_Type_ID() {
		return collection_Type_ID;
	}

	public void setCollection_Type_ID(int collection_Type_ID) {
		this.collection_Type_ID = collection_Type_ID;
	}

	public int getCollectionType_Master_ID() {
		return collectionType_Master_ID;
	}

	public void setCollectionType_Master_ID(int collectionType_Master_ID) {
		this.collectionType_Master_ID = collectionType_Master_ID;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCustom_Script() {
		return custom_Script;
	}

	public void setCustom_Script(String custom_Script) {
		this.custom_Script = custom_Script;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCollection_Name() {
		return collection_Name;
	}

	public void setCollection_Name(String collection_Name) {
		this.collection_Name = collection_Name;
	}

	public int getRecurring_ID() {
		return recurring_ID;
	}

	public void setRecurring_ID(int recurring_ID) {
		this.recurring_ID = recurring_ID;
	}

	public int getSLA_ID() {
		return SLA_ID;
	}

	public void setSLA_ID(int sLA_ID) {
		SLA_ID = sLA_ID;
	}

	public String getFile_Name_Pattern() {
		return file_Name_Pattern;
	}

	public void setFile_Name_Pattern(String file_Name_Pattern) {
		this.file_Name_Pattern = file_Name_Pattern;
	}

	public String getFile_Extensions() {
		return file_Extensions;
	}

	public void setFile_Extensions(String file_Extensions) {
		this.file_Extensions = file_Extensions;
	}

	public boolean isPost_Collection() {
		return post_Collection;
	}

	public void setPost_Collection(boolean post_Collection) {
		this.post_Collection = post_Collection;
	}

	public String getShip_Data_Location() {
		return ship_Data_Location;
	}

	public void setShip_Data_Location(String ship_Data_Location) {
		this.ship_Data_Location = ship_Data_Location;
	}

}
