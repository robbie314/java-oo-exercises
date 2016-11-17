
public class Student {
	private String firstName;
	private String lastName;
	private int ID;
	private int credits;
	private double gpa;
	private double gpaTotal;

	public Student(String firstName, String lastName, int iD) {
		this.firstName = firstName;
		this.lastName = lastName;
		ID = iD;
	}

	public Student(String firstName, String lastName, int iD, int credits, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		ID = iD;
		this.credits = credits;
		this.gpa = gpa;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getStudentID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getClassStanding() {
		if (credits < 30) {
			return "Freshman";

		} else if (credits >= 30 && credits < 60) {
			return "Sophomore";
		} else if (credits >= 60 && credits < 90) {
			return "Junior";
		} else {
			return "Senior";
		}

	}

	public void submitGrade(double courseGrade, int courseCredits) {
		gpaTotal += courseGrade * courseCredits;
		credits += courseCredits;

		gpa = gpaTotal / credits;
		gpa = Math.round(gpa * 1000) / 1000.0;
		//System.out.println(gpa);
	}

	public double computeTuition() {
		int numSemesters = credits / 15;
		int leftoverCredits = credits % 15;
		double Tuition = numSemesters * 20000;
		Tuition += (int)(1333.33 * leftoverCredits * 100) / 100.0;
		return Tuition;
	}

	public static Student createLegacy(Student spouse, Student spouse2) {
		String babyfirstName = spouse.getName();
		String babylastName = spouse2.getName();
		int babyiD = spouse.getStudentID() + spouse2.getStudentID();
		double babygpa = (spouse.getGPA() + spouse2.getGPA()) / 2;
		int babyCredits = Math.max(spouse.getCredits(), spouse2.getCredits());
		Student baby = new Student(babyfirstName, babylastName, babyiD, babyCredits, babygpa);
		return baby;
	}

	public String toString() {
		return this.firstName + this.lastName + this.ID;
	}
}
