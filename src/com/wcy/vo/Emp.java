package com.wcy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Integer empno;
	private String ename;
	private String job;
	private Date hireDate;
	private Double sal;
	private Double comm;
	private Emp mgr;
	private Dept dept;
	
	public Emp() {
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hireDate=" + hireDate + ", sal=" + sal
				+ ", comm=" + comm + ", mgr=" + mgr + ", dept=" + dept + "]";
	}

	public Emp getMgr() {
		return mgr;
	}

	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	

}
