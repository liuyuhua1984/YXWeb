package com.gamecenter.model;

import java.io.Serializable;

public class TUserKey implements Serializable {
	private Integer id;
	
	private String name;
	
	private static final long serialVersionUID = 1L;
	
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
		this.name = name == null ? null : name.trim();
	}
	
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		TUserKey other = (TUserKey) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		return result;
	}
}