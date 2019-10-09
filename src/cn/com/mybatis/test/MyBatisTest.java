package cn.com.mybatis.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.User;

public class MyBatisTest {
	public DataConnection dataConn = new DataConnection();
	@Test
	public void TestSelect() throws IOException{
		
		SqlSession sqlSession = dataConn.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", 1);
		System.out.println("===="+user.getId()+"===="+user.getCity()+"===="+user.getGender()+"====");
		System.out.println(user.getBirthday());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
//		
		
		
		User user22 = sqlSession.selectOne("test.findUserById", 1);
		System.out.println("===="+user22.getId()+"===="+user22.getCity()+"===="+user22.getGender()+"====");
		System.out.println(user22.getBirthday());
		System.out.println(user22.getPassword());
		System.out.println(user22.getEmail());
		
		User user2 = sqlSession.selectOne("test.findUserByName","��");
		System.out.println(user2.getId());
		System.out.println("-----");
		
		
		List<User> userList = sqlSession.selectList("test.findUserByProvince", "��");
		for (User user3 : userList) {
			System.out.println(user3.getUsername()+"==="+user3.getId()+"==="+user3.getBirthday());
		}
		
		System.out.println("-----");
		User user4 = new User();
		user4.setUsername("����");
		user4.setBirthday("19921010");
		user4.setCity("�人��");
		user4.setEmail("22234@hotmail.com");
		user4.setGender("��");
		user4.setPassword("555555");
		user4.setProvince("����ʡ");
//		sqlSession.insert("test.insertUser", user4);
//		sqlSession.commit();//�ǵ�commit
		List<User> userList4 = sqlSession.selectList("test.findUserByProvince", "��");
		
		for (User user3 : userList4) {
			System.out.println(user3.getUsername()+"==="+user3.getId()+"==="+user3.getBirthday());
		}
		
		System.out.println("-----");
//		User user5 = new User();
//		user5.setId(6);
//		user5.setUsername("���ذ�");
//		user5.setBirthday("19921110");
//		sqlSession.update("test.updateUser", user5);
//		sqlSession.commit();
		
		System.out.println("--ɾ��---");
		
		User user6 = new User();
		user6.setUsername("���ذ�");
//		sqlSession.delete("test.deleteByUserName", user6);
//		sqlSession.commit();
		sqlSession.close();
		
		
		
		
	}
}
