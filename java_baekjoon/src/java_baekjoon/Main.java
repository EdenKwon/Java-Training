package java_baekjoon;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ex03();
	}
	
	public static void ex01() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) 
			System.out.println(">");
		else if (a == b)
			System.out.println("==");
		else
			System.out.println("<");
	}
	
	public static void ex02() {
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a >= 90) 
			System.out.println("A");
		else if(a >= 80) 
			System.out.println("B");
		else if(a >= 70)
			System.out.println("C");
		else if(a >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}
	
	public static void ex03() {
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a%4 == 0) {
			if(a%100 == 0 && a%400 != 0) {
				System.out.println("0");
				return;
			}
			System.out.println("1");
			return;
		}
		System.out.println("0");
	}
}
