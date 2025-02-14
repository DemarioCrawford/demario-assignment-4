import java.util.Objects;

public class Student {
	//fields
	String studentID;
	String studentName;
	String course;
	Integer grade;
	
	//student constructor
	public Student (String studentID, String studentName, String course, Integer grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}
	
	//getters and setters
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	//Override toString method and return a String with all the fields
	@Override
	public String toString() {
		return studentID + "," + studentName + "," + course + "," + grade;
		
	}
}
