package odevkamp;

public class Student extends User {

	String selectedCourses;
	String country;
	String streetAddress;
	String city;
	String courseCompletionRate;
	String instructor;
	String courseProgram;
	
	public Student() {
		
	}
	
	public Student(String selectedCourses,String country,String streetAddress,String city,String courseCompletionRate,
			       String instructor,String courseProgram) {
			 

		this.selectedCourses=selectedCourses;
		this.country=country;
		this.streetAddress=streetAddress;
		this.city=city;
		this.courseCompletionRate=courseCompletionRate;
		this.instructor=instructor;
		this.courseProgram=courseProgram;
		
	}
	
	
}
