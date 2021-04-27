package secondHomework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C#" , "Engin Demirog");
		Course course2 = new Course(2, "java" , "Engin Demirog");
		
		Category category1 = new Category( "C#" , "Engin Demirog");
		Category category2 = new Category( "java" , "Engin Demirog");
		
		
		categoryManager categoryManager = new categoryManager();
		courseManager courseManager = new courseManager();
		
		Course[] courses = {course1,course2};
		Category[] category = { category1, category2 };
		
		for (Course kurs : courses) {
	    	System.out.println(kurs.name);
	    }
		
	    for (Category kategori : category) {
		System.out.println(kategori.courseName);
		 
	   }
	    System.out.println(category.length);
		 
		 Category Category1 = new Category();
			
			Category1.courseName = "C#";
			Category1.instructor = "Engin Demirog";
			
			Category Category2 = new Category();
			
			Category2.courseName = "java";
			Category2.instructor = "Engin Demirog";
			
		 
	     categoryManager.Add(category1);
		 courseManager.Add(course1);
		
		
	}
}
