package cn.com.mybatis.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.ShoppingCart;

public class ShoppingCartTest {
	public DataConnection dataConn = new DataConnection();
	@Test
	public void AssociationAndCollectionTest() throws IOException {
		SqlSession sqlSession = dataConn.getSqlSession();
		ShoppingCart shoppingCart = sqlSession.selectOne("queryShoppingCart", "уехЩ");
		System.out.println();
		System.out.println(shoppingCart.getUser().getEmail());
		sqlSession.close();
		
		
	}
}
