package com.infy.jobsExecutor.dao;

public interface JobsExecutorDao {
	public static final int THRESH_HOLD=Runtime.getRuntime().availableProcessors()*10;
	int getCountInProgressJobs();
	int getCountCondition();	
}
