package com.infy.jobsExecutor.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import com.infy.jobsExecutor.database.QueryParams;

public interface AbstractDao {
	
	@Transactional
	public void executeByNamedQuery(String hqlQuery,QueryParams... params);
	
}