package com.zhm.db;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 链接数据库
 * 
 * @author ZhangHuanmeng
 *
 * 2017年8月31日
 */
public class DBConnect {
	
	public static SqlSession getSqlSession() throws IOException{
		//通过配置文件获得连接信息
		Reader reader=Resources.getResourceAsReader("com/zhm/config/Configuration.xml");
		//通过配置信息构建SqlSessionFactory
		SqlSessionFactory sqlSessionFacyory=new SqlSessionFactoryBuilder().build(reader);
		//通过sqlSessionFactory打开一个数据库会话
		SqlSession sqlSession=sqlSessionFacyory.openSession();
		return sqlSession;
	}
}
