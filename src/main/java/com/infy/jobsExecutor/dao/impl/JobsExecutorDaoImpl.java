package com.infy.jobsExecutor.dao.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;






import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.infy.jobsExecutor.dao.JobsExecutorDao;
import com.infy.jobsExecutor.dao.impl.AbstractDaoImpl;
import com.infy.jobsExecutor.database.HibernateUtil;
import com.infy.jobsExecutor.model.JobsExecutorEntity;

@Repository
public class JobsExecutorDaoImpl  extends AbstractDaoImpl implements JobsExecutorDao{
    
	public int getCountInProgressJobs() {
		Criteria criteria = HibernateUtil.getSession().createCriteria(JobsExecutorEntity.class);
		criteria.add(Restrictions.eq("status", "In-Progress"));
		List results = criteria.list();
		return results.size();
	}

	//fun-2 
	public List fun2Impl() {
		Criteria criteria = HibernateUtil.getSession().createCriteria(JobsExecutorEntity.class);
		criteria.add(Restrictions.ne("status", "In-Progress"));
		criteria.add(Restrictions.ne("status", "completed"));
		criteria.add(Restrictions.isNotNull("collection_id"));
		List results = criteria.list();
		return results;
	}

	//update in-progress where
	public void upadateInProgress(int jobId){
		
		JobsExecutorEntity jobsExeEnt=(JobsExecutorEntity)HibernateUtil.getSession().get(JobsExecutorEntity.class, jobId);
		jobsExeEnt.setStatus("In-Progress");
		
	}
	public List getListOfJobs(){
		Criteria criteria=HibernateUtil.getSession().createCriteria(JobsExecutorEntity.class);
		return criteria.list();
	}

	public void JobsUpdateStepStatus(int jobId) {
		// TODO Auto-generated method stub
		JobsExecutorEntity jobsExeEnt=(JobsExecutorEntity)HibernateUtil.getSession().get(JobsExecutorEntity.class, jobId);
		jobsExeEnt.setStatus("Paused");
		
	}

	public void jobsDateTimeCompleted(int jobId ,Timestamp date_Time_Completed ) {
		// TODO Auto-generated method stub
		JobsExecutorEntity jobsExeEnt=(JobsExecutorEntity)HibernateUtil.getSession().get(JobsExecutorEntity.class, jobId);
		
	   // Timestamp date_Time_Completed;
	  //  Calendar cal=Calendar.getInstance();
	//	date_Time_Completed=new Timestamp(cal.getTimeInMillis());
		jobsExeEnt.setDate_Time_Completed(date_Time_Completed);
		
	}

}
