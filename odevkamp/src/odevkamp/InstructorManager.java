package odevkamp;

public class InstructorManager extends Student {

	public void add(Instructor instructor) {

		System.out.println(instructor.getName() + " isimli öðretmen eklenmiþtir."+"\n"
	                      +"Eðitmenin kurslarý : "+ instructor.trainings +"\n"
				          +"Eðitmenin kurs zamaný: " + instructor.lessonTimes);
	}
	
	public void addMultiple(Instructor[] instructors) {
		
		for(Instructor instructor:instructors) {
			add(instructor);
		}
		
	}
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.getName() +" isimli öðretmen güncellenmiþtir.");
	}
	
	public void Delete(Instructor instructor) {
		System.out.println(instructor.getName() +" isimli öðretmen silinmiþtir.");
	}
	
	
}