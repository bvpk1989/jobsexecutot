package com.infy.jobsExecutor;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.jobsExecutor.database.HibernateUtil;
import com.infy.jobsExecutor.service.JobsExecutorService;
public class AppMain { 
	
	
public static void main(String[] args)
	{	 
		
		Session session = HibernateUtil.getSession();
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"app-context.xml"});
		JobsExecutorService jed=(JobsExecutorService) context.getBean("jobsExecutorServiceImpl");
		jed.implFunction3_4_5();
		session.close();
	}
	
}
