package com.offcn;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.StuDao;
import com.offcn.po.Stu;

public class TestDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

		StuDao dao = context.getBean(StuDao.class);
		
		Stu s = new Stu();
		s.setName("猛哥");
		s.setPhone("188888888888");
		s.setScore(99.89F);
		
		dao.save(s);
		
		List<Stu> list = dao.getAllStu();
		for (Stu stu : list) {
			System.out.println(stu);
		}
	}

}
