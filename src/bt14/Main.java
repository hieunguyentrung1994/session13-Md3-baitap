package bt14;


public class Main {
    public static int binarySearch(int[] array, int target) {
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
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Không tìm thấy " + target + " trong mảng.");
        } else {
            System.out.println("Tìm thấy " + target + " tại vị trí " + result + " trong mảng.");
        }
    }

}
