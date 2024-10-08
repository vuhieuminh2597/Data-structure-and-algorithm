package array1way;

import java.util.Scanner;

public class ex1 {
    /**
     * Ex1: Liệt kê tất cả các số nguyên tố trong mảng.
     *
     */
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
            showArray(number);
            showIsPrime(number);
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

    public static boolean checkIsPrime(int n){

        if (n < 2){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void showIsPrime(int[] n){
        System.out.println("Số nguyên tố:");
        for (int i = 0; i < n.length; i++) {
            if (checkIsPrime(n[i])){
                System.out.print(n[i] + " ");
            }
        }
        System.out.println();
    }
}
