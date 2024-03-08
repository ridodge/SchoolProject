/**
 * Riley Dodge - tjrace
 * CIS175 - Fall 2023
 * Mar 7, 2024
 */


package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { }
