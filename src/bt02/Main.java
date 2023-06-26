package bt02;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArr());

        int[] arr = getArr();
        int minnumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minnumber) {
                minnumber = arr[i];
            }
        }
        System.out.println("sóo nguyên lớn nhất trong mảng là" + minnumber );
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
}