package com.neuedu.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4903694998268643490L;
	private Integer id;
	private String aname;
	private String apwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApwd() {
		return apwd;
	}
	public void setApwd(String apwd) {
		this.apwd = apwd;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", aname=" + aname + ", apwd=" + apwd + "]";
	}
	public Admin(Integer id, String aname, String apwd) {
		super();
		this.id = id;
		this.aname = aname;
		this.apwd = apwd;
	}
	public Admin() {
		super();
	}
	
}
