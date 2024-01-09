package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		ex10();
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
	
	public static void ex05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int total = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		int arr[] = new int[total];
		Arrays.fill(arr, 0);
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			
			Arrays.fill(arr, start, end, value);
		}
		
		for (int i : arr) {
			bw.write(i + " ");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void ex06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int total = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		int arr[] = new int[total];
		for (int i = 0; i < total; i++) {
			Arrays.fill(arr, i, i+1, i+1);
		}
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			int basket1 = Integer.parseInt(st.nextToken());
			int basket2 = Integer.parseInt(st.nextToken());
			
			int temp = 0;
			temp = arr[basket1-1];
			arr[basket1-1] = arr[basket2-1];
			arr[basket2-1] = temp;
		}
		
		for (int i : arr) {
			bw.write(i + " ");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void ex07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[30];
		Arrays.fill(arr, 0);
		
		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num-1] = num;
		}
		
		for (int i = 0; i < 30; i++) {
			if (arr[i] == 0) {
				bw.write((i + 1) + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void ex08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int temp = 0;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					temp++;
				}
			}
			if (temp == 0) {
				count++;
			}
		}
		
		bw.write(count + "\n");
		
		bw.flush();
		bw.close();
	}
	
	public static void ex08_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		Set<Integer> uniqueSet = new HashSet<>(list);
		int uniqueCount = uniqueSet.size();
		
		bw.write(uniqueCount + "\n");
		
		bw.flush();
		bw.close();
	}
	
	public static void ex09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int total = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		int arr[] = new int[total];
		for(int i=0; i<total; i++) {
			Arrays.fill(arr, i, i+1, i+1);
		}
		
		for (int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int tempArr[] = new int[end-start+1];
			
			for(int j=0; j<end-start+1; j++) {
				tempArr[j] = arr[end-j-1];
			}
			
			for (int k=0; k<end-start+1; k++) {
				arr[start + k - 1] = tempArr[k];
			}
		}
		for (int i : arr) {
			bw.write(i + " ");
		}

		bw.flush();
		bw.close();
	}
	
	public static void ex10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        double arr[] = new double[total];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		for (int i = 0; i < total; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
        int max = getArrMax(arr);
		
		for (int i = 0; i < total; i++) {
			arr[i] = arr[i] * 100 / max;
		}
		
        bw.write(Double.toString(getArrAvg(arr)));
        
        bw.flush();
        bw.close();
	}
	
	public static int getArrMax(double arr[]) {
		int max = 0;
        for (double i : arr) {
            if (max < i) {
                max = (int)i;
            }
        }
        return max;
	}
	
	public static double getArrAvg(double arr[]) {
		double sum = 0;
		for (double i : arr) {
			sum += i;
		}
		return (double)sum / arr.length;
	}
}
