package java_baekjoon;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ex07();
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
	
	public static void ex04() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		checkQuadrant(a, b);
	}
	
	public static void checkQuadrant(int a, int b) {
		if(a > 0) {
			if (b > 0) {
				System.out.println("1");
				return;
			}
			System.out.println("4");
			return;
		}
		
		if (b > 0) {
			System.out.println("2");
			return;
		}
		System.out.println("3");
		return;
	}
	
	public static void ex05() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(b < 45) {
			a = a - 1;
			b = 60 - (45 - b);
			if(a == -1)
				a = 23;
			System.out.println(a + " " + b);
			return;
		}
		
		else
			System.out.println(a + " " + (b-45));
	}
	
	public static void ex06() {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		b = b + c;
		if(b/60 != 0) { //시간 업데이트가 필요할 경우. 이 구문을 메서드로 넘겨도 될듯.
			a = a + (b/60);
			b = b % 60;
			if(a >= 24)
				a = a % 24;
		}
		
		System.out.println(a + " " + b);
	}
	
	public static void ex07() {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a == b && b == c)  {
			System.out.println(10000 + a*1000);
		}
		
		else if (a==b || b==c || c==a) {
			System.out.println(1000 + getSame(a,b,c)*100);
		}
		
		else 
			System.out.println(max(a,b,c)*100);
	}
	
	static int getSame(int a, int b, int c) {
		if(a == b)
			return a;
		else
			return c;
	}

	static int max(int a, int b, int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}
			else
				return c;
		}
		else if(b>c)
			return b;
		else 
			return c;
	}
}
