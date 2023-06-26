package bt4;



import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(12, 3124, 56343, 2411, 312));
        System.out.println(arr + "\n" + "nhập số bạn muốn tìm:");
        int number = new Scanner(System.in).nextInt();
        for (Integer arr1 : arr
             ) {
            if (arr1 == number) {
                System.out.println("số" + number + "\t" + "có trong mảng");
            }
        }
        

    }
}
