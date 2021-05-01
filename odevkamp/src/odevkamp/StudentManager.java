package odevkamp;

public class StudentManager   {

	public void add(Student student) {
		System.out.println(student.getName()+" İsimli Öğrenci Bilgileri Eklendi."+"\n"+
				          "Seçilen Kurs: "+student.selectedCourses+"\n"+
				          "Eğitmen: " + student.instructor+"\n");
	}
	
	public void addMultiple(Student[] students) {
		
		for(Student student:students) {
			add(student);
		}
		
	}
	
	public void Update(Student student) {
		System.out.println(student.getName() +" isimli öğrenci güncellenmiştir.");
	}
	
	public void Delete(Student student) {
		System.out.println(student.getName() +" isimli öğrencii silinmiştir.");
	}
	
	
}