package com.zhm.db;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * 测试数据库能否连接
 * 
 * @author ZhangHuanmeng
 *
 * 2017年8月31日
 */
public class DBTest {

	@Test
	public void testSqlSession(){
		SqlSession s=null;
		try {
		    s=DBConnect.getSqlSession();
			if(s!=null){
				System.out.println("666666");
				System.out.println(s);
			}else{
				System.out.println("shut down");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
