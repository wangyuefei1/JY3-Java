package com.neuedu.pojo;

import java.io.Serializable;

import lombok.Data;
@Data
public class Province implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5758107387670450415L;
	private Integer id;
	private String pid;
	private String pname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", pid=" + pid + ", pname=" + pname + "]";
	}
	public Province(Integer id, String pid, String pname) {
		super();
		this.id = id;
		this.pid = pid;
		this.pname = pname;
	}
	public Province() {
		super();
	}
	
}
