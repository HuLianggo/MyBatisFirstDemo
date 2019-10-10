package cn.com.mybatis.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.mapper.CustmerMapper;
import cn.com.mybatis.po.Customer;

public class CustomerTest {
	
	DataConnection dataConnection = new DataConnection();
	@Test
	public void CustomerTest() throws IOException {
		SqlSession SqlSession = dataConnection.getSqlSession();
		try {
		CustmerMapper custmerMapper = SqlSession.getMapper(CustmerMapper.class);
			Customer customer = new Customer();
			customer.setCus_id(1);
			customer = custmerMapper.findCustmerById(customer);
			System.out.println(customer.getAcno());
			System.out.println("===========");
//			SqlSession.close();	
			
//			 SqlSession = dataConnection.getSqlSession();
			
			CustmerMapper custmerMapper2 = SqlSession.getMapper(CustmerMapper.class);
			Customer customer2 = new Customer();
			customer2.setCus_id(1);
			customer2 = custmerMapper2.findCustmerById(customer2);
			System.out.println(customer2.getAcno());
			SqlSession.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
