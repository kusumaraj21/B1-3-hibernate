package com.tns.Inhertence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR1")
public class Manager extends Employee {
	private static final long serialVersionUID=1L;
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}