package com.lct.furniture.dao;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TimeZone;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lct.furniture.persistence.model.Customers;
 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:META-INF/spring/applicationContext.xml")
@ActiveProfiles("dev")
public class CustomerDaoTest {
	@Autowired
	public ICustomerDao customers;
	 
	@Test
    public void testLoadCustomers() throws Exception {
		List<Customers> custList=  customers.loadCustomers();
	 	assertThat(custList,hasSize(50));
       
      
    }
}
