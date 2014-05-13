package com.lct.furniture.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lct.furniture.persistence.model.Customers;
 
@Repository
@Transactional
@SuppressWarnings({"unchecked","rawtypes"})
public class CustomerDao implements ICustomerDao {
	    @Autowired
	    private SessionFactory sessionFactory;
		 
	
	    
	    public List<Customers>  loadCustomers(int start,int maxSize) {
	        return   this.sessionFactory.getCurrentSession()
	                .createQuery("from Customers")
	                .setFirstResult(start)
	                .setMaxResults(maxSize)
	                .list();
	    }
	    
	   
	    /*public Collection loadProductsByCategory(String category) {
	        return this.sessionFactory.getCurrentSession()
	                .createQuery("from test.Product product where product.category=?")
	                .setParameter(0, category)
	                .list();
	    }*/
	}
	
