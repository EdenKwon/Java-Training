package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
		ex06();
	}

	public static void ex01() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int num = Integer.parseInt(br.readLine());
		char word = n.charAt(num - 1);

		System.out.println(word);
	}

	public static void ex02() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		System.out.println(n.length());
	}

	public static void ex03() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String arr[] = new String[num];

		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < num; i++) {
			System.out.println(String.valueOf(arr[i].charAt(0)) + String.valueOf(arr[i].charAt(arr[i].length() - 1)));
		}
	}

	public static void ex04() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char a = str.charAt(0);
		System.out.println((int) a);
	}

	public static void ex05() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String num2 = br.readLine();
		int sum = 0;

		for (int i = 0; i < num; i++) {
			sum += num2.charAt(i) - '0';
		}

		System.out.println(sum);
	}

	public static void ex06() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int arr[] = new int[26];
		Arrays.fill(arr, -1);

		for (int i = num.length()-1; i >= 0; i--) {
			arr[num.charAt(i) - 'a'] = i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}