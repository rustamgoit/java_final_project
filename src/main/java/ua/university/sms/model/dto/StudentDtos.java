package ua.university.sms.model.dto;
import jakarta.validation.constraints.*;import ua.university.sms.model.entity.StudentStatus;
public class StudentDtos{public record Request(@NotBlank @Size(min=3,max=200) String fullName,@Email @NotBlank String email,@Min(1)@Max(6) int year,StudentStatus status){} public record Response(Long id,String fullName,String email,int year,StudentStatus status,Double gpa){} }
