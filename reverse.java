package ArrayPractice;

public class reverse {
    public static void main(String[] args) {
        int[] arr = { 25, 76, 87, 43, 12 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }
}
