package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
		ex04();
	}
	
	public static void ex01() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());	
        	
            if(num1 == 0 && num2 == 0) break;
            
			if (num1 % num2 == 0)
				bw.write("multiple\n");
			else if (num2 % num1 == 0)
				bw.write("factor\n");
			else
				bw.write("neither\n");
        }
        
        bw.flush();
        bw.close();
	}
	
	public static void ex02() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n%i == 0) {
				count ++;
				if (count == k) {
					bw.write(i + "");
					break;
				}
				
				if (i == n) {
					bw.write("0");
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void ex03() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == -1) break;
			
			checkPerfect(num, sb);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	public static void checkPerfect(int num, StringBuilder sb) throws Exception {
		int sum = 0;
		StringBuilder divisors = new StringBuilder();
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
				divisors.append(i).append(" + ");
			}
		}
		
		if (sum == num) {
			divisors.setLength(divisors.length() - 3);
			sb.append(num).append(" = ").append(divisors).append("\n");
		}
		else
			sb.append(num + " is NOT perfect.\n");
	}
	
	public static void ex04() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (isPrime(arr[i]))
				count++;
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
	}
	
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}