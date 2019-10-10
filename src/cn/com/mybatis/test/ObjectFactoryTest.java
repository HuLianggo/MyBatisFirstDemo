package cn.com.mybatis.test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.ShoppingCart;

public class ObjectFactoryTest {
	public static DataConnection dataConn = new DataConnection(); 

	public static void main(String[] args) throws IOException {
		
		SqlSession sqlSession = dataConn.getSqlSession();
		CartObjectFactory e = new CartObjectFactory();
		
		List constructorArgTypes = new LinkedList();
		constructorArgTypes.add(int.class);
		constructorArgTypes.add(String.class);
		constructorArgTypes.add(int.class);
		constructorArgTypes.add(double.class);
		constructorArgTypes.add(double.class);
		List constructorArgs = new LinkedList();
		constructorArgs.add(1);
		constructorArgs.add("ddd");
		constructorArgs.add(12);
		constructorArgs.add(5.0);
		constructorArgs.add(0.0);
		
		ShoppingCart sCart = e.create(ShoppingCart.class, constructorArgTypes, constructorArgs);
		System.out.println(sCart.getTotalAmount());
		sqlSession.close();

	}

}
