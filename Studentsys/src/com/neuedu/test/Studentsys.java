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
			
			System.out.println("----------��ӭ��¼ѧ������ϵͳ---------------");
			System.out.println("1.��¼ "+ '\t' +"2.�˳�");
			System.out.println("---------------------------------------------");
			Studentsys student = new Studentsys();
			student.login();
			student.studentManager();
		}
		
		//��¼
		public void login()
		{
			System.out.println("��ѡ�� ");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("��ӭ��¼��");
				System.out.println("�������û�����");
				String username = scanner.next();
				System.out.println("���������룺");
				String password = scanner.next();
				Admin admin = new Admin (username ,password);
				
				boolean Login  = Login (admin);
				if (Login == true) 
				{
					System.out.println("��ӭ��"+username);
				}
				else {
					System.out.println("��������");
					login();
				}
				break;
			case 2:
				System.out.println("�˳�.....");
				exitsystem();
				break;
			default:
				System.out.println("�����������������룺");
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
		
		//�˳�
		public void exitsystem()
		{
			System.exit(0);
		}
		public void studentManager()
		{
			Studentsys studentsys = new Studentsys();
			System.out.println("*********************��ѡ��Ҫ��������Ϣ��Ӧ������**********************");
			System.out.println("1.ѧ����Ϣ����     2.ѧ���γ̹���      3.�˳�   ");
			int num3 = scanner.nextInt();
			switch (num3) {
			case 1:
				System.out.println("***********************************************************");
				System.out.println("*********************��ѡ��Ҫ��������Ϣ��Ӧ������**********************");
				System.out.println("1.�鿴ѧ����Ϣ     2.���ѧ����Ϣ      3.ɾ��ѧ����Ϣ   4.�޸�ѧ����Ϣ      5.����");
				System.out.println("***********************************************************");
				System.out.println("��ѡ��");
				int num = scanner.nextInt();
				switch (num) {
				case 1:
					System.out.println("*********************��ѡ��Ҫ��������Ϣ��Ӧ������**********************");
					System.out.println("1.�鿴����ѧ����Ϣ     2.����id��ѯѧ����Ϣ      3.����ѧ��id��ѯ�γ�      4.�����ϲ�");
					System.out.println("***********************************************************");
					System.out.println("��ѡ��");
					int num1 = scanner.nextInt();
					switch (num1) {
					// �鿴����ѧ��
					case 1:
						List<Student> query = new StudentDaoimpl().Query();
						System.out.println(query);
						studentsys.studentManager();
						break;
					//����ѧ��id��ѯ�γ�
					case 3:
						System.out.println("������ѧ��id��");
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
					//���ѧ����Ϣ
				case 2:	
						
						System.out.println("������ѧ��id��");
						String stuId = scanner.next();
						System.out.println("������ѧ��������");
						String name = scanner.next();
						System.out.println("������ѧ�����䣺");
						int age = scanner.nextInt();
						System.out.println("������ѧ���Ա�");
						String sex = scanner.next();
						Student stu5 = new Student(stuId,name,age,sex);
						new StudentDaoimpl().AddStudent(stu5);
						studentsys.studentManager();
						break;
					//ɾ��ѧ����Ϣ
				case 3:
						System.out.println("������Ҫɾ��ѧ����ID��");
						String stuid = scanner.next();
						new StudentDaoimpl().DelStudent(stuid);
						System.out.println("���ݱ���ɹ��������ϼ�Ŀ¼.....");
						 Studentsys stu2 = new Studentsys();
						 stu2.studentManager();
						break;
					//�޸�ѧ����Ϣ
				case 4:
						System.out.println("������Ҫ�޸�ѧ����ID��");
						String stuid1 = scanner.next();
						System.out.println("������ѧ��������");
						String name1 = scanner.next();
						System.out.println("������ѧ�����䣺");
						int age1= scanner.nextInt();
						System.out.println("������ѧ���Ա�");
						String sex1 = scanner.next();
						Student stu6 = new Student(stuid1, name1, age1, sex1);
						new StudentDaoimpl().UpdateStudent(stu6);
						System.out.println("���ݱ���ɹ��������ϼ�Ŀ¼.....");
						studentsys.studentManager();
						break;
				case 5:
					studentsys.studentManager();
					break;
				default:
					System.out.println("�����������������룺");
					studentsys.studentManager();
					break;
				}
				break;
			case 2:
				
				System.out.println("***********************************************************");
				System.out.println("*********************��ѡ��Ҫ��������Ϣ��Ӧ������**********************");
				System.out.println("1.�鿴�γ���Ϣ     2.��ӿγ���Ϣ      3.ɾ���γ���Ϣ   4.�޸Ŀγ���Ϣ      5.����");
				System.out.println("***********************************************************");
				System.out.println("��ѡ��");
				int num4 = scanner.nextInt();
				switch (num4) {
				case 1:
					System.out.println("*********************��ѡ��Ҫ��������Ϣ��Ӧ������**********************");
					System.out.println("1.�鿴���пγ�    2.���ݿγ�id��ѯѧ��          3.�����ϲ�");
					System.out.println("***********************************************************");
					System.out.println("��ѡ��");
					int num1 = scanner.nextInt();
					switch (num1) {
					// �鿴���пγ�
					case 1:
						List<Course> query = new CourseDaoimpl().Query();
						System.out.println(query);
						studentsys.studentManager();
						break;
					//���ݿγ�id��ѯѧ��
					case 2:
						System.out.println("������γ�id��");
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
				//��ӿγ�
				case 2:
					System.out.println("������γ�id��");
					int courseid = scanner.nextInt();
					System.out.println("������γ�����");
					String name = scanner.next();
					Course cou = new Course(courseid,name);
					new CourseDaoimpl().AddCourse(cou);
					studentsys.studentManager();
					break;
				//ɾ���γ�
				case 3:
					System.out.println("������Ҫɾ���γ̵�ID��");
					int courseid1 = scanner.nextInt();
					new CourseDaoimpl().DelCourse(courseid1);
					System.out.println("���ݱ���ɹ��������ϼ�Ŀ¼.....");
					studentsys.studentManager();
					break;
				//�޸Ŀγ�
				case 4:
					System.out.println("������Ҫ�޸Ŀγ̵�ID��");
					int int4 = scanner.nextInt();
					System.out.println("������γ�����");
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
			


		
		//���ѧ��
		//Student student = new Student("1","����",16,"Ů");
		//sd.AddStudent(student);
		//ɾ��ѧ��
		//sd.DelStudent("1");
		//����ѧ��
		//sd.UpdateStudent(student);
		//��ѯѧ��
		//List<Student> query = sd.Query();
		//System.out.println(query);
		//ͨ��id��ѯ�γ�
		//List<String> course = sd.getCourse("stu1");
		//System.out.println(course);
		
		
		//���
		//Course course1 = new Course(4,"php");
		//cd.AddCourse(course1);
		//ɾ��
		//cd.DelCourse("4");
		//�޸�
		//cd.UpdateCourse(course1);
		//ͨ���γ̲�ѯѧ��
		//List<String> student = cd.getStudent(1);
		//System.out.println(student);
	}
}
