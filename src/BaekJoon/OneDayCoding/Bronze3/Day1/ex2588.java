package BaekJoon.OneDayCoding.Bronze3.Day1;

import java.util.Scanner;

public class ex2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char[] b = sc.next().toCharArray();
        int sum = 0;
        int su = 1;
        for (int i = 2; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(b[i]));
            System.out.println(a * temp);
            sum += (a * temp) * su;
            su*=10;
        }
        System.out.println(sum);
    }
}
