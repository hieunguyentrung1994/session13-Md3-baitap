package bt01;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArr());

        int[] arr = getArr();
        int maxnumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxnumber) {
                maxnumber = arr[i];
            }
        }
        System.out.println("số nguyên lớn nhất trong mảng là" + maxnumber );
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