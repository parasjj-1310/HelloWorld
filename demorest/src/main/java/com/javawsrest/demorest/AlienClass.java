package com.javawsrest.demorest;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class AlienClass {
	
	private String name;
	private int age;
	private String status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AlienClass [name=" + name + ", age=" + age + ", status=" + status + "]";
	}
	
	

}
