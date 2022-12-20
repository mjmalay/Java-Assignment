
/*8) Write a program to search for a user defined number in array of 20 numbers using linear search 
and binary search using class and object? Allow user to choose searching method */

import java.util.Scanner;

class Search {
    int arr[] = new int[20];
    int key;

    Search(int arr[], int key) {
        this.arr = arr;
        this.key = key;
    }

    int linearSearch() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch() {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

public class Assignment3_8 {
    public static void main(String[] args) {

        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to the array :");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search in between array:");
        int n = sc.nextInt();
        Search s = new Search(arr, n);
        System.out.println("Enter the option to perform the task :");
        System.out.println("a) Find linear Search.");
        System.out.println("b) Find Binary Search.");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
                int num = s.linearSearch();
                if (num == -1) {
                    System.out.println(n + " is not present in the array..");
                } else {
                    System.out.println(n + " is present in the array.");
                }
                break;
            case 'b':
                num = s.binarySearch();
                if (num == -1) {
                    System.out.println(n + " is not present in the array..");
                } else {
                    System.out.println(n + " is present in the array.");
                }
                break;
        }
    }
}
