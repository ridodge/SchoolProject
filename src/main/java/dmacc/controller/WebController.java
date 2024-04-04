/**
 * Riley Dodge - tjrace
 * CIS175 - Fall 2023
 * Mar 28, 2024
 */

package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Student;
import dmacc.repository.StudentRepository;

@Controller
public class WebController {
	@Autowired
	StudentRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllStudents(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewContact(model);
		}
		model.addAttribute("students", repo.findAll());
		return "results";
	}

	@GetMapping("/inputStudent")
	public String addNewContact(Model model) {
		Student s = new Student();
		model.addAttribute("newStudent", s);
		return "input";
	}

	@PostMapping("/inputStudent")
	public String addNewContact(@ModelAttribute Student s, Model model) {
		repo.save(s);
		return viewAllStudents(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdateString(@PathVariable("id") long id, Model model) {
		Student s = repo.findById(id).orElse(null);
		model.addAttribute("newStudent", s);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseStudent(Student s, Model model) {
		repo.save(s);
		return viewAllStudents(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") long id, Model model) {
		Student s = repo.findById(id).orElse(null);
		repo.delete(s);
		return viewAllStudents(model);
	}
}
