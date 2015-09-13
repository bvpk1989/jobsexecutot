package com.infy.jobsExecutor.dao.impl;

import java.sql.Timestamp;
import java.util.List;






import org.hibernate.Criteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import com.infy.jobsExecutor.dao.JobDetailsDao;
import com.infy.jobsExecutor.database.HibernateUtil;
import com.infy.jobsExecutor.model.JobDetailsEntity;

public class JobDetailsDaoImpl implements JobDetailsDao{

	public List listOfJobsOrderByStepSeq(int jobId) {
		// TODO Auto-generated method stub
		Criteria criteria=HibernateUtil.getSession().createCriteria(JobDetailsEntity.class);
		criteria.add(Restrictions.eq("job_ID", jobId));
		criteria.addOrder(Property.forName("step_Sequence").asc() );
//		/JobsExecutorEntity jobsExeEnt=(JobsExecutorEntity)HibernateUtil.getSession().get(JobDetailsEntity.class, jobId);
//		jobsExeEnt.setStatus("In-Progress");
		return null;
	}

	public List listOfJobsOrderByStepSeqWithStaus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStepStatus(int JobsDetailsId,String stepStatus) {
		// TODO Auto-generated method stub
		JobDetailsEntity jobDetEnt=(JobDetailsEntity)HibernateUtil.getSession().get(JobDetailsEntity.class, JobsDetailsId);
	    jobDetEnt.setStep_Status(stepStatus);
	}

	public void updateStepStartTime(int JobsDetailsId,Timestamp step_Start_Time ) {
		// TODO Auto-generated method stub
		JobDetailsEntity jobDetEnt=(JobDetailsEntity)HibernateUtil.getSession().get(JobDetailsEntity.class, JobsDetailsId);
		jobDetEnt.setStep_Start_Time(step_Start_Time);
		
	}

	public void updateStepEndTime(int JobsDetailsId,Timestamp step_Ended_Time) {
		JobDetailsEntity jobDetEnt=(JobDetailsEntity)HibernateUtil.getSession().get(JobDetailsEntity.class, JobsDetailsId);
		jobDetEnt.setStep_Start_Time(step_Ended_Time);	
	}

	public List listOfJobsOrderByStepSeq() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
