package javadev.array;

public class array2 {
    public void init(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = i + j;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j]);
        }
        return;
    }

    public static void main(String[] args) {
        int[][] multi = new int[2][3];
        array2 obj = new array2();
        obj.init(multi);
    }
}
