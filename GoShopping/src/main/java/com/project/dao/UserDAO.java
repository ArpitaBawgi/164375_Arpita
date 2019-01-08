package com.project.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.project.mapper.UserMapper;
import com.project.pojo.User;

public class UserDAO {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addUser(int id, String username, String password) {

		String sqlQuery = "insert into userTable values(" + id + ",'" + username + "','" + password + "')";

		return jdbcTemplate.update(sqlQuery);

	}

	public int remove(int userId) {
		String sqlRemove = null;
		sqlRemove = "delete from userTable where id=" + userId;
		return jdbcTemplate.update(sqlRemove);
	}

	public int update(int userId, String password) {

		String sqlUpdate = null;
		sqlUpdate = "update userTable set password='" + password + "' where id=" + userId;
		return jdbcTemplate.update(sqlUpdate);
	}

	public int getUser(int userId) {

		String sqlGetUser = null;
//select * from table where id=15
		sqlGetUser = "select * from userTable where id='" + userId + " ' " ;
		//sqlGetUser = "select * from userTable'"+ "'where id= ' " + userId + ' ;
		List<User> user = jdbcTemplate.query(sqlGetUser, new UserMapper());

		return jdbcTemplate.update(sqlGetUser);
	}

	public List<User> getAllUsers() {
		String sqlGetAllUsers;
		sqlGetAllUsers = "select * from userTable";
		List<User> user = jdbcTemplate.query(sqlGetAllUsers, new UserMapper());

		return user;
	}
}
