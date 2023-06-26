package bt03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr2chieu = getArr();
        System.out.println("mảng 2 chiều là:");
        // cách 1 in ra
        for (int i = 0; i < arr2chieu.length; i++){
            for (int j = 0; j < arr2chieu[i].length;j++){
                System.out.print(arr2chieu[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------");
        System.out.println("nhập số muốn tìm trong mảng 2 chiều là");

        int number = new Scanner(System.in).nextInt();
        boolean check = check(number, arr2chieu);
        if (check) {
            System.out.println("số bạn nhập có trong mảng 2 chiều");
        }else{
            System.out.println("số bạn nhập không năm trong mảng 2 chiều");
        }

    }
    public static boolean check (int number, int[][] ar2chieu ){
        for (int i = 0; i < ar2chieu.length; i++){
            for (int j = 0; j < ar2chieu[i].length;j++){
                if(number == ar2chieu[i][j]){
                    return true;
                }
            }}
        return false;
    }
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
}

