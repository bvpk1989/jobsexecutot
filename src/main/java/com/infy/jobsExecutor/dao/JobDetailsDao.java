package com.infy.jobsExecutor.dao;

import java.sql.Timestamp;
import java.util.List;

public interface JobDetailsDao {

List listOfJobsOrderByStepSeq();
List listOfJobsOrderByStepSeqWithStaus();
void updateStepStatus(int jobDetailsId,String stepStatus);
void updateStepStartTime(int jobDetailsId,Timestamp date_Time_Started);
void updateStepEndTime(int jobDetailsId,Timestamp date_Time_Started);

	
}
