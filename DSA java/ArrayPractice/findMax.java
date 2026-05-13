package ArrayPractice;



public class findMax {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 5, 3, 5, 2, 10 };
        int n = arr.length;
        int maxValue = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
    }
}
