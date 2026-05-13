// package ArrayPractice;

// public class reverse {
//     public static void main(String[] args) {
//         int[] arr = { 25, 76, 87, 43, 12 };
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;

//         }

//     }
// }

package ArrayPractice;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
    }

    static void reverse(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
