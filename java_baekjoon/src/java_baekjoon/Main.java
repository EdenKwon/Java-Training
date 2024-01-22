package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
		ex08();
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
	
	public static void ex03() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num*2-1; i++) {
			for (int j = 1; j <= num*2-1; j++) {
				if(i<=num) {
					if(j<=num-i) {
						bw.write(" ");
					}
					else if(j<num+i) {
						bw.write("*");
					}
				}
				else {
					if(j<=i-num) {
						bw.write(" ");
					}
					else if(j<=num*2-1-(i-num)) {
						bw.write("*");
					}
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void ex04() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		
		bw.write(String.valueOf(isPalindrome(word) ? 1 : 0));
		bw.flush();
		bw.close();
	}
	
	public static boolean isPalindrome(String word) {
		int len = word.length();
		for (int i = 0; i < len / 2; i++) {
			if (word.charAt(i) != word.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void ex05() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine().toUpperCase();

		int Alphabet[] = new int[26];
		for (int i = 0; i < word.length(); i++) {
			Alphabet[word.charAt(i) - 65]++;
		}
		
		int max = 0;
		char maxAlphabet = '?';
		for (int i = 0; i < 26; i++) {
			if (Alphabet[i] > max) {
				max = Alphabet[i];
				maxAlphabet = (char) (i + 65);
			} else if (Alphabet[i] == max) {
				maxAlphabet = '?';
			}
		}
		
		bw.write(maxAlphabet);
		bw.flush();
		bw.close();
	}
	
	public static void ex06() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String word = br.readLine();
		
		int count = 0;
		while (count < croatia.length) {
			if (word.contains(croatia[count])) {
				word = word.replace(croatia[count], " ");
			}
			count++;
		}
		bw.write(String.valueOf(word.length()));
		bw.flush();
		bw.close();
	}
	
	public static void ex07() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < num; i++) {
			String word = br.readLine();
			if (isGroupWord(word)) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
	
	public static boolean isGroupWord(String word) {
		int len = word.length();
		for (int i = 0; i < len - 1; i++) {
			if (word.charAt(i) != word.charAt(i + 1)) {
				for (int j = i + 2; j < len; j++) {
					if (word.charAt(i) == word.charAt(j)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void ex08() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double subSum = 0;
		double gradeSum = 0;
		
		for (int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if (grade.equals("P")) {
				continue;
			}
			
			subSum += score;
			gradeSum += score * convertGrade(grade);	
		}
		
		bw.write(String.valueOf(gradeSum / subSum));
		bw.flush();
		bw.close();
	}
	
	private static final Map<String, Double> gradeToGPA = new HashMap<>();

    static {
        gradeToGPA.put("A+", 4.5);
        gradeToGPA.put("A0", 4.0);        
        gradeToGPA.put("B+", 3.5);
        gradeToGPA.put("B0", 3.0);
        gradeToGPA.put("C+", 2.5);
        gradeToGPA.put("C0", 2.0);
        gradeToGPA.put("D+", 1.5);
        gradeToGPA.put("D0", 1.0);
        gradeToGPA.put("F", 0.0);
    }

    public static double convertGrade(String Grade) {
        return gradeToGPA.getOrDefault(Grade, 0.0);
    }
}