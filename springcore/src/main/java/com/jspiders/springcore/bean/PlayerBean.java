package com.jspiders.springcore.bean;

import lombok.Data;

@Data
public class PlayerBean {

	private int id;
	private String name;
	private TeamBean team;
}
