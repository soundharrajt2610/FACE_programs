import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		String name;
		int age;
		char gender;
		long idNum;
		double cgpa;
		int year;
		String major;
		System.out.println("Name");
		name= input.next();
		System.out.println("Age");
		age=input.nextInt();
		System.out.println("Gender");
		gender= input.next().charAt(0);
		System.out.println("ID Number");
		idNum= input.nextLong();
		System.out.println("Major");
		major = input.next();
		System.out.println("CGPA");
		cgpa=input.nextDouble();
		System.out.println("Year");
		year = input.nextInt();
		CollegeStudent c = new CollegeStudent(name, age, gender, idNum, cgpa, major, year);
		System.out.println("The Student details is");
		System.out.println(c.toString());

	}

}

class Student {

	private String name;
	private int age;
	private char gender;
	private long idNum;
	private double cgpa;

	public Student(String name, int age, char gender, long idNum, double cgpa) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.idNum = idNum;
		this.cgpa = cgpa;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getIdNum() {
		return idNum;
	}
	public void setIdNum(long idNum) {
		this.idNum = idNum;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}

class CollegeStudent extends Student {

	public CollegeStudent(String name,int age, char gender,long idNum,double cgpa,String major, int year) {
		super(name,age,gender,idNum,cgpa);
		this.major = major;
		this.year = year;
	}
	private String major;
	private int year;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString()
	{
		return "ID : "+getIdNum()+"\nName : "+getName()+"\nAge : "+getAge()+"\nGender : "+getGender()+"\nMajor : "+getMajor()+"\nCGPA : "+getCgpa()+"\nYear : "+getYear();
	}

}
