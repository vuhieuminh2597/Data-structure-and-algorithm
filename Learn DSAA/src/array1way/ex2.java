package array1way;

import java.util.Scanner;

public class ex2 {
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
            number = addArray(n, input);
            t--;
        }
    }

    public static int[] addArray(int n, Scanner input) {
        int[] number = new int[n];
        System.out.println("==== Nhập phần tử mảng ====");
        for (int i = 0; i < number.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ":");
            number[i] = input.nextInt();
        }
        return number;
    }

    public static void showArray(int[] array) {
        System.out.println("Danh sách phần tử mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
