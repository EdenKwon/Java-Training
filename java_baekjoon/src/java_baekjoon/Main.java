package java_baekjoon;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ex03();
	}
	
	public static void ex01() {
		int n;
		Scanner sc = new Scanner(System.in); 
		n = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
	
	public static void ex02() {
		int n, a, b;
		Scanner sc = new Scanner(System.in); 
		n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a + b;
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
	}	
	
	public static void ex03() {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=n; i>0; i--) {
			result = result + i;
		}
		System.out.println(result);
	}
}
