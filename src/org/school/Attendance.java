package org.school;

// Different data Types
public class Attendance {
	
	private void studentName(int id) {
		System.out.println(id);
		
	}
	private void studentName(String name) {
		System.out.println(name);
	

	}
	private void studentName() {
		System.out.println("Rakesh");

	}

	public static void main(String[] args) {
		Attendance a = new Attendance();
		a.studentName();
		a.studentName(1);
		a.studentName("rakesh");
		a.studentName("vijay");
		a.studentName("Naveen");
	}
	}


