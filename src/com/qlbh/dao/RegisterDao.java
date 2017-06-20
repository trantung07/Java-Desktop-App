package com.qlbh.dao;

import java.sql.*;

import com.qlbh.bean.Users;
import com.qlbh.config.DBUtilities;

public class RegisterDao {
	public  boolean insertNewUserInfo(Users user) throws SQLException {
        String queryInsert = String.format("INSERT INTO user(username,password,fullname,phone) VALUES ('%s','%s','%s','%s')",user.getUserName(),user.getPassWord(),user.getFullName(),user.getPhone());
        DBUtilities dbUtilities = new DBUtilities();
        Statement stm = dbUtilities.getConnection().createStatement();
        int rs = stm.executeUpdate(queryInsert);         
        if(rs ==1){
        	return true;
        }
        return false;
    }
}
