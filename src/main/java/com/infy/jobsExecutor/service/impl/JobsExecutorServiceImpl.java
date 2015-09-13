package com.infy.jobsExecutor.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.jobsExecutor.dao.JobsExecutorDao;
import com.infy.jobsExecutor.model.JobsExecutorEntity;
import com.infy.jobsExecutor.service.JobsExecutorService;

@Service
public class JobsExecutorServiceImpl implements JobsExecutorService {
	@Autowired
	private JobsExecutorDao jobsExeDao;
	
	//private CollectionService CollectionService; 

	public void implFunction3_4_5() {
		List jobs = jobsExeDao.getListOfJobs();
		List<JobsExecutorEntity> fun2Jobs = jobsExeDao.fun2Impl();
		System.out.print(jobs);
		int jobsListCount = jobs.size();
		if (jobsListCount < THRESH_HOLD) {
			Iterator<JobsExecutorEntity> fun2JobsIterator = fun2Jobs.iterator();
			while (fun2JobsIterator.hasNext()) {
				JobsExecutorEntity jobsExeEnt = fun2JobsIterator.next();
				int jobId = jobsExeEnt.getJobs_id();
				int collectionId = jobsExeEnt.getCollection_id();
				Runnable r= new CollectionServiceImpl(jobId,collectionId);
				new Thread(r).start();
				System.out.print(jobId);
				//System.out.println(collectionId);
			}
			System.out.println("this procedure executing");

		} else {
			System.out.println("this procedure not executing");
		}
	}

}
