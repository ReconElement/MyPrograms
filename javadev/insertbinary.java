package javadev;

import java.util.Scanner;

public class insertbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the total number of elements you want in your array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements you want in your array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search in your array: ");
        int key = sc.nextInt();
        insertbinary obj = new insertbinary();
        obj.insertionSort(arr);
        obj.binarysearch(arr, key);

    }

    public int[] insertionSort(int arr[]) {
        int size = arr.length;
        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public int binarysearch(int arr[], int key) {
        int l = 0, r = arr.length, m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] == key)
                return m;

            if (arr[m] < key)
                l = m + 1;

            else
                r = m - 1;
        }
        return -1;
    }
}
