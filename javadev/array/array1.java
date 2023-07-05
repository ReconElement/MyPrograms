package javadev.array;

public class array1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        System.out.println(arr[4]);
        String str[] = new String[5];
        System.out.println(str[2]);
    }
}
