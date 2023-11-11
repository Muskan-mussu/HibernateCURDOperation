package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;
public class CreateStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setStudentName("Suhas");
		s.setRollNumber(10);
		s.setCourse("BE");
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(s);
		System.out.println("Insert Record Success");
		ses.close();
		sf.close();
	}
}
