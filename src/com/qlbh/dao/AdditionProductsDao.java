package com.qlbh.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.qlbh.config.DBUtilities;
import com.qlbh.bean.Items;
import com.qlbh.bean.Products;

public class AdditionProductsDao {
	public boolean insertNewProduct(Products prd) throws SQLException{
		String insertProductsQuery = String.format("INSERT INTO product"
				+ "(id,p_name,cate_id,sell_price,funds_price,inventory,status) VALUES"
				+ "('%s','%s','%s','%s','%s','%s','%s')",prd.getProductID(),prd.getProductName(),prd.getCategoryID(),prd.getSellingPrice(),prd.getFundsPrice(),prd.getInventory(),prd.getStatus());
		DBUtilities dbUtilities = new DBUtilities();
		Statement stm1 = dbUtilities.getConnection().createStatement();
		
		int rs = stm1.executeUpdate(insertProductsQuery);
		if(rs ==1){
			return true;
		}
		return false;
	}
	public List<Items> getCategoryList() throws SQLException{
		String selectCategoryList = String.format("SELECT * FROM category");
		DBUtilities dbUtilities = new DBUtilities();
		Statement stm1 = dbUtilities.getConnection().createStatement();
		ResultSet rs = stm1.executeQuery(selectCategoryList);
		List<Items> items = new ArrayList<>();
        while(rs.next()){
			Items item = new Items();
        	item.setId(Integer.parseInt(rs.getString("id")));
        	item.setDescription(rs.getString("name"));        	
        	items.add(item);
        }
        return items;
	}
}
