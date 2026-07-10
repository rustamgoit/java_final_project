package ua.university.sms.repository;import org.springframework.data.jpa.repository.*;import ua.university.sms.model.entity.Course;import java.util.*;
public interface CourseRepository extends JpaRepository<Course,Long>{List<Course> findByTeacherId(Long teacherId);List<Course> findByCredits(int credits);}
