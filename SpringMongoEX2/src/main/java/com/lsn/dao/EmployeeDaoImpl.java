package com.lsn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.lsn.baen.Employee;
import com.mongodb.WriteResult;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final String COLLECTION = "Employee";
	 @Autowired
	 MongoTemplate mongoTemplate;
	public void create(Employee employee) {
		// TODO Auto-generated method stub
		if (employee != null) {
			   this.mongoTemplate.insert(employee, COLLECTION);
			  }
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		if (employee != null) {
			   this.mongoTemplate.save(employee, COLLECTION);
			  }
	}

	public int deleteById(int id) {
		// TODO Auto-generated method stub
		 Query query = new Query(Criteria.where("_id").is(id));
		  WriteResult result = this.mongoTemplate.remove(query, Employee.class,
		    COLLECTION);
		  return result.getN();
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(id));
		  return this.mongoTemplate.findOne(query, Employee.class, COLLECTION);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		 return (List<Employee>) mongoTemplate.findAll(Employee.class,
				    COLLECTION);
	}

}
