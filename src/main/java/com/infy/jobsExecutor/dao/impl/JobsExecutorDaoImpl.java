package com.infy.jobsExecutor.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import com.infy.jobsExecutor.dao.JobsExecutorDao;
import com.infy.jobsExecutor.dao.impl.AbstractDaoImpl;
import com.infy.jobsExecutor.database.HibernateUtil;
import com.infy.jobsExecutor.model.JobsExecutorEntity;

public class JobsExecutorDaoImpl  extends AbstractDaoImpl implements JobsExecutorDao{
    
	public int getCountInProgressJobs() {
		Criteria criteria = HibernateUtil.getSession().createCriteria(JobsExecutorEntity.class);
		criteria.add(Restrictions.eq("status", "in_progress"));
		List results = criteria.list();
		return results.size();
	}

	//fun-2 
	public int getCountCondition() {
		Criteria criteria = HibernateUtil.getSession().createCriteria(JobsExecutorEntity.class);
		criteria.add(Restrictions.ne("status", "in_progress"));
		criteria.add(Restrictions.ne("status", "completed"));
		criteria.add(Restrictions.isNotNull("collection_id"));
		List results = criteria.list();
		return results.size();
	}

}
