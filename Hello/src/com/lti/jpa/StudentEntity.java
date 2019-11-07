package com.lti.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity{

	@Id
	private int s_id;
	private String s_name;
	private int s_age;
	public StudentEntity(int s_id,String s_name,int s_age)
	{
		super();
		this.s_id=s_id;
		this.s_name=s_name;
		this.s_age=s_age;
		
	}
	public StudentEntity(){
		
       super();
}
	/**
	 * @return the s_id
	 */
	public int getS_id() {
		return s_id;
	}
	/**
	 * @param s_id the s_id to set
	 */
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	/**
	 * @return the s_name
	 */
	public String getS_name() {
		return s_name;
	}
	/**
	 * @param s_name the s_name to set
	 */
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	/**
	 * @return the s_age
	 */
	public int getS_age() {
		return s_age;
	}
	/**
	 * @param s_age the s_age to set
	 */
	public void setS_age(int s_age) {
		this.s_age = s_age;
	}
}
	
