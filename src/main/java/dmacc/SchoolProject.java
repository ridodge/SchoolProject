package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.School;
import dmacc.beans.Student;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.StudentRepository;

@SpringBootApplication
public class SchoolProject {
	public static void main(String[] args) {
		SpringApplication.run(SchoolProject.class, args);
	}

	@Autowired
	StudentRepository repo;

//	@Override
//	public void run(String... args) throws Exception {
//// TODO Auto-generated method stub
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
////Using an existing bean
//		
//		Student c = appContext.getBean("student", Student.class);
//		repo.save(c);
//		
////Creating a bean to use – not managed by Spring
//		Student s = new Student();
//		s.setGrade(11);
//		s.setName("FakeName");
//		s.setId(0);
//		School sc = new School("FakeSchool", "Des Moines", "IA");
//		s.setSchool(sc);
//		repo.save(s);
//
//		List<Student> allMyStudents = repo.findAll();
//		for (Student student : allMyStudents) {
//			System.out.println(student.toString());
//		}
//
//		((AbstractApplicationContext) appContext).close();
//	}
}
