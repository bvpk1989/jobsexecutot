package com.infy.jobsExecutor.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_details")
public class JobDetailsEntity {
	@Id
	int jobs_Details_ID;
	int job_ID;
	int step_Sequence;
	String step_Name;
	Timestamp step_Start_Time;
	Timestamp step_End_Time;
	String step_Status;
	String step_Serice_Type;
	String step_Service_Location;
	boolean should_Be_Paused;
	String data_Location;
	String logs_Location;
	String initiated_By;
	Date last_Restart_TimeStamp;
	
	public int getJobs_Details_ID() {
		return jobs_Details_ID;
	}
	public void setJobs_Details_ID(int jobs_Details_ID) {
		this.jobs_Details_ID = jobs_Details_ID;
	}
	public int getJob_ID() {
		return job_ID;
	}
	public void setJob_ID(int job_ID) {
		this.job_ID = job_ID;
	}
	public int getStep_Sequence() {
		return step_Sequence;
	}
	public void setStep_Sequence(int step_Sequence) {
		this.step_Sequence = step_Sequence;
	}
	public String getStep_Name() {
		return step_Name;
	}
	public void setStep_Name(String step_Name) {
		this.step_Name = step_Name;
	}
	public Timestamp getStep_Start_Time() {
		return step_Start_Time;
	}
	public void setStep_Start_Time(Timestamp step_Start_Time) {
		this.step_Start_Time = step_Start_Time;
	}
	public Timestamp getStep_End_Time() {
		return step_End_Time;
	}
	public void setStep_End_Time(Timestamp step_End_Time) {
		this.step_End_Time = step_End_Time;
	}
	public String getStep_Status() {
		return step_Status;
	}
	public void setStep_Status(String step_Status) {
		this.step_Status = step_Status;
	}
	public String getStep_Serice_Type() {
		return step_Serice_Type;
	}
	public void setStep_Serice_Type(String step_Serice_Type) {
		this.step_Serice_Type = step_Serice_Type;
	}
	public String getStep_Service_Location() {
		return step_Service_Location;
	}
	public void setStep_Service_Location(String step_Service_Location) {
		this.step_Service_Location = step_Service_Location;
	}
	public boolean isShould_Be_Paused() {
		return should_Be_Paused;
	}
	public void setShould_Be_Paused(boolean should_Be_Paused) {
		this.should_Be_Paused = should_Be_Paused;
	}
	public String getData_Location() {
		return data_Location;
	}
	public void setData_Location(String data_Location) {
		this.data_Location = data_Location;
	}
	public String getLogs_Location() {
		return logs_Location;
	}
	public void setLogs_Location(String logs_Location) {
		this.logs_Location = logs_Location;
	}
	public String getInitiated_By() {
		return initiated_By;
	}
	public void setInitiated_By(String initiated_By) {
		this.initiated_By = initiated_By;
	}
	public Date getLast_Restart_TimeStamp() {
		return last_Restart_TimeStamp;
	}
	public void setLast_Restart_TimeStamp(Date last_Restart_TimeStamp) {
		this.last_Restart_TimeStamp = last_Restart_TimeStamp;
	}
	
	
	

}
