package com.neuedu.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Area implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1765271758788967637L;
	private Integer id;
	private String aid;
	private String aname;
	private String cid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", aid=" + aid + ", aname=" + aname + ", cid=" + cid + "]";
	}
	public Area(Integer id, String aid, String aname, String cid) {
		super();
		this.id = id;
		this.aid = aid;
		this.aname = aname;
		this.cid = cid;
	}
	public Area() {
		super();
	}
	
}
