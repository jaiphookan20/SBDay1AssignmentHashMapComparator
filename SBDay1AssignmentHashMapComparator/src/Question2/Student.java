package Question2;


import java.util.*;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	public static void main(String[] args) {
		
		TreeMap<Student,String> treemap = new TreeMap<>(new StudentMarksComp());
		
		treemap.put(new Student(10,"Ganesh",950),"Maharastra");
		treemap.put(new Student(12,"Surya",850),"Tamilnadu");
		treemap.put(new Student(15,"Venkat",920),"Telangana");
		treemap.put(new Student(16,"Dinesh",910),"Haryana");
		treemap.put(new Student(18,"Srinu",880),"Kerla");
        
        
        Set<Map.Entry<Student,String>> set = treemap.entrySet();
        
        for(Map.Entry<Student,String> x: set) {
        	
        	System.out.println("Toppers Student of State :" + x.getValue());
            System.out.println("*********************************");
            
            Student student = x.getKey();
            
            System.out.println("Roll :" + student.getRoll());
            System.out.println("Name :" + student.getName());
            System.out.println("Marks :" + student.getMarks());
        	
        }
        
	}
	
	
	
	
	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}


	/**
	 * @param roll the roll to set
	 */
	public void setRoll(int roll) {
		this.roll = roll;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}


	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}

	


	


	

}
