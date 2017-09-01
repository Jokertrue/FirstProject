package com.zhm.serviceimpl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.zhm.db.DBConnect;
import com.zhm.entity.User;
import com.zhm.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean userLogin(User u) {
		SqlSession sqlSession=null;
        try {
			sqlSession=DBConnect.getSqlSession();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean userAdd(User u) {

		return false;
	}

	@Override
	public boolean userDelete(int id) {

		return false;
	}

}
