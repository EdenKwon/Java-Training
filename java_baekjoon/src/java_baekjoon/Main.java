package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
		ex03();
	}
	
	public static void ex01() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int width = Integer.parseInt(br.readLine());
		int height = Integer.parseInt(br.readLine());
		
		bw.write(width * height + "");
		
		bw.flush();
		bw.close();
	}
	
	public static void ex02() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int min = Math.min(Math.min(x, w-x), Math.min(y, h-y));
		bw.write(min + "");

		bw.flush();
		bw.close();
	}
	
	public static void ex03() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] points = new int[3][2];

		for (int j = 0; j < 3; j++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    points[j][0] = Integer.parseInt(st.nextToken());
		    points[j][1] = Integer.parseInt(st.nextToken());
		}
		
		int x = 0, y = 0;
		
		for (int i = 0; i < 3; i++) {
		    x ^= points[i][0];
		    y ^= points[i][1];
		}
		
		bw.write(x + " " + y);
		
		bw.flush();
		bw.close();
	}
}