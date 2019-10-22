package com.neuedu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.neuedu.dao.CourseDao;
import com.neuedu.dao.CourseDaoimpl;
import com.neuedu.dao.StudentDao;
import com.neuedu.dao.StudentDaoimpl;
import com.neuedu.entity.Course;
import com.neuedu.entity.Student;


public class Studentsys {
	
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {	
			
			System.out.println("----------欢迎登录学生管理系统---------------");
			System.out.println("1.登录 "+ '\t' +"2.退出");
			System.out.println("---------------------------------------------");
			Studentsys student = new Studentsys();
			student.login();
			student.studentManager();
		}
		
		//登录
		public void login()
		{
			System.out.println("请选择： ");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("欢迎登录！");
				System.out.println("请输入用户名：");
				String username = scanner.next();
				System.out.println("请输入密码：");
				String password = scanner.next();
				Admin admin = new Admin (username ,password);
				
				boolean Login  = Login (admin);
				if (Login == true) 
				{
					System.out.println("欢迎您"+username);
				}
				else {
					System.out.println("输入有误");
					login();
				}
				break;
			case 2:
				System.out.println("退出.....");
				exitsystem();
				break;
			default:
				System.out.println("输入有误，请重新输入：");
				Studentsys student = new Studentsys();
				student.login();
				break;
			}
			
		}
		public boolean Login(Admin admin1)
		{
				Admin admin2 = new Admin("admin","admin");
				if (admin2.username.equals(admin1.username)&&admin2.password.equals(admin1.password))
				{
					return true;
				}
				else {
					return false;
				}
			
		} 
		
		//退出
		public void exitsystem()
		{
			System.exit(0);
		}
		public void studentManager()
		{
			Studentsys studentsys = new Studentsys();
			System.out.println("*********************请选择要操作的信息对应的数字**********************");
			System.out.println("1.学生信息管理     2.学生课程管理      3.退出   ");
			int num3 = scanner.nextInt();
			switch (num3) {
			case 1:
				System.out.println("***********************************************************");
				System.out.println("*********************请选择要操作的信息对应的数字**********************");
				System.out.println("1.查看学生信息     2.添加学生信息      3.删除学生信息   4.修改学生信息      5.返回");
				System.out.println("***********************************************************");
				System.out.println("请选择：");
				int num = scanner.nextInt();
				switch (num) {
				case 1:
					System.out.println("*********************请选择要操作的信息对应的数字**********************");
					System.out.println("1.查看所有学生信息     2.根据id查询学生信息      3.根据学生id查询课程      4.返回上层");
					System.out.println("***********************************************************");
					System.out.println("请选择：");
					int num1 = scanner.nextInt();
					switch (num1) {
					// 查看所有学生
					case 1:
						List<Student> query = new StudentDaoimpl().Query();
						System.out.println(query);
						studentsys.studentManager();
						break;
					//根据学生id查询课程
					case 3:
						System.out.println("请输入学生id：");
						String stuid = scanner.next();
						List<String> course = new StudentDaoimpl().getCourse(stuid);
						System.out.println(course);
						studentsys.studentManager();
						break;
					case 4:
						studentsys.studentManager();
						break;
					default:
						break;
					}
					break;
					//添加学生信息
				case 2:	
						
						System.out.println("请输入学生id：");
						String stuId = scanner.next();
						System.out.println("请输入学生姓名：");
						String name = scanner.next();
						System.out.println("请输入学生年龄：");
						int age = scanner.nextInt();
						System.out.println("请输入学生性别：");
						String sex = scanner.next();
						Student stu5 = new Student(stuId,name,age,sex);
						new StudentDaoimpl().AddStudent(stu5);
						studentsys.studentManager();
						break;
					//删除学生信息
				case 3:
						System.out.println("请输入要删除学生的ID：");
						String stuid = scanner.next();
						new StudentDaoimpl().DelStudent(stuid);
						System.out.println("数据保存成功，返回上级目录.....");
						 Studentsys stu2 = new Studentsys();
						 stu2.studentManager();
						break;
					//修改学生信息
				case 4:
						System.out.println("请输入要修改学生的ID：");
						String stuid1 = scanner.next();
						System.out.println("请输入学生姓名：");
						String name1 = scanner.next();
						System.out.println("请输入学生年龄：");
						int age1= scanner.nextInt();
						System.out.println("请输入学生性别：");
						String sex1 = scanner.next();
						Student stu6 = new Student(stuid1, name1, age1, sex1);
						new StudentDaoimpl().UpdateStudent(stu6);
						System.out.println("数据保存成功，返回上级目录.....");
						studentsys.studentManager();
						break;
				case 5:
					studentsys.studentManager();
					break;
				default:
					System.out.println("输入有误，请重新输入：");
					studentsys.studentManager();
					break;
				}
				break;
			case 2:
				
				System.out.println("***********************************************************");
				System.out.println("*********************请选择要操作的信息对应的数字**********************");
				System.out.println("1.查看课程信息     2.添加课程信息      3.删除课程信息   4.修改课程信息      5.返回");
				System.out.println("***********************************************************");
				System.out.println("请选择：");
				int num4 = scanner.nextInt();
				switch (num4) {
				case 1:
					System.out.println("*********************请选择要操作的信息对应的数字**********************");
					System.out.println("1.查看所有课程    2.根据课程id查询学生          3.返回上层");
					System.out.println("***********************************************************");
					System.out.println("请选择：");
					int num1 = scanner.nextInt();
					switch (num1) {
					// 查看所有课程
					case 1:
						List<Course> query = new CourseDaoimpl().Query();
						System.out.println(query);
						studentsys.studentManager();
						break;
					//根据课程id查询学生
					case 2:
						System.out.println("请输入课程id：");
						int courseid = scanner.nextInt();
						List<String> course = new CourseDaoimpl().getStudent(courseid);
						System.out.println(course);
						studentsys.studentManager();
						break;
					case 3:
						studentsys.studentManager();
						break;
					default:
						break;
					}
					break;
				//添加课程
				case 2:
					System.out.println("请输入课程id：");
					int courseid = scanner.nextInt();
					System.out.println("请输入课程名：");
					String name = scanner.next();
					Course cou = new Course(courseid,name);
					new CourseDaoimpl().AddCourse(cou);
					studentsys.studentManager();
					break;
				//删除课程
				case 3:
					System.out.println("请输入要删除课程的ID：");
					int courseid1 = scanner.nextInt();
					new CourseDaoimpl().DelCourse(courseid1);
					System.out.println("数据保存成功，返回上级目录.....");
					studentsys.studentManager();
					break;
				//修改课程
				case 4:
					System.out.println("请输入要修改课程的ID：");
					int int4 = scanner.nextInt();
					System.out.println("请输入课程名：");
					String name1 = scanner.next();
					Course cou1 = new Course(int4,name1);
					new CourseDaoimpl().UpdateCourse(cou1);
					studentsys.studentManager();
					break;
				case 5:
					studentsys.studentManager();
					break;
				default:
					break;
				}
				break;
			case 3:
				exitsystem();
				break;
			default:
				break;
			}
			


		
		//添加学生
		//Student student = new Student("1","张三",16,"女");
		//sd.AddStudent(student);
		//删除学生
		//sd.DelStudent("1");
		//更新学生
		//sd.UpdateStudent(student);
		//查询学生
		//List<Student> query = sd.Query();
		//System.out.println(query);
		//通过id查询课程
		//List<String> course = sd.getCourse("stu1");
		//System.out.println(course);
		
		
		//添加
		//Course course1 = new Course(4,"php");
		//cd.AddCourse(course1);
		//删除
		//cd.DelCourse("4");
		//修改
		//cd.UpdateCourse(course1);
		//通过课程查询学生
		//List<String> student = cd.getStudent(1);
		//System.out.println(student);
	}
}
