package ua.university.sms.model.dto;
import jakarta.validation.constraints.*;import java.time.LocalDateTime;
public class EnrollmentDtos{public record Request(@NotNull Long studentId,@NotNull Long courseId,boolean paid,@DecimalMin("0.0")@DecimalMax("100.0") Double grade){} public record PaymentRequest(boolean paid){} public record GradeRequest(@NotNull @DecimalMin("0.0")@DecimalMax("100.0") Double grade){} public record Response(Long id,Long studentId,String studentName,Long courseId,String courseTitle,boolean paid,Double grade,LocalDateTime enrolledAt){} }
