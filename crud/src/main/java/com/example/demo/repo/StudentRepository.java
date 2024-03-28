package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findAll();

	Optional<Student> findById(Long id);

}
