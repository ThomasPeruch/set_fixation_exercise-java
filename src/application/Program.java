package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many Students for course A ? ");
		
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter student ID : ");
			a.add(sc.nextInt());	
		}
		
		System.out.print("How many Students for course B ? ");
		
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter student ID : ");
			b.add(sc.nextInt());	
		}
		
		System.out.print("How many Students for course C ? ");
		
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter student ID : ");
			c.add(sc.nextInt());	
		}
		
		sc.close();
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students : " + total.size());
	}
}
