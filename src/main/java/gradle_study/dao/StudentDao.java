package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Student;

public interface StudentDao {
	List<Student> selectStudentByAll();
	Student selectStudentByNo(Student student);
	
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(Student studentNo);
	

}
