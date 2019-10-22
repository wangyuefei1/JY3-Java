package com.neuedu.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.neuedu.entity.Student;

public class StudentDaoimpl implements StudentDao {
	
	
	private static Properties prop;
	static
	{
		prop = new Properties();
		try {
			prop.load(StudentDaoimpl.class.getResourceAsStream("/mysql.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	@Override
	public void AddStudent(Student student) {
		String sql = "INSERT INTO student VALUES (?,?,?,?) ";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			ps.setString(1, student.getStuId());
			ps.setString(2, student.getStuName());
			ps.setInt(3, student.getStuAge());
			ps.setString(4, student.getStuSex());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void DelStudent(String stuId) {
		String sql = "Delete From student Where stuId = ? ";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			ps.setString(1, stuId);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void UpdateStudent(Student student) {
		String sql = "UPDATE student set stuName = ?,stuAge = ?,stuSex = ? where stuId = ? ";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			
			ps.setString(1, student.getStuName());
			ps.setInt(2, student.getStuAge());
			ps.setString(3, student.getStuSex());
			ps.setString(4, student.getStuId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> Query() {
		List<Student> student = new ArrayList<Student>();
		String sql = "SELECT * FROM student";
		try(Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet  rs = ps.executeQuery();)
		{
			while (rs.next()) {
				String str1 = rs.getString("stuId");
				String str2 = rs.getString("stuName");
				int int1 = rs.getInt("stuAge");
				String str3 = rs.getString("stuSex");
				Student student2 = new Student(str1,str2,int1,str3);
				student.add(student2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public Student getStudent(String s_id) {
		return null;
	}
	@Override
	public List<String> getCourse(String stuId) {
		List<String> course = new  ArrayList<String>();
		String sql = "SELECT courseName FROM studentcou join course on studentcou.c_id = course.courseid where s_id = ?";
		try(Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps = con.prepareStatement(sql);)
		{
			ps.setString(1, stuId);
			ResultSet  rs = ps.executeQuery();
			while (rs.next()) {
				String string = rs.getString("courseName");
				course.add(string);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return course;
	}

}
