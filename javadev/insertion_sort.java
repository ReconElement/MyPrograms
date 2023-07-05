package javadev;

import java.util.Scanner;

public class insertion_sort {
    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] < arr[i]) {
                    int m = arr[i];
                    arr[i] = arr[j];
                    arr[j] = m;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements you want in your array: ");
        for (int i = 0; i < num; i++)
            arr[i] = sc.nextInt();
        insertionsort(arr);
    }
}
