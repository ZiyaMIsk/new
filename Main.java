package ws3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1,"Ahmet",  "Yilmaz", "12529871230");
		Student student2 = new Student(2,"Berk", "Aslantas", "12345671234");
		Student student3 = new Student(3,"Yigit", "Terene" , "12349871432");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		//studentManager.add(student3);
		Student studentX = new Student(1,"Yasemin",  "Yilmaz", "12529871230");
		System.out.println(studentManager.getAll().size());
		for (Student item : studentManager.students) {
            System.out.println(item.getId()+" "+item.getFirstName()+" "+item.getLastName()+" "+item.getIdentityNumber());
        }
		
	       
		studentManager.delete(1);
		studentManager.update(studentX);
		 for (Student item : studentManager.students) {
	            System.out.println(item.getId()+" "+item.getFirstName()+" "+item.getLastName()+" "+item.getIdentityNumber());
	        }
		

	}

}
