package bt8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("mảng có sẵn là: " + Arrays.toString(arr) );
        System.out.println("nhập số bạn muốn tìm kiếm trong khoảng từ bé nhất: ");
        int min = new Scanner(System.in).nextInt();
        System.out.println(" lớn nhất: ");
        int max = new Scanner(System.in).nextInt();
        List<Integer> newArr = search(arr,min,max);

        System.out.println("số bạn muốn tìm trong khoảng từ" +min+"đến"+max+"là: "+ "\n"+ newArr);

    }
    private static List<Integer> search(int[] arr, int min, int max) {
        List<Integer> arrNew = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                arrNew.add(arr[i]);
            }
        }


        return arrNew;
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }


}
