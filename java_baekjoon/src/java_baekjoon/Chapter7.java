package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Chapter7 {
	public static void main(String[] args) throws Exception {
        ex04();
	}
	
	public static void ex01() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int height = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		int arr1[][] = new int[height][width];
		int arr2[][] = new int[height][width];
		
		for (int i = 0; i < height; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < width; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < height; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < width; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				bw.write(arr1[i][j] + arr2[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void ex02() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[][] = new int[9][9];
		int max = 0;
		int x = 0, y = 0;
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(max <= arr[i][j]) {
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
		
		bw.write(max + "\n");
		bw.write(x + " " + y);
		
		bw.flush();
		bw.close();
	}
	
	public static void ex03() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr[][] = new String[5][];
		
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			arr[i] = new String[str.length()];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(j) + "";
			}
		}
		
		for (int i = 0; i < getMaxArrayLength(arr); i++) {
			for (int j = 0; j < 5; j++) {
				if(arr[j].length <= i) {
					continue;
				}
				bw.write(arr[j][i]);
			}
		}
		
		bw.flush();
		bw.close();
	}
	
	public static int getMaxArrayLength(String[][] arr) {
		int maxLength = 0;
		for (String[] subArray : arr) {
	        maxLength = Math.max(maxLength, subArray.length);
	    }
	    return maxLength;
	}
	
	public static void ex04() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int paper = Integer.parseInt(br.readLine());
		int arr[][] = new int[100][100];
		int count = 0;
		for (int i = 0; i < 100; i++) {
			Arrays.fill(arr[i], 0);
		}
		
		for (int i = 0; i < paper; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for (int m = 0; m < 100; m++) {
			for (int n = 0; n < 100; n++) {
				if (arr[m][n] == 1) {
					count++;
				}
			}
		}
		bw.write(count + "\n");
		
		bw.flush();
		bw.close();
	}
}