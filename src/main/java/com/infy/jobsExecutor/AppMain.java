package com.infy.jobsExecutor;

import org.hibernate.Session;

import com.infy.jobsExecutor.dao.JobsExecutorDao;
import com.infy.jobsExecutor.dao.impl.JobsExecutorDaoImpl;
import com.infy.jobsExecutor.database.HibernateUtil;;
public class AppMain { 
	
public static void main(String[] args)
	{	 
		
		Session session = HibernateUtil.getSession();
		JobsExecutorDao jed=new JobsExecutorDaoImpl();
		System.out.println(jed.getCountInProgressJobs());
		System.out.println("i am executing");
		session.close();
	}
	
}
