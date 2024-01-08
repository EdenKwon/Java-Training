package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		ex01();
	}
	
	public static void ex01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[a];
		for (int i=0; i<a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < a; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		System.out.println(count);
	}
}
