package com.zhidi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String name;
	
	private String sex;
	
	private Integer age;
	/*@DateTimeFormat(pattern="yyyy-MM-dd")*/
	private Date birthday;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
	
	
	
}
