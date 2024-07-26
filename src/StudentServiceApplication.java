import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceApplication {

	public static void main(String[] args) throws IOException {
		
		
		try {
		List<Student> students = FileService.readCVS("student-master-list.csv");
		List<Student> compSciStudents = new ArrayList<>();
		List<Student> apMathStudents = new ArrayList<>();
		List<Student> statStudents = new ArrayList<>();
		
		for (Student student: students) {
			if (student.getCourse().startsWith("COMPSCI")) {
				compSciStudents.add(student);
			} else if (student.getCourse().startsWith("APMTH")) {
				apMathStudents.add(student);
			} else if (student.getCourse().startsWith("STAT")) {
				statStudents.add(student);
			}
		}
		
		compSciStudents.sort((s1, s2)-> Integer.compare(s2.getGrade(), s1.getGrade()));
		apMathStudents.sort((s1, s2)-> Integer.compare(s2.getGrade(), s1.getGrade()));
		statStudents.sort((s1, s2)-> Integer.compare(s2.getGrade(), s1.getGrade()));
		
		FileService.writeCSV("course1.csv", compSciStudents);
		FileService.writeCSV("course2.csv", apMathStudents);
		FileService.writeCSV("course3.csv", statStudents);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
