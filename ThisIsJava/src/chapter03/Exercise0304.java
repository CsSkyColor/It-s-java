package chapter03;

public class Exercise0304 {
	public void startEx(){
		int pencils= 534;
		int students = 30;
		
		int pencilsPerStudent = pencils /students;
		System.out.println("pencilsPerStudent : " + pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println("pencilsLeft : " + pencilsLeft);
	}
}
