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

import com.neuedu.entity.Course;


public class CourseDaoimpl implements CourseDao {

	private static Properties prop;
	static
	{
		prop = new Properties();
		try {
			prop.load(CourseDaoimpl.class.getResourceAsStream("/mysql.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	@Override
	public void AddCourse(Course course) {
		String sql = "INSERT INTO course VALUES (?,?) ";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			ps.setInt(1, course.getCourseId());
			ps.setString(2, course.getCourseName());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void DelCourse(int courseid) {
		String sql = "Delete From course Where courseid = ? ";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			ps.setInt(1,courseid);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void UpdateCourse(Course course) {
		String sql = "UPDATE course set courseName = ? where courseid = ? ";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			
			ps.setString(1, course.getCourseName());
			ps.setInt(2,course.getCourseId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<String> getStudent(int courseId) {
		List<String> student = new  ArrayList<String>();
		String sql = "SELECT stuName FROM studentcou JOIN student ON  studentcou.s_id = student.stuId WHERE c_id = ?";
		try(Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps = con.prepareStatement(sql);)
		{
			ps.setInt(1, courseId);
			ResultSet  rs = ps.executeQuery();
			while (rs.next()) {
				String string = rs.getString("stuName");
				student.add(string);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}
	
	
	//添加选择这门课的学生
	public void AddStudentbyCourseid(int courseId,String s_id)
	{
		String sql = "INSERT INTO studentcou(s_id,c_id) VALUES(?,?)";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			ps.setInt(1, courseId);
			ps.setString(2, s_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Course> Query() {
		List<Course> course = new ArrayList<>();
		String sql = "SELECT * FROM course";
		try(Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet  rs = ps.executeQuery();)
		{
			while (rs.next()) {
				int int1= rs.getInt("courseid");
				String str2 = rs.getString("courseName");
				Course course2 = new Course(int1,str2);
				course.add(course2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return course;
	}

}
