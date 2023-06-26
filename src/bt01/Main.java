public class Main {
    public static void main(String[] args) {
        System.out.println(getArr());

        int[] arr = getArr();
        int number;

        


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