package com.infy.jobsExecutor.dao.impl;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import com.infy.jobsExecutor.dao.AbstractDao;
import com.infy.jobsExecutor.database.QueryParams;
import com.infy.jobsExecutor.database.HibernateUtil;
public class AbstractDaoImpl implements AbstractDao{
		@Transactional
		public void executeByNamedQuery(String hqlQuery,QueryParams... params){
			Session hibernateSession = this.getCurrentSession();
			Query query = hibernateSession.getNamedQuery(hqlQuery);
			
			for (QueryParams param : params) {
		        
				if(param.getValue() instanceof List){
					List list=(ArrayList)param.getValue();
					query.setParameterList(param.getParameterName(),list);
				}else{
					query.setParameter(param.getParameterName(),param.getValue());
				}
		    }		
			
			query.executeUpdate();
			
		}
	  protected final Session getCurrentSession() {
			return HibernateUtil.getSession();
		}

}
