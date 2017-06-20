package com.qlbh.bean;

public class Products {
	private String pID;
	private String pName;
	private int cateID;
	private Double sellPrice;
	private Double fundsPrice;
	private Double inventory;
	private int status;
	private String cateName;
	public Products(){
		
	}
	
	public void setProductID(String pID) {
		this.pID = pID;
	}
	public String getProductID() {
		return pID;
	}
	
	public void setProductName(String pName) {
		this.pName = pName;
	}
	public String getProductName() {
		return pName;
	}

	public void setCategoryName(String cateName) {
		this.cateName = cateName;
	}
	public String getCategoryName() {
		return cateName;
	}
	
	public void setCategoryID(int cateID) {
		this.cateID = cateID;
	}
	public int getCategoryID() {
		return cateID;
	}
	
	public void setSellingPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public Double getSellingPrice() {
		return sellPrice;
	}
	
	public void setFundsPrice(Double fundsPrice) {
		this.fundsPrice = fundsPrice;
	}
	public Double getFundsPrice() {
		return fundsPrice;
	}

	public void setInventory(Double inventory) {
		this.inventory = inventory;
	}
	public Double getInventory() {
		return inventory;
	}
	
	public void setStatus(Boolean status){
		if(status ==  true){
			this.status = 1;
		}else{
			this.status = 0;
		}
	}
	public int getStatus(){
		return status;		
	}
}
