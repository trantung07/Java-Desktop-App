package com.qlbh.config;

import java.sql.*;

public class DBUtilities {
	Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public DBUtilities() throws SQLException {
        try {
            connection = DriverManager.getConnection(Config.CONNECTION_URL, Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);

        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void ExecuteSQLStatement(String sql_stmt) {
        try {
            statement = connection.createStatement();

            statement.executeUpdate(sql_stmt);
        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra: " + ex.getMessage());
        }
    }
}
