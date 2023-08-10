import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		AcademicRecord unicen = new AcademicRecord();

		Subject sub1 = new Subject("Programming Fundamentals", "Bugs Bunny", 10);
		Subject sub2 = new Subject("Object-Oriented Programming", "George Lucas", 23);
		Subject sub3 = new Subject("Data Structures and Algorithms", "Bill Gates", 8);
		Subject sub4 = new Subject("Web Development", "Luke Skywalker", 12);
		Subject sub5 = new Subject("Database Systems", "Ada Lovelace", 20);
		Subject sub6 = new Subject("Software Engineering", "James Hetfield", 14);

		Student s1 = new Student("Pablo", "Copes", 32604191, LocalDate.of(1986, 6, 23), "pablocopes86@gmail.com");
		Student s2 = new Student("Juan", "Pelotas", 30368239, LocalDate.of(2007, 5, 29), "juancito@gmail.com");
		Student s3 = new Student("Juana", "Laloca", 38263956, LocalDate.of(1996, 7, 12), "juana05@gmail.com");
		Student s4 = new Student("Laura", "Fasito", 37283746, LocalDate.of(1910, 8, 16), "laurita25@gmail.com");

		unicen.addStudent(s1);
		unicen.addStudent(s2);
		unicen.addStudent(s3);
		unicen.addStudent(s4);

		s1.addSubject(sub1);
		s1.addSubject(sub2);
		s1.addSubject(sub3);
		s1.addSubject(sub4);
		s1.addSubject(sub5);
		s1.addSubject(sub6);

		s2.addSubject(sub1);
		s2.addSubject(sub3);
		s2.addSubject(sub4);

		s3.addSubject(sub1);
		s3.addSubject(sub2);
		s3.addSubject(sub3);
		s3.addSubject(sub4);
		s3.addSubject(sub5);
		s3.addSubject(sub6);

		s4.addSubject(sub4);
		s4.addSubject(sub5);
		s4.addSubject(sub6);

		unicen.enrolledSubject();
		System.out.println(sub1.getProfessorName());
		s1.dropSubject(sub5);
		s1.dropSubject(sub6);
		s1.addSubject(sub1);
		unicen.enrolledSubject();
		s1.addSubject(sub5);
		s1.addSubject(sub6);
		unicen.addStudent(s1);
		unicen.enrolledSubject();

	}

}