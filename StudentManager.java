package ws3;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();	
	
	public StudentManager() {
		
	}

	public void add(Student student) {
		
		if(students.contains(student) ) {
			System.out.println("Aynı Öğrenci Eklenemez.");
			return;
		}
		
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " +"Ögrenci Eklendi.");
		
		this.students.add(student);
	}
	public void delete(int id) {
		Student studentToDelete = new Student();
		for (Student student : students) {
			if (student.getId()==id) {
				studentToDelete=student;
			}
			System.out.println(studentToDelete.getFirstName() + " " + studentToDelete.getLastName() + " " + "Adlı Öğrenci Kaldırıldı.");
			students.remove(studentToDelete);
		}
		
		
	}
	public void update(Student updatedStudent) {
		boolean varsa=true;
		for(Student student : students) {
			if (student.getId() == updatedStudent.getId()) {
				students.set(students.indexOf(student), updatedStudent);
                student = updatedStudent;
                System.out.println(updatedStudent.getId() + " ID No`lu öğrenci güncellendi!");
                varsa=true;
                break;
			} else {
				varsa=false;
			}
			if (!varsa) {

	            System.out.println("Güncellenecek öğrenci bulunamadı! --- Öğrenci güncellenemedi!!!");
	        }
		}
		
	
	}
	public ArrayList<Student> getAll(){
		return this.students;
	
	}
}
