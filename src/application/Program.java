package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> students = new HashSet<>();
		
		System.out.print("How many Students for course A ? ");
		
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter student ID : ");
			students.add(new Student(sc.nextInt()));	
		}
		
		System.out.print("How many Students for course B ? ");
		
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter student ID : ");
			students.add(new Student(sc.nextInt()));	
		}
		
		System.out.print("How many Students for course C ? ");
		
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter student ID : ");
			students.add(new Student(sc.nextInt()));	
		}
		sc.close();
		
		System.out.println("Total students : " + students.size());
	}
}
