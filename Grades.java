package lab4;

public class Grades {
	
	public String gradeResult(int numberGrades) {
		
		if (numberGrades < 0 || numberGrades > 100) {
			throw new IllegalArgumentException ("Grades must be non-negative and below 100.");
		} else if (numberGrades < 60) {
			return "F";
		} else if (numberGrades < 70) {
			return "D";
		} else if (numberGrades < 80) {
			return "C";
		} else if (numberGrades < 90) {
			return "B";
		} else if (numberGrades <= 100) {
			return "A";
		} else {
			return "You will did a great job.";
		}
	}

}
