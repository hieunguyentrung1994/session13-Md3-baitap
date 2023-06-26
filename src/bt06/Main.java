package bt06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static int binarySearch(Integer[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra nếu target nằm ở giữa mảng
            if (array[mid] == target) {
                return mid;
            }

            // Nếu target nhỏ hơn giá trị ở vị trí mid, ta tiếp tục tìm kiếm trong mảng con bên trái của mid
            if (array[mid] > target) {
                right = mid - 1;
            }

            // Nếu target lớn hơn giá trị ở vị trí mid, ta tiếp tục tìm kiếm trong mảng con bên phải của mid
            else {
                left = mid + 1;
            }
        }

        // Nếu không tìm thấy target trong mảng
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("cho mangr:" + arr + "\n" + "nhập số bạn muốn tìm:" );
        int number = new Scanner(System.in).nextInt();
        int check = binarySearch( arr, number );
        if ( check != -1 ) {
            System.out.println("số bạn cần tìm có trong mảng");

        }else{
            System.out.println("số bạn tìm không có trong mảng");
        }

    }
}
