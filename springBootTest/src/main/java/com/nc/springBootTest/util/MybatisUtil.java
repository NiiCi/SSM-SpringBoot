package com.nc.springBootTest.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MybatisUtil {
	public static SqlSession getSession(){
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				//2. build SqlSessionFactory	
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				//3. a SqlSession from SqlSessionFactory
				SqlSession session = sqlSessionFactory.openSession(true);
				return session;
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
}