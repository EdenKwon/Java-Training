package java_baekjoon;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws Exception {
		ex01();
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
}