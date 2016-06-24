package com.jd.im.rest;

import java.io.Serializable;

/**
 * Hello world!
 *
 */
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= -7008583564130452039L;
	private Integer id = 1;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
