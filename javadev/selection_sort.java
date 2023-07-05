package javadev;

import java.util.Scanner;

public class selection_sort {
    public static void selectionsort(int arr[]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in you array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        selectionsort(arr);
    }
}
