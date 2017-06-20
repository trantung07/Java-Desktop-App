package com.qlbh.dao;

import java.sql.*;

import com.qlbh.config.DBUtilities;

public class LoginDao {

	public  boolean getUserbyUsernamePassword(String userName, String passWord) throws SQLException {
        String statement = String.format("SELECT * FROM user WHERE username = '%s' AND password = '%s'",userName,passWord);
        DBUtilities dbUtilities = new DBUtilities();
        Statement stm = dbUtilities.getConnection().createStatement();
        ResultSet rs = stm.executeQuery(statement);
        boolean hasResult = rs.next();
        while(hasResult){
        	return true;
        }
        return false;
    }
}
