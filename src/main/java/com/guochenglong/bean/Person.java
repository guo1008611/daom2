package com.guochenglong.bean;

import java.util.Date;

/** 

* @author 作者 郭成龙: 

* @version 创建时间：2019年6月17日 上午9:33:34 

* 类说明 :

*/
public class Person {

	//里面有姓名(name)、年龄(age)、介绍(about)、注册日期(created)，
	private int id;
	private String name;
	private int age;
	private String about;
	
	private Date Date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	

	
	public Person(int id, String name, int age, String about, String created, java.util.Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.about = about;
		
		Date = date;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", about=" + about + ", Date=" + Date + "]";
	}

	

	
	
}
