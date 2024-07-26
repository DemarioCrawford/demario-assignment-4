import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//read, parse the file, and create a list of students from it
public class FileService {
	public static List<Student> readCVS(String filePath) throws IOException {
		List<Student> students = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		String line;
		bufferedReader.readLine();
		while ((line = bufferedReader.readLine()) != null) {
			String[] values = line.split(",");
			students.add(new Student(values[0], values[1], values[2], Integer.parseInt(values[3])));
		}
		bufferedReader.close();
		return students;

	}
	//writing in the student fields or parameters
	public static void writeCSV(String filePath, List<Student> students) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
		bufferedWriter.write("Student ID,Student Name,Course,Grade");
		for (Student student : students) {
			bufferedWriter.write(student.toString() + "\n");
		}
		bufferedWriter.close();
	}
}
