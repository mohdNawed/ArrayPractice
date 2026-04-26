package ArrayPractice;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i : arr) {
            System.out.println(i);

        }

    }
}