package ws3;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();	
	
	public StudentManager() {
		
	}

	public void add(Student student) {
		for(Student studentX : students)
		if(studentX.getIdentityNumber().equals(student.getIdentityNumber()) ) {
			System.out.println("Bu kimlik numarasına ait " + student.getFirstName() + " " +student.getLastName() + " "+ " adlı öğrenci zaten mevcut !!!");
			return;
		}
	students.add(student);
	System.out.println(student.getId()+" "+student.getIdentityNumber()+" "+
			student.getFirstName()+" "+student.getLastName()+" eklendi.");
	}
	public void delete(int id) {

        for (Student student : students) {
            if (student.getId()==id) {
               
                students.remove(student);
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "Adlı Öğrenci Kaldırıldı.");
                return;
            }
            System.out.println("Silinecek öğrenci bulunamadı");
            return;
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
