package ws3;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();	
	
	public StudentManager() {
		
	}

	public void add(Student student) {
		
		if(students.contains(student) ) {
			System.out.println("Ayn� ��renci Eklenemez.");
			return;
		}
		
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " +"�grenci Eklendi.");
		
		this.students.add(student);
	}
	public void delete(Student deletedStudent) {
		Student studentToDelete = new Student();
		
		for (Student student : students) {
			if (student.getId() == studentToDelete.getId()) {
				
                studentToDelete = student;
                System.out.println(studentToDelete.getFirstName() + " " + studentToDelete.getLastName() + " " + "Adl� ��renci Kald�r�ld�.");
                students.remove(studentToDelete);
                break;
			} else {
				System.out.println("Silinecek ��renci bulunamad�! --- ��renci silinemedi!!!");

			}
			
			
		}
		
		
	}
	public void update(Student updatedStudent) {
		boolean varsa=true;
		for(Student student : students) {
			if (student.getId() == updatedStudent.getId()) {
				students.set(students.indexOf(student), updatedStudent);
                student = updatedStudent;
                System.out.println(updatedStudent.getId() + " ID No`lu ��renci g�ncellendi!");
                varsa=true;
                break;
			} else {
				varsa=false;
			}
			if (!varsa) {

	            System.out.println("G�ncellenecek ��renci bulunamad�! --- ��renci g�ncellenemedi!!!");
	        }
		}
		
	
	}
	public ArrayList<Student> getAll(){
		return this.students;
	
	}
}
