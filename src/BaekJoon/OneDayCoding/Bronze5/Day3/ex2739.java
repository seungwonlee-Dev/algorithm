package BaekJoon.OneDayCoding.Bronze5.Day3;

import java.util.Scanner;

public class ex2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}