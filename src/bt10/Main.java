package bt10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();

        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        int lowerBoundIndex = findLowerBoundIndex(arr, min);
        int upperBoundIndex = findUpperBoundIndex(arr, max);

        System.out.println(lowerBoundIndex);
        System.out.println(upperBoundIndex);
    }

    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    private static int findLowerBoundIndex(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lowerBoundIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                lowerBoundIndex = mid;
                left = mid + 1;
            }
        }

        return lowerBoundIndex;
    }

    private static int findUpperBoundIndex(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int upperBoundIndex = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                upperBoundIndex = mid;
                right = mid - 1;
            }
        }

        return upperBoundIndex;
    }
}

