/**
 * Riley Dodge - tjrace
 * CIS175 - Fall 2023
 * Mar 7, 2024
 */

package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.School;
import dmacc.beans.Student;

@Configuration
public class BeanConfiguration {
	@Bean
	public Student student() {
		Student bean = new Student("FakeStudentName");
		return bean;
	}

	@Bean
	public School school() {
		School bean = new School("SchoolName", "Des Moines", "Iowa");
		return bean;
	}
}