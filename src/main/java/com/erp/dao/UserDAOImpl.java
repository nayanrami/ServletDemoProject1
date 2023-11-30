package com.erp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.erp.model.User;

public class UserDAOImpl {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public UserDAOImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp_db", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean save(User user) {
		try {
			String query_login = "INSERT INTO login_tbl values(?,?)";
			preparedStatement = connection.prepareStatement(query_login);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());

			preparedStatement.execute();

			String query_user_info = "INSERT INTO user_info_tbl values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query_user_info);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getFirstname());
			preparedStatement.setString(3, user.getLastname());
			preparedStatement.setString(4, user.getEmail());

			preparedStatement.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean authenticate(String username, String password) {
		try {
			String query = "SELECT * FROM login_tbl where username = ? and password = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
