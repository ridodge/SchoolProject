/**
 * Riley Dodge - tjrace
 * CIS175 - Fall 2023
 * Mar 7, 2024
 */

package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
public class Student {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int grade;
	@Autowired
	private School school;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Student(long id, String name, int grade, School school) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.school = school;
	}

	public Student(long id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", school=" + school.toString() + "]";
	}

}
