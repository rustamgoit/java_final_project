package ua.university.sms.repository;
import org.springframework.data.jpa.repository.*;import ua.university.sms.model.entity.*;import java.util.*;
public interface StudentRepository extends JpaRepository<Student,Long>{List<Student> findByStatus(StudentStatus status);List<Student> findByYear(int year);List<Student> findByFullNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name,String email);@Query("select distinct e.student from Enrollment e where e.paid=false")List<Student> findStudentsWithUnpaidCourses();}
