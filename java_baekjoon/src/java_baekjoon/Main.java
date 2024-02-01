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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());
		int maxSum = 0;
		
		int[] arr = new int[num];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
				for (int k=j+1; k<num; k++) {
					if (i != j && j != k && i != k) {
						int sum = arr[i] + arr[j] + arr[k];
						if (sum <= total && sum > maxSum) {
							maxSum = sum;
						}
					}
				}
			}
		}
		
		bw.write(maxSum + "");
		
		bw.flush();
		bw.close();
	}
	
	public static void ex01_1() throws Exception { //gpt
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());

        int[] arr = new int[num];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = findMaxSum(arr, num, total);

        bw.write(maxSum + "");

        bw.flush();
        bw.close();
    }

    private static int findMaxSum(int[] arr, int num, int total) {
        int maxSum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < num - 2; i++) {
            int left = i + 1;
            int right = num - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum <= total) {
                    maxSum = Math.max(maxSum, sum);
                    left++;
                } else {
                    right--;
                }
            }
        }

        return maxSum;
    }
    
	public static void ex02() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
        for(int i=1; i<=num; i++) {
        	int sum = i, constructor = i;
			while(constructor > 0) {
				sum += constructor % 10;
				constructor /= 10;
			}
			
			if(num == sum) {
				bw.write(i + "");
                break;
			}
			
			if(i == num) {
				bw.write("0");
			}
        }
        
		bw.flush();
		bw.close();
	}
	
	public static void ex03() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int eq1[] = new int[3];
		int eq2[] = new int[3];
		int x = 0, y = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			eq1[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < 3; i++) {
			eq2[i] = Integer.parseInt(st.nextToken());
		}
		
		try {
			int div = eq1[1] * eq2[0] - eq1[0] * eq2[1];
            if (div == 0)
            {
                throw new Exception();
            }
            y = (eq1[2] * eq2[0] - eq1[0] * eq2[2]) / div;
		}
		
		catch (Exception e) {
			y = 0; 
		}
		
		if (eq1[0] == 0)
        {
            x = (eq2[2] - eq2[1] * y) / eq2[0];
        }

        else 
            x = (eq1[2] - eq1[1] * y) / eq1[0];
		
		bw.write(x + " " + y);
        
		bw.flush();
		bw.close();
	}
	
	public static char currentColor = 'B';
	
	public static void ex04() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int minCount = 64;
		
		char chess[][] = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			char[] line = br.readLine().toCharArray();
		    System.arraycopy(line, 0, chess[i], 0, Math.min(line.length, M));
		}
		
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				int count = checkMin(chess, i, j);
				
				if (count < minCount) {
					minCount = count;
				}
			}
		}
		
		
		bw.write(minCount + "");
		
		bw.flush();
		bw.close();
	}
	
	public static int checkMin(char[][] chess, int N, int M) {
		int count1 = 0;
		int count2 = 0;
		
		for (int i = N; i < N + 8; i++) {
			changeColor();
			for (int j = M; j < M + 8; j++) {
				if (chess[i][j] != currentColor) {
					count1++;
				}
				changeColor();
			}
		}
		
		changeColor();
		
		for (int i = N; i < N + 8; i++) {
			changeColor();
			for (int j = M; j < M + 8; j++) {
				if (chess[i][j] != currentColor) {
					count2++;
				}
				changeColor();
			}
		}
		return Math.min(count1, count2);
	}
	
	public static void changeColor() {
		if (currentColor == 'B') {
			currentColor = 'W';
		} else {
			currentColor = 'B';
		}
	}
}