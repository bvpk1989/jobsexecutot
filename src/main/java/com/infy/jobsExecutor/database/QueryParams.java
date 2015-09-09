package com.infy.jobsExecutor.database;

public class QueryParams {
	
	private String parameterName;
	private Object value;	
	
	
	
	public QueryParams(String parameterName, Object value) {		
		this.parameterName = parameterName;
		this.value = value;
	}
	public String getParameterName() {
		return parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	
	
	
	
	
}


