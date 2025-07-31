package com.wipro.usermgmt.repo;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.wipro.usermgmt.dto.User;

@Repository
public class UserRepo {
	
	List<User> userList=new CopyOnWriteArrayList<>();
	
	public void save(User user)
	{
		userList.add(user);
	}
	
	public List<User> findAll()
	{
		return userList;
	}
	
	public User findByUserName(String userName)
	{
		Optional<User> user= userList.stream()
		.filter(u->u.getUserName().equalsIgnoreCase(userName))
		.findFirst();
		if(user.isEmpty())
		{
			return null;
		}
		else
		{
			return user.get();
		}
	}
	
	public void update(User user) {
		
		int i=0;
		for(User u:userList)
		{
			if(u.getId()==user.getId())
			{
				System.out.println("found");
				userList.set(i, user);
			}
			i++;
			
		}
		
	}
	
	public void delete(User user) {
		
		int i=0;
		for(User u:userList)
		{
			if(u.getId()==user.getId())
			{
				userList.remove(i);
			}
			i++;
			
		}
		
	}
	
	

}
