package com.skj.gtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skj.gtest.dao.AppUserDAO;
import com.skj.gtest.entity.AppUser;


@Service
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	AppUserDAO userDao;
	
	@Override
	public List<AppUser> getAllUsers() throws Exception {
		
		// may contains other code like security , loggging , validation 
		
		return userDao.getAllUsers();
	}

	@Override
	public List<AppUser> getAllUsers(String role) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser getUserByUserName(String username) throws Exception {
		// validation , security 
		
		return userDao.getUserByUserName(username);
	}

	@Override
	public List<AppUser> getUsersConnections(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}