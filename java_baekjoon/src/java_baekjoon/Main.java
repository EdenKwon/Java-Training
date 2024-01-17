package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		ex03();
	}
	
	public static void ex01() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int num = Integer.parseInt(br.readLine());
		char word = n.charAt(num-1);
		
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
			System.out.println(String.valueOf(arr[i].charAt(0)) + String.valueOf(arr[i].charAt(arr[i].length()-1)));
		}
	}
}