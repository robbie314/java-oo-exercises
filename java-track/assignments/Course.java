import java.util.ArrayList;

public class Course {
	private String name;
	private int credits;
	private int totalSeats;
	private int remainingSeats;
	private int numberofSeats;
	private ArrayList<Student> students;
	public static ArrayList<Course> courseList = new ArrayList<Course>();
	

	public Course(String name, int credits, int totalSeats) {
		this.name = name;
		this.credits = credits;
		this.totalSeats = totalSeats;
		this.remainingSeats = totalSeats;
		this.students = new ArrayList<Student>();
		courseList.add(this);
	}

	public Course(String name, int credits, int totalSeats, int remainingSeats, ArrayList<Student> students) {
		this.name = name;
		this.credits = credits;
		this.totalSeats = totalSeats;
		this.remainingSeats = remainingSeats;
		this.students = students;
		courseList.add(this);
	}

	public static ArrayList<Course> getAllCourses() {
		return courseList;
	}
	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

	public int getRemainingSeats() {
		return remainingSeats;
	}

	public void setName(String name) {
		this.name = name;

	}

	public boolean addStudent(Student newStudent) {
		if (remainingSeats == 0) {
			return false;
		}
		for (Student s : this.students) {
			if (s.getStudentID() == newStudent.getStudentID() && s.getName().equals(newStudent.getName())) {
				return false;

			}

		}
		this.students.add(newStudent);
		this.remainingSeats -= 1;
		return true;
	}

	public String generateRoster() {
		String roster = "";
		for (Student s: this.students) {
			roster += s.toString() + "\n";
		}
		return roster;
	}

	public double averageGPA() {
		double totalGPA = 0;
		int numberofStudents = this.students.size();
		for (Student s : this.students) {
			totalGPA += s.getGPA();
			
		}
		return totalGPA / numberofStudents;
	}
	public String toString(){
		return this.name + " " + this.credits; 
	}
}
