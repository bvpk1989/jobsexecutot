/**
 * The JobsExecutor  is an POJO class mapping Jobs table in JobsExecutor_db database.
* @author  Infosys::veerapavankumar.b
* @version 1.0
* @since   08-09-2015
*/
package com.infy.jobsExecutor.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "jobs")
public class JobsExecutorEntity {
	@Id
	@GeneratedValue	
	private int jobs_id;	
	private int recurring_id;
	private int collection_id;
	private int conversion_id;
	private int priority;
	private String status;
	private Date date_Time_Queued;
	private Timestamp date_Time_Started;
	private java.sql.Timestamp date_Time_Completed;
	
	public int getJobs_id() {
		return jobs_id;
	}
	public void setJobs_id(int jobs_id) {
		this.jobs_id = jobs_id;
	}
	public int getRecurring_id() {
		return recurring_id;
	}
	public void setRecurring_id(int recurring_id) {
		this.recurring_id = recurring_id;
	}
	public int getCollection_id() {
		return collection_id;
	}
	public void setCollection_id(int collection_id) {
		this.collection_id = collection_id;
	}
	public int getConversion_id() {
		return conversion_id;
	}
	public void setConversion_id(int conversion_id) {
		this.conversion_id = conversion_id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate_Time_Queued() {
		return date_Time_Queued;
	}
	public void setDate_Time_Queued(Date date_Time_Queued) {
		this.date_Time_Queued = date_Time_Queued;
	}
	public Timestamp getDate_Time_Started() {
		return date_Time_Started;
	}
	public void setDate_Time_Started(Timestamp date_Time_Started) {
		this.date_Time_Started = date_Time_Started;
	}
	public java.sql.Timestamp getDate_Time_Completed() {
		return date_Time_Completed;
	}
	public void setDate_Time_Completed(java.sql.Timestamp date_Time_Completed2) {
		this.date_Time_Completed = date_Time_Completed2;
	}
}
