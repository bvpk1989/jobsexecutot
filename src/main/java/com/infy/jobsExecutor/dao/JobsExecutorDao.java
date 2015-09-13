package com.infy.jobsExecutor.dao;

import java.util.List;

public interface JobsExecutorDao {
	public static final int THRESH_HOLD=Runtime.getRuntime().availableProcessors()*10;
	int getCountInProgressJobs();
	List fun2Impl();	
	List getListOfJobs();
	void JobsUpdateStepStatus(int jobId);
	void jobsDateTimeCompleted(int jobId);
}
