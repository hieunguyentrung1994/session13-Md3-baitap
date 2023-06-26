package BTtimsothu2;


public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 1, 5, 8, 3, 7, 4};
        int smallest = arr[0]; // Khởi tạo biến smallest với giá trị vô cùng lớn
        int smallest2 = arr[0]; // Khởi tạo biến smallest2 với giá trị vô cùng lớn
        int smallest3 = arr[0]; // Khởi tạo biến smallest3 với giá trị vô cùng lớn

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) { // Nếu phần tử hiện tại nhỏ hơn smallest
                smallest2 = smallest; // Gán smallest2 bằng smallest hiện tại
                smallest = arr[i]; // Gán smallest bằng phần tử hiện tại
            } else if (arr[i] < smallest2 && arr[i] != smallest) { // Nếu phần tử hiện tại nhỏ hơn smallest2 và không trùng với smallest
                smallest2 = arr[i]; // Gán smallest2 bằng phần tử hiện tại
            }
        }

        if (smallest2 != Integer.MAX_VALUE) { // Nếu smallest2 đã được thay đổi từ giá trị khởi tạo
            System.out.println("Số nhỏ thứ 2 trong dãy số là: " + smallest2);
        } else {
            System.out.println("Không tìm thấy số nhỏ thứ 2 trong dãy số.");
        }
    }
}
