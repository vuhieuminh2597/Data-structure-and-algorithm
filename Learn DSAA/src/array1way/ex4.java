package array1way;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = 1;
        int n;
        int[] number;
        System.out.println("Số bộ test:");
        t = input.nextInt();
        while (t > 0) {
            System.out.println("Số phần tử mảng:");
            n = input.nextInt();
            t--;
        }
    }
}
