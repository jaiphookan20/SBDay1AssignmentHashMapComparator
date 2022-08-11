package Question2;
import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student> {
	
	/* "Sort this Map according to the student marks using TreeMap" */
	@Override
	public int compare(Student s1, Student s2) {
		
		if (s1.getMarks() > s2.getMarks()) {
			return +1;
		}
		else if (s1.getMarks() < s2.getMarks()) {
			return -1;
		}
		
		else  {
			return 0;
		}

}
	
	
}
