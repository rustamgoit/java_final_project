package ua.university.sms.model.dto;
import jakarta.validation.constraints.*;
public class TeacherDtos{public record Request(@NotBlank @Size(min=3,max=200) String fullName,@Email @NotBlank String email,@NotBlank @Size(max=150) String department){} public record Response(Long id,String fullName,String email,String department){} }
