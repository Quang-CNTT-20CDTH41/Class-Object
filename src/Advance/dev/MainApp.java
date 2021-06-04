package Advance.dev;

import java.util.*;

public class MainApp {
	public static void input(List<Student> studentList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sv: ");
		String  ten = sc.next();
		System.out.println("Nhập tuổi sv: ");
		int tuoi = sc.nextInt();
		System.out.println("Nhập địa chỉ: ");
		String diachi = sc.next();
		System.out.println("Nhập SĐT: ");
		String sdt = sc.next();
		System.out.println("Nhập ĐTB: ");
		double dtb = sc.nextDouble();
		studentList.add(new Student(ten, tuoi, diachi, sdt, dtb));
		}
	public static void print(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		input(studentList);
		input(studentList);
		print(studentList);
	}

}
