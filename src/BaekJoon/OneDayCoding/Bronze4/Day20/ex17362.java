package BaekJoon.OneDayCoding.Bronze4.Day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int temp = Integer.parseInt(br.readLine());
        if (A + B >= temp * 2) {
            System.out.println(A + B - temp * 2);
        } else {
            System.out.println(A + B);
        }
    }
}
