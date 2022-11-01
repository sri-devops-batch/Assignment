package com.skj.gtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skj.gtest.entity.AppUser;

@Service
public interface AppUserService {
	public List<AppUser> getAllUsers()throws Exception;
	public List<AppUser> getAllUsers(String role)throws Exception;
	public AppUser getUserByUserName(String username)throws Exception;
	public List<AppUser> getUsersConnections(String username)throws Exception;
	
}