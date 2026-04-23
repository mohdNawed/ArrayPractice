package ArrayPractice;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 20, 40 };
        int target = 21;
        boolean result = linearSearchfun(arr, target);
        System.out.println(result);

    }

    static boolean linearSearchfun(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

}
