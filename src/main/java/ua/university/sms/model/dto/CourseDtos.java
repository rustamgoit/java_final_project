package ua.university.sms.model.dto;
import jakarta.validation.constraints.*;
public class CourseDtos{public record Request(@NotBlank @Size(max=200) String title,@Min(1)@Max(30) int credits,@NotBlank String semester,@NotNull Long teacherId){} public record Response(Long id,String title,int credits,String semester,Long teacherId,String teacherName){} }
