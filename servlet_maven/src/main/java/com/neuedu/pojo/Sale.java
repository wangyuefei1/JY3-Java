package com.neuedu.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sale implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2407009905563739402L;
	private Integer id;
	private String name;
	private Integer num;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Sale [id=" + id + ", name=" + name + ", num=" + num + "]";
	}
	public Sale(Integer id, String name, Integer num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	public Sale() {
		super();
	}
	
}
