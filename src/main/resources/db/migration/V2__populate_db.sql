INSERT INTO teachers(full_name,email,department) VALUES
('Olena Kovalenko','olena.kovalenko@uni.ua','Computer Science'),('Ivan Petrenko','ivan.petrenko@uni.ua','Mathematics'),('Maria Shevchenko','maria.shevchenko@uni.ua','Physics');
INSERT INTO students(full_name,email,year,status) VALUES
('Andrii Melnyk','andrii.melnyk@student.ua',1,'ACTIVE'),('Sofia Bondar','sofia.bondar@student.ua',2,'ACTIVE'),('Dmytro Tkachenko','dmytro.tkachenko@student.ua',3,'ACTIVE'),('Anna Kravchenko','anna.kravchenko@student.ua',1,'ACADEMIC_LEAVE'),('Maksym Moroz','maksym.moroz@student.ua',4,'ACTIVE'),('Yulia Savchenko','yulia.savchenko@student.ua',2,'GRADUATED'),('Bohdan Lysenko','bohdan.lysenko@student.ua',5,'ACTIVE'),('Kateryna Polishchuk','kateryna.polishchuk@student.ua',3,'ACTIVE'),('Roman Hrytsenko','roman.hrytsenko@student.ua',1,'EXPELLED'),('Nazar Sokolov','nazar.sokolov@student.ua',2,'ACTIVE');
INSERT INTO courses(title,credits,semester,teacher_id) VALUES
('Java Web Development',5,'2026-Spring',1),('Databases',4,'2026-Spring',1),('Discrete Mathematics',3,'2026-Spring',2),('Physics Basics',4,'2026-Autumn',3),('Algorithms',5,'2026-Autumn',2);
INSERT INTO enrollments(student_id,course_id,paid,grade) VALUES
(1,1,true,92),(2,1,false,78),(3,2,true,85),(4,3,false,NULL),(5,4,true,88),(6,5,true,95),(7,1,false,70),(8,2,true,81),(9,3,false,60),(10,5,true,90);
