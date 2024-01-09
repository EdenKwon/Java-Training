package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		ex04();
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
	
	public static void ex02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total_num = Integer.parseInt(st.nextToken());
		int value = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[total_num];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<total_num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<total_num; i++) {
			if (arr[i] < value) {
				bw.write(arr[i] + " ");
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static void ex03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total_num = Integer.parseInt(st.nextToken());
		int max=-1000000, min=1000000;
		int arr[] = new int[total_num];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<total_num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i : arr) {
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
	
	public static void ex04() throws IOException {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0, count = 0;
		
		for (int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count+1);
	}
}
