package com.cyc.cloneTest;

import org.junit.Test;

import model.User;

public class TestClone {
	
	@Test
	public void test1() {
		
		User user = new User();
		user.setAge(2);
		user.setName("张三");
		System.out.println("user:"+user);
		
		User user2 = null;
		try {
			user2 = user;/*(User) user.clone();*/
			user.setName("李四");
			user.setAge(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("user2:"+user2);
		System.out.println(user==user2);
		System.out.println("user.getName:"+user.getName());
		System.out.println("user2.getName:"+user2.getName());
		String haString = "张三";
		System.out.println("haString："+haString.hashCode());
		
		System.out.println("user.getName==user2.getName?"+user.getName()==user2.getName());
		System.out.println("user.getAge==user2.getAge?"+user.getAge()+user2.getAge()+(user.getAge() == user2.getAge()));

	}
}
