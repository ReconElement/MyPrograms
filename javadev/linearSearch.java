package javadev;

import java.util.Scanner;

public class linearSearch {
    public int linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in you array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements in your array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        linearSearch obj = new linearSearch();
        System.out.println("Enter the element you want to search in your array: ");
        int key = sc.nextInt();
        System.out.println(obj.linearsearch(arr, key));

    }
}
