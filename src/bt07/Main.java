package bt07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cvào chuỗi bạn muốn chia thành mảng");
        String words = scanner.nextLine();
        System.out.println("nhập từ bạn muốn tìm trong mảng đó");
        String words1 = scanner.nextLine();

        String[] arrWords = words.split("\\s+");// tìm kiếm regex java
        System.out.println(Arrays.toString(arrWords));
        boolean check = search(words1, arrWords);
        if (check) {
            System.out.println("từ ban tìm có trong mảng");
        }else {
            System.out.println("từ bạn tìm không cóa trong mảng!!!!!");
        }

    }
    public static boolean search(String words1, String[] arrWords ){
        for (int i=0; i<arrWords.length; i++){
            if (words1.equals(arrWords[i])){
                return true;
            }
        }
        return false;
    }
}
