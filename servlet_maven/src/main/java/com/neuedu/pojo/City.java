package com.neuedu.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class City implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 189675967867772402L;
	private Integer id;
	private String cid;
	private String cname;
	private String pid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cid=" + cid + ", cname=" + cname + ", pid=" + pid + "]";
	}
	public City(Integer id, String cid, String cname, String pid) {
		super();
		this.id = id;
		this.cid = cid;
		this.cname = cname;
		this.pid = pid;
	}
	public City() {
		super();
	}
	
}
