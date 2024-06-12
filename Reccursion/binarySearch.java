package DSA.Reccursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        System.err.println(search(arr, 883, 0, arr.length - 1));
    }

    static int search(int[] arr, int n, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == n) {
            return m;
        }
        if (n < arr[m]) {
            return search(arr, n, s, m - 1);
        }
        return search(arr, n, m + 1, e);
    }
}
