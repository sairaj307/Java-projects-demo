package com.tnsif.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student{
	@Id
	private int sid;
	
	@Column(name="sname")
	private String sname;
	public Student() {
		
	}
	
	public Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + "]";
	}
}
