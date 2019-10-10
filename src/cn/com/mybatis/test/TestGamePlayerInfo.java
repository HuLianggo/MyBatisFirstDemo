package cn.com.mybatis.test;

import java.io.IOException;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.GamePlayer;

public class TestGamePlayerInfo {
	DataConnection dataConn = new DataConnection();
	@Test
	public void TestGamePlayerInfo() throws IOException {
		SqlSession sqlSession = dataConn.getSqlSession();
		
		GamePlayer gamePlayer = sqlSession.selectOne("queryWarriorGamePlayer", 1);
		
		System.out.println(gamePlayer.getName()+"===="+gamePlayer.getGender()+"===="+gamePlayer.getP_type().get("svalue")+"===="+gamePlayer.getP_type().get("power")+"==="+gamePlayer.getPtype());
		
		Map map = gamePlayer.getP_type();
		System.out.println(map.get("svalue"));
		System.out.println(map.get("power"));
	}
















































































































}
