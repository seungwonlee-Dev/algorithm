package BaekJoon.OneDayCoding.Bronze3.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m < 45) {
            m += 60 - 45;
            h -= 1;
        } else {
            m -= 45;
        }
        if(h < 0) {
            h += 24;
        }
        System.out.println(h + " " +m);

    }
}
