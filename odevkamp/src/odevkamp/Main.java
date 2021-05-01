package odevkamp;

public class Main {

	public static void main(String[] args) {
		
		User user=new User();
		user.setId(1);
		user.setName("Mehmet");
		user.setLastName("UYSAL");
		user.setEmail("deneme@hotmail.com");
		user.setPassword("abc.1230");
		user.setPasswordRepeat("abc.1230");
		
		UserManager userManager=new UserManager();
		
		
		User[] users= {user};
		userManager.addMultiple(users);

		Student student=new Student();
		
		student.setName("Mehmet");
		student.selectedCourses="Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)";
		student.instructor="Engin Demiroğ";
		
		StudentManager studentManager=new StudentManager();
		
		Student[] students= {student};
		studentManager.addMultiple(students);
		
		
		Instructor instructor=new Instructor();
		
		instructor.setName("Engin");
		instructor.trainings="JAVA + REACT";
		instructor.lessonTimes="21.30";
		

		InstructorManager instructorManager=new InstructorManager();
		
		Instructor[] instructors= {instructor};
		instructorManager.addMultiple(instructors);
		instructorManager.Update(instructor);
		instructorManager.Delete(instructor);
		
		
		
	}

}
