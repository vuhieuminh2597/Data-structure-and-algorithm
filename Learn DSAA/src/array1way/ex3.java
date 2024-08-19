package array1way;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = 1;
        String str;
        System.out.println("Số bộ test:");
        t = input.nextInt();
        input.nextLine();
        while (t > 0) {
            System.out.println("Nhập chuỗi văn bản:");
            str = input.nextLine();
            sortStr(str);
            t--;
        }
    }

    public static void sortStr(String str){
        String[] word = str.split("\\s+");
        Arrays.sort(word);
        for (String s:
             word) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
