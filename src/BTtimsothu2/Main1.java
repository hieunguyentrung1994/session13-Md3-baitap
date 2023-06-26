package BTtimsothu2;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 1, 5, 8, 3, 7, 4};
        int smallest1 = arr[0]; // Số nhỏ nhất
        int Smallest2 = arr[0]; // Số nhỏ thứ hai
        int Smallest3 = arr[0]; // Số nhỏ thứ ba

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest1) {
                Smallest3 = Smallest2; // Gán số nhỏ thứ ba thành số nhỏ thứ hai hiện tại
                Smallest2 = smallest1; // Gán số nhỏ thứ hai thành số nhỏ nhất hiện tại
                smallest1 = arr[i]; // Gán số nhỏ nhất thành phần tử hiện tại
            } else if (arr[i] < Smallest2 && arr[i] != smallest1) {
                Smallest3 = Smallest2; // Gán số nhỏ thứ ba thành số nhỏ thứ hai hiện tại
                Smallest2 = arr[i]; // Gán số nhỏ thứ hai thành phần tử hiện tại
            } else if (arr[i] < Smallest3 && arr[i] != smallest1 && arr[i] != Smallest2) {
                Smallest3 = arr[i]; // Gán số nhỏ thứ ba thành phần tử hiện tại
            }
        }

        if (Smallest3 != arr[0]) {
            System.out.println("Số nhỏ thứ ba trong mảng là: " + Smallest3);
        } else {
            System.out.println("Không tìm thấy số nhỏ thứ ba trong mảng.");
        }
    }
}
