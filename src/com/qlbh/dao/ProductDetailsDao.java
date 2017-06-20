package com.qlbh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.qlbh.bean.Products;
import com.qlbh.config.DBUtilities;

public class ProductDetailsDao {
	public List<Products> getOneProductInfo(String id) throws SQLException{
		String selectOneProductQuery = String.format("SELECT * FROM product WHERE id ='%s'",id);
		DBUtilities dbUtilities = new DBUtilities();
		Statement stm1 = dbUtilities.getConnection().createStatement();
		ResultSet rs = stm1.executeQuery(selectOneProductQuery);
		List<Products> products = new ArrayList<>();
        while(rs.next()){
        	Products product = new Products();
        	product.setProductID(rs.getString("id"));
        	product.setProductName(rs.getString("p_name"));
        	product.setSellingPrice(Double.parseDouble(rs.getString("sell_price")));
        	product.setFundsPrice(Double.parseDouble(rs.getString("funds_price")));
        	product.setInventory(Double.parseDouble(rs.getString("inventory")));
        	products.add(product);
        }
        return products;
	}
	
	public boolean deleteProduct(Products product) throws SQLException{
		String deleteProductQuery = String.format("DELETE FROM product WHERE id ='%s'",product.getProductID());
		DBUtilities dbUtilities = new DBUtilities();
		Statement stm2 = dbUtilities.getConnection().createStatement();
		int rs = stm2.executeUpdate(deleteProductQuery);
		if(rs ==1){
        	return true;
        }
        return false;
	}
	
	public boolean updateProduct(Products product) throws SQLException{
		String updateProductQuery = String.format("UPDATE product SET cate_id = '%s', sell_price = '%s', funds_price = '%s',"
				+ " inventory = '%s' WHERE id= '%s'",product.getCategoryID(),product.getSellingPrice(),product.getFundsPrice(),product.getInventory(),product.getProductID());
		DBUtilities dbUtilities = new DBUtilities();
		Statement stm3 = dbUtilities.getConnection().createStatement();
		int rs = stm3.executeUpdate(updateProductQuery);
		if(rs ==1){
        	return true;
        }
        return false;
	}
}
