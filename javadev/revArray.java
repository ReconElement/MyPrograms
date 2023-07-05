package javadev;

import java.util.Scanner;

public class revArray {
    public void reverse(int[] arr) {
        int result[] = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array: ");
        int num = sc.nextInt();
        System.out.println("Enter the elements you want in your array: ");
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        revArray obj = new revArray();
        obj.reverse(arr);
    }
}
