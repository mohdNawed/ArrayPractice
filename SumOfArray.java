package ArrayPractice;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println(sum);

    }
}

// if you want to multiple all value of array you can change one thing where
// sum=0 that particlar part start from 1 sum=1 same as code that you create for
// sum of array
