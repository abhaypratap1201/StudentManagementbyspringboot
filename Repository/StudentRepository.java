package com.example.studentManagement.Repository;

import com.example.studentManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
