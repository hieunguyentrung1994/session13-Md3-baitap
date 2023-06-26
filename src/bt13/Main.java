package bt13;


import java.util.Arrays;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        System.out.println("Chuỗi kí tự được sắp xếp tăng dần: " + sortedString);
    }
}

