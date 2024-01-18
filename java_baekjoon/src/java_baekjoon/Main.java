package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
		ex02();
	}
	
	public static void ex01() throws Exception {
		System.out.println("         ,r'\"7");
		System.out.println("r`-_   ,'  ,/");
		System.out.println(" \\. \". L_r'");
		System.out.println("   `~\\/");
		System.out.println("      |");
		System.out.println("      |");
	}
	
	
	public static void ex02() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[6];
		
		for (int i = 0; i < 6; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				switch (i) {
					case 0:
					case 1:
						bw.write(1 - num[i] + " ");
						break;
					case 2:
					case 3:
					case 4:
						bw.write(2 - num[i] + " ");
						break;
					case 5:
						bw.write(8 - num[i] + " ");
						break;
				}
		}
		
		bw.flush();
		bw.close();
	}
}