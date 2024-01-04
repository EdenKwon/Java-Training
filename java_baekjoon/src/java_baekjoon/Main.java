package java_baekjoon;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ex09();
	}
	
	public static void ex01() {
		System.out.print("Hello World!");
	}
	
	public static void ex02() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a+b);
	}
	
	public static void ex03() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a-b);
	}
	
	public static void ex04() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a*b);
	}
	
	public static void ex05() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		double result = (double) a/b;
		System.out.println(result);
	}
	
	public static void ex06() {
		int a, b, result;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	public static void ex07() {	
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		System.out.println(s + "??!");
	}
	
	public static void ex08() {	
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		System.out.println(year-543);
	}
	
	public static void ex09() {	
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
	}
}
