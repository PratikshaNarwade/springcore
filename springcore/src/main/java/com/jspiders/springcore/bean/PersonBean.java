package com.jspiders.springcore.bean;

import lombok.Data;

@Data
public class PersonBean {
	
	private int id;
	private String name;
	private String address;
	private AadharCardBean aadharCard;
}
