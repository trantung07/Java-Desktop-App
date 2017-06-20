package com.qlbh.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.qlbh.bean.Products;
import com.qlbh.config.DBUtilities;

public class GoodsDao {
	public List<Products> getProductInfo() throws SQLException{
		String selectAllProductQuery = "SELECT * FROM product";
		DBUtilities dbUtilities = new DBUtilities();
		Statement stm1 = dbUtilities.getConnection().createStatement();
		ResultSet rs = stm1.executeQuery(selectAllProductQuery);
		List<Products> products = new ArrayList<>();
        while(rs.next()){
        	Products product = new Products();
        	product.setProductID(rs.getString("id"));
        	product.setProductName(rs.getString("p_name"));
        	product.setSellingPrice(Double.parseDouble(rs.getString("sell_price")));
        	product.setFundsPrice(Double.parseDouble(rs.getString("funds_price")));
        	product.setInventory(Double.parseDouble(rs.getString("inventory")));
        	product.setCategoryID(Integer.parseInt(rs.getString("cate_id")));
        	products.add(product);
        }
        return products;
	}
}
