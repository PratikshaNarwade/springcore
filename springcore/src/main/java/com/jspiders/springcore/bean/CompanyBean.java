package com.jspiders.springcore.bean;

import java.util.List;

import lombok.Data;

@Data
public class CompanyBean {
	
	private int id;
	private String name;
	private String address;
	private List<EmployeeBean> employees; 

}
