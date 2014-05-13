package com.lct.furniture.dao;

import java.util.Collection;
import java.util.List;

import com.lct.furniture.persistence.model.Customers;
@SuppressWarnings("rawtypes")
public interface ICustomerDao {
	 
	List loadCustomers(int start,int max);
}
