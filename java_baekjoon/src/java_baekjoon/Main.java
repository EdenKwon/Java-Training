package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
		ex11();
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
	
	public static void ex07() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			
			for (int j = 0; j < b.length(); j++) {
				for (int k = 0; k < a; k++) {
					bw.write(b.charAt(j));
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void ex08() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        StringTokenizer st = new StringTokenizer(sentence, " ");
        
        System.out.println(st.countTokens());
    }
	
	public static void ex09() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder num1 = new StringBuilder(st.nextToken());
		StringBuilder num2 = new StringBuilder(st.nextToken());
		num1.reverse();
		num2.reverse();
		
		if (Integer.parseInt(num1.toString()) > Integer.parseInt(num2.toString())) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
	
	public static void ex10() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        StringTokenizer st = new StringTokenizer(word);
        String[] arr = new String[st.countTokens()];
        arr = word.split("");
        
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
				case "A":
				case "B":
				case "C":
					count += 3;
					break;
				case "D":
				case "E":
				case "F":
					count += 4;
					break;
				case "G":
				case "H":
				case "I":
					count += 5;
					break;
				case "J":
				case "K":
				case "L":
					count += 6;
					break;
				case "M":
				case "N":
				case "O":
					count += 7;
					break;
				case "P":
				case "Q":
				case "R":
				case "S":
					count += 8;
					break;
				case "T":
				case "U": 
				case "V":
					count += 9;
					break;
				case "W":
				case "X":
				case "Y":
				case "Z":
					count += 10;
					break;
			}
		}
		System.out.println(count);
    }
	
	public static void ex11() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word;
		
		while ((word = br.readLine()) != null) {
			bw.write(word + "\n");
		}
		bw.flush();
		bw.close();	
	}

}