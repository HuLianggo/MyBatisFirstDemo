package cn.com.mybatis.mapper;

import cn.com.mybatis.po.Customer;

public interface CustmerMapper {
	public  Customer findCustmerById(Customer customer)throws Exception;
}
