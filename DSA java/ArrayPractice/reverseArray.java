package ArrayPractice;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

public class reverseArray {

    static void reverseArrayO(int[] arr) {
        // int n = arr.length;
        // int[] temp = new int[n];
        // for (int i = 0; i < n; i++) {
        // temp[i] = arr[n - i - 1];

        // }
        // for (int i = 0; i < n; i++) {
        // arr[i] = temp[i];
        // }

        // int left = 0;
        // int right = arr.length - 1;

        // while (left < right) {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;

        // left++;
        // right--;
        // }

        // import java.util.ArrayList;
        // import java.util.Arrays;
        // import java.util.Collections;
        // import java.util.List;

        // class GfG {

        // // function to reverse an array
        // static void reverseArray(List<Integer> arr) {
        // Collections.reverse(arr);
        // }

        // public static void main(String[] args) {
        // List<Integer> arr =
        // new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));

        // reverseArray(arr);

        // for (int i = 0; i < arr.size(); i++)
        // System.out.print(arr.get(i) + " ");
        // }
        // }

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 7, 8, 9 };
        reverseArrayO(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
