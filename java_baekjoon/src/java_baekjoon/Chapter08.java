package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Chapter08 {
	public static void main(String[] args) throws Exception {
        ex07();
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
	
	public static void ex03() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Quater = 0, Dime = 0, Nickel = 0, Penny = 0;
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			int cent = Integer.parseInt(br.readLine());
			Quater = cent / 25;
			cent %= 25;
			Dime = cent / 10;
			cent %= 10;
			Nickel = cent / 5;
			cent %= 5;
			Penny = cent;

			bw.write(Quater + " " + Dime + " " + Nickel + " " + Penny + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void ex04() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());

		num = (int) Math.pow(getPoint(num), 2);
		bw.write(num + "");
		bw.flush();
		bw.close();
	}
	
	public static int getPoint(int num) {
		if (num == 1)
			return 3;
		else
			return getPoint(num - 1) + getPoint(num - 1) - 1;
	}
	
	public static void ex05() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roomNum = Integer.parseInt(br.readLine());
		int count = 1;
		int i = 1;
		
		while(i < roomNum) {
            i += 6 * count;
            count ++;
        }
		
		bw.write(count + "");
		bw.flush();
		bw.close();
	}
	
	public static void ex06() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int denominator = 1, numerator = 1;
		boolean flag = false;
		
		for(int i=1; i<num; i++) {
			if(flag == true && denominator == 1) {
				numerator += 1;
				flag = false;
			}
			
			else if (flag == false &&numerator == 1) {
				denominator += 1;
				flag = true;
			}

			else if (flag) {
				numerator += 1;
				denominator -= 1;
			}

			else {
				numerator -= 1;
				denominator += 1;
			}
		}
		
		bw.write(numerator + "/" + denominator);
		bw.flush();
		bw.close();
	}
	
	public static void ex07() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int morning = Integer.parseInt(st.nextToken());
		int evening = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int days = (int) Math.ceil((double) (height - morning) / (morning - evening)) + 1;
		
		bw.write(days + "");
		
		bw.flush();
		bw.close();
	}
}