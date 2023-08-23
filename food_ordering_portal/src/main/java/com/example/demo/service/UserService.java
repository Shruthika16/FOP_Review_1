package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo ur;
	
	public User adduser(User u)
	{
		return ur.save(u);
	}
	public List<User> addusers(List<User> u)
	{
		return ur.saveAll(u);
	}
	public List<User> showusers()
	{
		return ur.findAll();
	}
	public User changeuser(User u)
	{
		return ur.saveAndFlush(u);
	}
	public void deleteuser(User u)
	{
		ur.delete(u);
	}
	public void deleteid(int id) 
	{
		ur.deleteById(id);
	}
	public void deletepid(int id) 
	{
		ur.deleteById(id);
	}
	public Optional<User> showbyid(int id)
	{
		return ur.findById(id);
	}
	public String updateinfobyid(int id,User ss) 
	{
		ur.saveAndFlush(ss);
		if(ur.existsById(id)) 
		{
			return "updated";
		}
		else 
		{
			return "enter valid id";
		}
	}
	
}
