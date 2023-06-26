package bt11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1.5,23.3,56.9,80.1,100.9};
        double number = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > number) {
                number=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("số lớn nhất trong mảng:" + number);
        System.out.println("nhập số mún tim trong mảng");
        Scanner scanner = new Scanner(System.in);
        double search = Double.parseDouble(scanner.nextLine());
        int left = 0;
        int right =arr.length-1;
        boolean found = false;


        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == search){
                found = true;
            }
            if (arr[mid] > search){
                right = mid-1;
            }
            else{
                left = mid +1;
            }

        }

        if (found){
            System.out.println("số cần tìm có trong mảng");
        }else{
            System.out.println("số cần tìm không có trong mảng");
        }
    }
}
