package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
        ex02();
	}
	
	public static void ex01() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String num = st.nextToken();
		int digit = Integer.parseInt(st.nextToken());
		int decimal = 0;
		
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) >= 48 && num.charAt(i) <= 57) // 0~9
				decimal += Math.pow(digit, num.length()-i-1) * (int) (num.charAt(i) - 48);
			else
			decimal += Math.pow(digit, num.length()-i-1) * (int)(num.charAt(i) - 55);
		}
		
		bw.write(decimal+ "");
		
		bw.flush();
		bw.close();
	}
	
	public static void ex01_1() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        int digit = Integer.parseInt(st.nextToken());
        int decimal = 0;

        for (int i = 0; i < num.length(); i++) {
            char currentChar = num.charAt(i);
            int currentDigit = Character.isDigit(currentChar) ? currentChar - '0' : Character.toUpperCase(currentChar) - 'A' + 10;
            decimal += Math.pow(digit, num.length() - i - 1) * currentDigit;
        }

        bw.write(decimal + "");

        bw.flush();
        bw.close();
    }
	
	public static void ex02() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int digit = Integer.parseInt(st.nextToken());
        String decimal = "";
        
        while (num != 0) {
            int remainder = num % digit;
            decimal += remainder >= 10 ? (char)(remainder+55) : (char)(remainder + '0');
            num = num / digit;
        }
        
        decimal = new StringBuilder(decimal).reverse().toString();
        bw.write(decimal);
        
        bw.flush();
        bw.close();
	}
}