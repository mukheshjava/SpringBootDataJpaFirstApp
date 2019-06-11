package com.app.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pId;
	private String pName;
	private Double cost;
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", cost=" + cost + "]";
	}
	public Product(Integer pId, String pName, Double cost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.cost = cost;
	}
	public Product(String pName, Double cost) {
		super();
		this.pName = pName;
		this.cost = cost;
	}
	public Product() {
		super();
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	 
	
}
