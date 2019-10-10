package cn.com.mybatis.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.Batch;
import cn.com.mybatis.po.BatchDetail;
import cn.com.mybatis.po.Customer;

public class CmsTest {
	DataConnection dataConnection = new DataConnection();
	
	@Test
	public void CmsTest() throws IOException {
		
		SqlSession sqlSession = dataConnection.getSqlSession();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-mm-dd");
		
		List<Customer> customer =  sqlSession.selectList("findUserAndProducts");
		for (Customer customer2 : customer) {
			
			System.out.println("---"+customer2.getAcno()+"---"+customer2.getCus_id()+"---"+customer2.getGender()+"---"+customer2.getUsername());
			
			List<Batch> batch = customer2.getBatchList();
			for (Batch batch2 : batch) {
				System.out.println("==="+batch2.getBatch_id()+"==="+batch2.getCus_id()+"==="+batch2.getNote()+"==="+batch2.getNumber()+"==="+	sdf.format(batch2.getCreatetime()));
				List<BatchDetail> batchDetail = batch2.getBatchDetail();
				for (BatchDetail batchDetail2 : batchDetail) {
					System.out.println("==="+batchDetail2.getBatch_id()+"==="+batchDetail2.getId()+"==="+batchDetail2.getProduct_id()+"==="+batchDetail2.getFinacialProduct().getDetail());
				}
			}
			
		}
	}
}
