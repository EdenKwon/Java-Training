package java_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ex09();
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
	
	public static void ex04() {
		Scanner sc = new Scanner(System.in); 
		int total = sc.nextInt();
		int tCount = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<tCount; i++) {
			int price = sc.nextInt();
			int iCount = sc.nextInt();
			sum = sum + price*iCount;
		}
		
		System.out.println(total == sum ? "Yes" : "No");
	}
	
	public static void ex05() {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		for(int i=0; i<n/4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
	
	//보류
	public static void ex06() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int i = Integer.parseInt(bf.readLine());	
	}
	
	public static void ex07() {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = a+b;
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println("Case #" + i + ": " + arr[i-1]);
		}
	}
	
	public static void ex08() {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int arr[] = new int[n];
		int 첫번째[] = new int[n];
		int 두번째[] = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			첫번째[i] = a;
			두번째[i] = b; 
			arr[i] = a+b;
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println("Case #" + i + ": " + 첫번째[i-1] + " + " + 두번째[i-1] + " = " + arr[i-1]);
		}
	}
	
	public static void ex09() {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n-1; j>i-1; j--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}	
}
